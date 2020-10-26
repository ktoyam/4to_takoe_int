package pract13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGPA()<o2.getGPA()) return -1;
        else if(o1.getGPA() == o2.getGPA()) return 0;
        else return 1;
    }

    private static void quickSortByGPA_r(Student[] array, int low, int high){
        if(array.length == 0 || low>=high) return;
        var middle = array[low+(high-low)/2].getGPA();
        int i = low, j = high;
        while(i <= j){
            while(array[i].getGPA() < middle) i++;
            while(array[j].getGPA() > middle) j--;
            if(i<=j){
                var t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
                t = null;
            }
        }
        if (low<j) quickSortByGPA_r(array, low, j);
        if(high>i) quickSortByGPA_r(array, i, high);
    }
    public static void quickSortByGPA(Student[] array){
        quickSortByGPA_r(array, 0, array.length-1);
    }

    public static Student[] MergeAndSort(Student[] array1, Student[] array2){
        Student[] res = new Student[array1.length+ array2.length];
        int i;
        for(i = 0;i<array1.length;i++) res[i] = array1[i];
        for(int j = 0; j<array2.length;j++,i++) res[i] = array2[j];
        quickSortByGPA(res);
        return res;
    }
}
