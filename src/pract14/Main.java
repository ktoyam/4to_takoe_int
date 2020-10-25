package pract14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Student> arrayForL = new ArrayList<Student>();
        var r = new Random(42);
        int arraysSize = 10000000;
        Student[] arrayForL = new Student[arraysSize];
        Student[] arrayForB = new Student[arrayForL.length];
        for (int i = 0; i < arrayForL.length; i++) {
            arrayForL[i] = new Student(i,r.nextDouble());
        }
        Collections.shuffle(Arrays.asList(arrayForL));
        System.arraycopy(arrayForL, 0, arrayForB, 0, arrayForL.length);
        int searchingForId = r.nextInt(arrayForL.length-1);
        long zerotime = System.nanoTime();
        var t1 = Student.SearchByIdLinear(arrayForL, searchingForId);
        long execTime = System.nanoTime()-zerotime;
        System.out.println("Linear search done in " + execTime + "ns. Performance: O(n)");

        long zerotime2 = System.nanoTime();
        Student.quickSortById(arrayForB);
        long execTime2 = System.nanoTime()-zerotime2;
        zerotime = System.nanoTime();
        var t2 = Student.BinarySearchById(arrayForB, searchingForId);
        execTime = System.nanoTime() - zerotime;
        System.out.println("Binary search done in " + execTime + "ns with quick sort(done in "+execTime2+"ns). Performance: O(log(n))");
        if(!t1.equals(t2)) System.out.println("Something wrong..");
    }
}
