package pract13;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[]{
                new Student(0, 2.8),
                new Student(1, 3.25),
                new Student(2, 3.2499),
                new Student(3, 4.0),
                new Student(4, 3.3)
        };

        System.out.println("Before sort:");
        for (var s: st
        ) {
            System.out.println(s.toString());
        }

        SortingStudentsByGPA.quickSortByGPA(st);

        System.out.println("Before sort:");
        for (var s: st
             ) {
            System.out.println(s.toString());
        }
    }
}
