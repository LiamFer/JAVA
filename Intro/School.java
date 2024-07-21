package Intro;
import java.util.ArrayList;

public class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<Student>();

    School(String schoolName) {
        schoolName = schoolName;
    }

    void addStudent(Student student){
        students.add(student);
    }

    void printAllStudents(){
        for(Student student : students){
            System.out.printf("Name: %s\nAVG Grade: %f\n\n",student.name,student.getAverageGrade());
        }
    }
}
