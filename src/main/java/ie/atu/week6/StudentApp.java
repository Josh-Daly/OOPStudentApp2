//Paul Daly, OOP Lab 3, StudentApp recreated + Homework from Lab 4


package ie.atu.week6;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);

        System.out.println("How many students do you want to enter details for? ");
        int count = scan1.nextInt();

        scan1.nextLine(); //Fixes scannerSkip issue

        //Student details section
        int i = 0;
        while(i < count){
            System.out.println("Please enter name: ");
            String nameTemp = scan1.nextLine();
            System.out.println("Please enter email: ");
            String emailTemp = scan1.nextLine();
            System.out.println("Please enter course: ");
            String courseTemp = scan1.nextLine();

            Student studentTemp = new Student(nameTemp, emailTemp, courseTemp);
            students.add(studentTemp);
            i++;
        }

        System.out.println("Student List (" + count + " students): ");
        for (Student s : students){
            s.getInfo();
        }
    }
}
