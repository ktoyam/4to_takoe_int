package pract21.UIex.TextEditor;

import pract21.UIex.Model.BaseUI;
import pract21.UIex.Model.IDocument;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class TextEditorUI extends BaseUI {
    private TextDocument currentDoc;
    private final CreateTextDocument docFab;
    private final JTextArea text;
    private final JScrollPane textScrollPane;

    public TextEditorUI() {
        super("Text editor");
        currentDoc = null;
        docFab = new CreateTextDocument();
        text = new JTextArea();
        text.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textScrollPane = new JScrollPane(text,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        textScrollPane.setVisible(false);
    }

    @Override
    protected JPanel createMainPanel() {
        var jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(textScrollPane, BorderLayout.CENTER);
        return jp;
    }

    @Override
    protected CreateTextDocument getCreateDocument() {
        return docFab;
    }

    @Override
    protected TextDocument getCurrentDocument() {
        return currentDoc;
    }

    @Override
    protected boolean updateCurrentDocument() {
        if(currentDoc == null) return false;
        currentDoc.setContent(Arrays.asList(text.getText().split("\n")));
        return true;
    }

    @Override
    protected void setCurrentDocument(IDocument doc) {
        currentDoc = (TextDocument) doc;
        if (currentDoc.getFileSize() > 0)
            text.setText(String.join("\n", currentDoc.getContent()));
        else {
            text.setText("");
        }
        textScrollPane.setVisible(true);
        SwingUtilities.updateComponentTreeUI(getFrame());
    }
}
