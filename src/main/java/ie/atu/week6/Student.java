package ie.atu.week6;

public class Student {
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    public Student(String name, String email, String course){
        this.studentName = name;
        this.studentEmail = email;
        this.studentCourse = course;
    }

    //Getter for student info
    public void getInfo(){
        System.out.println("Student, Name: " + studentName + " Email: " + studentEmail + " Course: " + studentCourse);
    }
}
