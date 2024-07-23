package SchoolSystem;

import java.util.ArrayList;

public class student extends employee{
    ArrayList<test> exams = new ArrayList<test>();

    student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}
