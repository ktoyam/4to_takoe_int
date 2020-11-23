package pract21.UIex.Model;


import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class BaseUI {
    private JFileChooser fc;
    private final JFrame frame;
    private JPanel mainPanel;

    private JMenu createFileMenu() {
        JMenu c = new JMenu("File");
        JMenuItem[] menuItems = new JMenuItem[]{new JMenuItem("New"), new JMenuItem("Open"), new JMenuItem("Save"), new JMenuItem("Exit")};
        menuItems[0].addActionListener(e -> setCurrentDocument(getCreateDocument().createNew()));//new
        menuItems[1].addActionListener(e -> {
            var r = fc.showOpenDialog(mainPanel);
            if (r == JFileChooser.APPROVE_OPTION) {
                try {
                    setCurrentDocument(getCreateDocument().openExisting(fc.getSelectedFile().getAbsolutePath()));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });//open
        menuItems[2].addActionListener(e -> {
            var res = fc.showSaveDialog(mainPanel);
            if (res == JFileChooser.APPROVE_OPTION) {
                if(updateCurrentDocument()) {
                    try (FileOutputStream fos = new FileOutputStream(fc.getSelectedFile())) {
                        fos.write(getCurrentDocument().getRaw());
                    } catch (IOException fileNotFoundException) {
                        fileNotFoundException.printStackTrace();
                    }
                }
            }
        });//save
        menuItems[3].addActionListener(e -> System.exit(0));//exit
        for (var b :
                menuItems) {
            c.add(b);
        }
        return c;
    }

    protected abstract JPanel createMainPanel();
    protected abstract ICreateDocument getCreateDocument();
    protected abstract IDocument getCurrentDocument();
    protected abstract void setCurrentDocument(IDocument doc);
    protected abstract boolean updateCurrentDocument();

    protected JFrame getFrame(){
        return frame;
    }

    protected BaseUI(String title){
        frame = new JFrame(title);
    }

    public void show(){
        mainPanel = createMainPanel();
        fc = getCreateDocument().createFileChooser();
        frame.setPreferredSize(new Dimension(400,400));
        JMenuBar jmb = new JMenuBar();
        jmb.add(createFileMenu());
        frame.setJMenuBar(jmb);
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
