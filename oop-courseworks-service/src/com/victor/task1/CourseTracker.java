package com.victor.task1;

/**
 * COURSE CODE: BIT2115 - OOP / JAVA VARIABLE TYPES
 * STUDENT: Kambale Mbakulirahi Victor (ID: 24/2018/BSSE-S)
 * DESCRIPTION: University enrollment tracker showcasing variable scopes.
 */
public class CourseTracker {

    // 1. STATIC VARIABLE: Shared across all objects (University-wide statistics)
    public static int totalStudentsRegistered = 0;

    // 2. INSTANCE VARIABLES: Unique to each course object
    private String courseName;
    private int enrolledStudents;

    // Constructor to initialize instance variables and update global static state
    public CourseTracker(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        // Modifying static variable tracks students globally across all objects
        totalStudentsRegistered += enrolledStudents;
    }

    // Method demonstrating local variable usage and temporary processing
    public void displayStatistics(int presentCount, double rawPassRate) {
        // 3. LOCAL VARIABLES: Exist only within this method block
        double averageAttendance = ((double) presentCount / this.enrolledStudents) * 100;
        double finalPassPercentage = rawPassRate * 100;

        // Print individual object statistics
        System.out.println("__________________________________________________");
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Students Enrolled: " + this.enrolledStudents);
        System.out.printf("Temporary Calc - Avg Attendance: %.2f%%\n", averageAttendance);
        System.out.printf("Temporary Calc - Pass Percentage: %.2f%%\n", finalPassPercentage);
    }

    public static void main(String[] args) {
        System.out.println("IUEA COURSE ENROLLMENT TRACKER SYSTEM\n");

        // Requirement: Create at least three course objects
        CourseTracker course1 = new CourseTracker("Software Architecture (BSSE)", 45);
        CourseTracker course2 = new CourseTracker("Mobile Computing (BIT)", 60);
        CourseTracker course3 = new CourseTracker("Data Science (BSCS)", 35);

        // Display individual course statistics with temporary calculations
        course1.displayStatistics(40, 0.88);
        course2.displayStatistics(55, 0.92);
        course3.displayStatistics(30, 0.85);

        // Requirement: Display university-wide statistics using the shared static variable
        System.out.println("__________________________________________________");
        System.out.println("UNIVERSITY-WIDE STATISTICS:");
        System.out.println("Total Students Registered Across All Courses: " + CourseTracker.totalStudentsRegistered);
        System.out.println("__________________________________________________");
    }
}

// ===> END ✅ <=== //
