package pract14;

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

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)) return false;
        var t = (Student)obj;
        return this.getIdNumber() == t.getIdNumber() && this.getGPA() == t.getGPA();
    }

    private static void quickSortById_r(Student[] array, int low, int high){
        if(array.length == 0 || low>=high) return;
        var middle = array[low+(high-low)/2].getIdNumber();
        int i = low, j = high;
        while(i <= j){
            while(array[i].getIdNumber() < middle) i++;
            while(array[j].getIdNumber() > middle) j--;
            if(i<=j){
                var t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
                t = null;
            }
        }
        if (low<j) quickSortById_r(array, low, j);
        if(high>i) quickSortById_r(array, i, high);
    }
    public static void quickSortById(Student[] array){
        quickSortById_r(array, 0, array.length-1);
    }

    public static Student SearchByIdLinear(Student[] array, int idNumberForSearch){
        for(int i = 0;i < array.length; i++){
            if(array[i].getIdNumber() == idNumberForSearch) return array[i];
        }
        return null;
    }

    public static Student BinarySearchById(Student[] array, int idNumberForSearch){
        int firstI = 0;
        int lastI = array.length-1;
        int middleI;
        while(firstI<=lastI){
            middleI = (firstI + lastI)/2;
            if(array[middleI].getIdNumber() == idNumberForSearch){
                return array[middleI];
            }
            else if(array[middleI].getIdNumber() < idNumberForSearch) firstI = middleI+1;
            else lastI = middleI-1;
        }
        return null;
    }
}
