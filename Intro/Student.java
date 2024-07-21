package Intro;
import java.util.ArrayList;

public class Student {
    String name;
    int age;
    ArrayList<Float> grades;
    boolean gender; // 1 for Male 0 for Female

    // Construtor
    Student(String name,boolean gender, int age, ArrayList<Float> grades){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grades = grades;
    }

    Float getAverageGrade(){
        Float averageGrade = 0.f;
        // For grade IN grades
        for(Float grade : grades){
            averageGrade += grade;
        }
        return averageGrade/grades.size();
    }

    String showInfo(){
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAVG Grade: " + getAverageGrade();
    }
}
