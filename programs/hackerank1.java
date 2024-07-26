package programs;

import java.util.Scanner;

public class hackerank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escreva o Texto");
        sc.nextLine();
        String s = sc.nextLine();
        int row = 1;
        while (sc.hasNext()){
            System.out.printf("%d %s",row,sc.next());
            row++;
        }
    }
}
