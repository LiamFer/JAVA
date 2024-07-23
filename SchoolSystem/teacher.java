package SchoolSystem;

import java.util.Scanner;

public class teacher extends employee{
    String subject;

    // Class constructor
    public teacher(String firstname,String lastname, int age, int birthyear){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.birthyear = birthyear;
        // Gerando o e-mail e ID para o professor
        buildUser();
    }

    void applyExam(schoolRoom room){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the exam subject?");
        test exam = new test(scan.nextLine(),String.format("%s %s",this.firstname,this.lastname));
        for (student k : room.students){
            k.exams.add(exam);
        }
        System.out.println("Exam applied for all students in this Classroom!");
    }

    void correctExam(test exam){
        Scanner scan = new Scanner(System.in);
        System.out.println("What grade will you give for this test?");
        exam.grade = scan.nextFloat();
        exam.correctedBy = String.format("%s %s", this.firstname,this.lastname);
    }

}
