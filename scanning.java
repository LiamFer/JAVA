import java.util.Scanner;
public class scanning {
    public static void main(String[] args) {
        // Scanner OBJ
        Scanner scan = new Scanner(System.in);

        // Reading a String
        System.out.print("What is your name - ");
        String name = scan.nextLine();
        System.out.println("As it seems your name is " + name);

        // Reading an Integer
        System.out.println("How old are you "+name+" ?");
        int age = scan.nextInt();
        System.out.println("I see you're " + age + " years old");

        // Here we might have a problem trying to read Text again if we don't clear our Scanner
        // Cleaning the Scanner
        scan.nextLine();
        // Asking more Stuff
        System.out.println("Who's your favorite hero?");
        String hero = scan.nextLine();
        System.out.println(hero+" is my favorite hero!");
    }
}
