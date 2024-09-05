/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listmain3;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    static String university = "ULAB University"; 
    static int count = 0; 

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        count++; 
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static String getUniversity() {
        return university;
    }

    public static int getCount() {
        return count;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + count);
    }
}

public class Listmain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Student[] studentArray = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input id, name, department, and cgpa for student " + (i + 1));
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            String department = scanner.nextLine();
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            studentArray[i] = new Student(id, name, department, cgpa);
        }

        System.out.println("Array:");
        for (Student student : studentArray) {
            student.displayStudentDetails();
            System.out.println();
        }

        
        List<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Input id, name, department, and cgpa for student " + (i + 1));
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            String department = scanner.nextLine();
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            studentArrayList.add(new Student(id, name, department, cgpa));
        }

        System.out.println("ArrayList:");
        for (Student student : studentArrayList) {
            student.displayStudentDetails();
            System.out.println();
        }

        
        List<Student> studentLinkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Input id, name, department, and cgpa for student " + (i + 1));
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            String department = scanner.nextLine();
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            studentLinkedList.add(new Student(id, name, department, cgpa));
        }

        System.out.println("LinkedList:");
        for (Student student : studentLinkedList) {
            student.displayStudentDetails();
            System.out.println();
        }

        Student.displayTotalStudents();
    }
}
