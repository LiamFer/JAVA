package Intro;

public class OOP {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.drive();
        System.out.println(mycar.model);
        System.out.println(mycar.color);

        Person myself = new Person("William",19,"Developer");
        System.out.println(myself.name);
        myself.getInfo();
        myself.name = "Liam";
        myself.getInfo();
    }
}
