package pract19;

import java.util.Comparator;
import java.util.List;

public class Student {
    private int idNumber;
    private double gpa;
    private String surname;
    private String name;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Student(int idNumber, double gpa, String surname, String name) {
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", gpa=" + gpa +
                '}';
    }
}
