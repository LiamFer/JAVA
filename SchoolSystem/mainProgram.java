package SchoolSystem;

public class mainProgram {
    public static void main(String[] args) {

        teacher person = new teacher("William","fernandes",19,2004);
        person.addExtraInfo();
        System.out.println(person.address);
        System.out.println(person.married ? "Married" : "Unmarried");
        System.out.println(person.phone);
    }
}
