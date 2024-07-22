package SchoolSystem;

import java.util.Scanner;

public class employee {
    String firstname;
    String lastname;
    String id;
    int age;
    int birthyear;
    boolean married;
    String address;
    String email;
    String phone;

    // Static pra conseguir acompanhar quantas pessoas foram criadas e ter os e-mails (Não sei se é o melhor jeito)
    static int users = 0;

    void buildUser(){
        // Função pra gerar o e-mail e o número de Identificação da pessoa
        this.id = Integer.toString(users);
        users++;

        // Assim consigo gerar um e-mail unico pra cada pessoa mesmo que tenham o nome repetido
        this.email = String.format("%s.%s%s@email.com",firstname.replace(" ",""),
                lastname.replace(" ",""),id);
    }

    // Função pra adicionar informações extras do funcionário/estudante
    void addExtraInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you married? ");
        this.married = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Where do you live?");
        this.address = scan.nextLine();
        System.out.println("What's your phone number?");
        this.phone = scan.nextLine();
    }



}
