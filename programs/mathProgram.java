package programs;
import java.util.Scanner;

public class mathProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean go = true;

        // Calculating the slope-intercept form of a linear equation using a do While loop
        // The equation is y=mx+b
        do{
          double m,x,b,y;
          System.out.println("Please type the slope");
          m = scan.nextDouble();
          System.out.println("Please type the independent variable");
          x = scan.nextDouble();
          System.out.println("Please type the y-intercept");
          b = scan.nextDouble();
          y = m*x + b;
          System.out.println("The slope-intercept form of your linear equation is " + y);
          System.out.println("Do you wish to calculate another slope-intercept?");
          go = scan.nextBoolean();
          if(!go){
              System.out.println("Exiting the program.....");
          }
        } while(go);

    }
}
