package com.cdac.acts.Student;

import java.util.Scanner;

public class StudentInfo {
    private static Student[] std = new Student[10];
    private static int std_count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Print Student by Roll No");
            System.out.println("3. Print All Students Sorted by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character after nextInt()

            switch (choice) {
                case 1:
                    addStd(sc);
                    break;

                case 2:
                    printstd(sc);
                    break;

                case 3:
                    printAllStudentsSortedByMarks();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void addStd(Scanner sc) {

        if (std_count >= std.length) {
            System.out.println("Cannot add more students. Array is full.");
            return;
        }

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter the marks: ");
        double score = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after nextDouble()

        std[std_count] = new Student(name, rollNo, score);
        std_count++;
        System.out.println("Student added successfully");
    }

    private static void printstd(Scanner sc) {

        System.out.print("Enter the roll number: ");
        int rollnu = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()
        boolean found = false;

        for (int i = 0; i < std_count; i++) {
            if (std[i].getRollNo() == rollnu) {
                System.out.println(std[i]); // Assuming Student class has a proper toString() method
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Roll No " + rollnu + " not found.");
        }
    }

    private static void printAllStudentsSortedByMarks() {
        if (std_count == 0) {
            System.out.println("No students to display.");
            return;
        }

        // Create a copy of the current students
        Student[] sortedStudents = new Student[std_count];
        System.arraycopy(std, 0, sortedStudents, 0, std_count);

        // Sort the students by marks in descending order
        Arrays.sort(sortedStudents, (s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("Students sorted by marks (highest to lowest):");
        for (Student student : sortedStudents) {
            System.out.println(student); // Assuming Student class has a proper toString() method
        }
    }
}
