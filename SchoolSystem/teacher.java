package SchoolSystem;

public class teacher extends employee{
    String subject;

    // Class constructor
    public teacher(String firstname,String lastname, int age, int birthyear){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.birthyear = birthyear;
        buildUser();
    }

}
