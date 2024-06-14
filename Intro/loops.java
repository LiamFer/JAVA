package Intro;
import java.util.Scanner;

public class loops {

    static boolean getAnswer(String k) {
        System.out.println(k);
        return k.equals("Y") || k.equals("y");
    }

    public static void main(String[] args) {
        // Multiplication table with criteria
        Scanner sc = new Scanner(System.in);
        boolean keepGenerating;
        do {
            System.out.println("You want to see the multiplication table from one to....");
            float times = sc.nextFloat();
            for (float i = 1.0f;i <= times;i++){
                for (float x = 1.0f;x <= 10.0f;x++){
                    float j = i*x;
                    if(j%5==0){
                        System.out.print(j+"* ");
                    } else {
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
            System.out.println("Do you want to generate another table? (Y/N)");
            keepGenerating = getAnswer(sc.next());
        } while (keepGenerating);


    }
}
