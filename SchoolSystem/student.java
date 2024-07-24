package SchoolSystem;

import java.util.ArrayList;

public class student extends employee{
    ArrayList<test> exams = new ArrayList<test>();

    student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    void checkGrades(){
        for(test exam : exams){
            System.out.printf("\nTest Name: %s\nGrade: %f\nApplied By: %s\nCorrected By: %s\n----------------------\n",
                    exam.testSubject,exam.grade,exam.appliedBy,exam.correctedBy != null ? exam.correctedBy : "-");
        }

    }
}
