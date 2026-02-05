
package com.student.skmotors;

import java.util.Scanner;

public class MultiGradingSystem {
    public static void main(String[] args) {
        // Arrays to store student information
        try (Scanner scanner = new Scanner(System.in)) {
            // Arrays to store student information
            String[] studentNames = new String[5];
            int[] studentScores = new int[5];
            String[] studentGrades = new String[5];
            String[] studentRemarks = new String[5];
            
            int studentCount = 0;
            
            System.out.println("=== STUDENT GRADING SYSTEM ===");
            System.out.println("Enter details for 5 students\n");
            
            // Process 5 students using a while loop
            while (studentCount < 5) {
                System.out.println("\n--- Student " + (studentCount + 1) + " ---");
                
                // Get student name
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                studentNames[studentCount] = name;
                
                // Get student score with validation
                int score;
                while (true) {
                    System.out.print("Enter score (0-100): ");
                    score = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    if (score >= 0 && score <= 100) {
                        studentScores[studentCount] = score;
                        break;
                    } else {
                        System.out.println("Invalid score! Please enter a value between 0 and 100.");
                    }
                }
                
                // Determine grade and remark
                String grade;
                String remark;
                
                if (score >= 80 && score <= 100) {
                    grade = "1";
                    remark = "D1";
                } else if (score >= 75 && score <= 79) {
                    grade = "2";
                    remark = "D2";
                } else if (score >= 66 && score <= 74) {
                    grade = "3";
                    remark = "C3";
                } else if (score >= 60 && score <= 65) {
                    grade = "4";
                    remark = "C4";
                } else if (score >= 50 && score <= 59) {
                    grade = "5";
                    remark = "C5";
                } else if (score >= 45 && score <= 49) {
                    grade = "6";
                    remark = "C6";
                } else if (score >= 35 && score <= 44) {
                    grade = "7";
                    remark = "P7";
                } else if (score >= 30 && score <= 34) {
                    grade = "8";
                    remark = "P8";
                } else {
                    grade = "9";
                    remark = "F";
                }
                
                studentGrades[studentCount] = grade;
                studentRemarks[studentCount] = remark;
                
                System.out.println("✓ Record saved: " + name + " - " + score + " marks");
                studentCount++;
            }
            
            // Display the table
            System.out.println("\n" + "=".repeat(60));
            System.out.println("                    STUDENT GRADING REPORT");
            System.out.println("=".repeat(60));
            System.out.printf("%-5s %-20s %-10s %-8s %-10s%n",
                    "No.", "Student Name", "Marks", "Grade", "Remark");
            System.out.println("-".repeat(60));
            
            // Display each student's information
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-5d %-20s %-10d %-8s %-10s%n",
                        (i + 1),
                        studentNames[i],
                        studentScores[i],
                        studentGrades[i],
                        studentRemarks[i]);
            }
            
            System.out.println("=".repeat(60));
        }
    }
}
