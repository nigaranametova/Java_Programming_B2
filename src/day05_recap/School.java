package day05_recap;

public class School {

    public static void main(String [] args){

        int numberOfStudentsInGrade1 = 32;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 26;
        int numberOfStudentsInGrade4 = 12;
        int numberOfStudentsInGrade5 = 38;

        //How can I calculate the total number of students?
        //int totalNumberOfStudents = 31 + 40 + 26 + 10 + 38;

        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        double numberOfDaysInAYear = 100.5;
        double numberOfSnowDaysInAYear = 10;
        double averageGPAInASchool = 3.5;

        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade 5: " + numberOfStudentsInGrade5);

        //System.out.println("Total Number of Students: " + numberOfStudentsInGrade1 + numberOfStudentsInGrade2);
        System.out.println("Total Number of Students: " + totalNumberOfStudents);
        System.out.println("Number of Dats in a Year:" + numberOfDaysInAYear);

        // variableName.sout
        //System.out.println(NumberOfSnowDaysInAYear);
        // variableName.soutv
        System.out.println("Number Of Snow Days in a Year: " + numberOfSnowDaysInAYear);
        System.out.println("Average GPA In School: " + averageGPAInASchool);
    }
}
