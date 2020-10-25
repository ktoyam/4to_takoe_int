package pract13;

import java.util.Comparator;
import java.util.List;

public class Student {
    private int idNumber;
    private double gpa;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public static void SortByID(List<Student> studentList){
        studentList.sort(Comparator.comparing(Student::getIdNumber));
    }

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                '}';
    }
}
