package pract19;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class iHateThisGuiEditor {
    private JPanel mainPanel;
    private JTextField queryTextField;
    private JTable tableStudents;
    private JScrollPane studentsPane;
    TableRowSorter<StudentsTableModel> tr;

    public iHateThisGuiEditor() {
        createTable();
        createSorter();
        queryTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                tr.setRowFilter(RowFilter.regexFilter(queryTextField.getText()));
                super.keyReleased(e);
            }
        });
    }

    private void createTable(){
        tableStudents.setModel(new StudentsTableModel(createDefaultStudentsData()));
    }

    private void createSorter(){
        tr = new TableRowSorter<>((StudentsTableModel) tableStudents.getModel());
        tableStudents.setRowSorter(tr);
    }

    private ArrayList<Student> createDefaultStudentsData(){
        ArrayList<Student> r = new ArrayList<>();
        r.add(new Student(0,1,"Dvorcov", "Uriy"));
        r.add(new Student(0,1.4,"Tipov", "Radmir"));
        r.add( new Student(0,4.2,"Cirik", "Lev"));
        r.add(new Student(0,7.2,"Qwerty", "Zxc"));
        r.add(new Student(0,1.488,"Kto", "Ya"));
        return r;
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Students table");
                frame.setContentPane(new iHateThisGuiEditor().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

class StudentsTableModel extends AbstractTableModel{
    private String[] columnNames = {"Surname","Name","GPA"};
    private ArrayList<Student> myList;
    public StudentsTableModel(ArrayList<Student> bkList) {
        myList = bkList;
    }
    public int getColumnCount() {
        return columnNames.length;
    }
    public int getRowCount() {
        int size;
        if (myList == null) {
            size = 0;
        }
        else {
            size = myList.size();
        }
        return size;
    }
    public Object getValueAt(int row, int col) {
        Object temp = null;
        if (col == 0) {
            temp = myList.get(row).getSurname();
        }
        else if (col == 1) {
            temp = myList.get(row).getName();
        }
        else if (col == 2) {
            temp = myList.get(row).getGPA();
        }
        return temp;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Class getColumnClass(int col) {
        if (col == 2) {
            return Double.class;
        }
        else {
            return String.class;
        }
    }
}
