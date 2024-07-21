package Intro;

public class Person {
    String name;
    int age;
    String role;

    // Construtor
    Person(String name,int age,String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }

    void getInfo(){
        System.out.printf("Name: %s\nAge: %d\nRole: %s\n",name,age,role);
    }
}
