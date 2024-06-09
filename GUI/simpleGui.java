package GUI;
import javax.swing.JOptionPane;
public class simpleGui {
    public static void main(String[] args) {
        // JOptionPane GUI showing messages and getting user inputs
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"What's up "+name );

        // String to Integer Parsing
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null,"I see you're "+age+" years old.");

        // String to Double Parsing
        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
        JOptionPane.showMessageDialog(null,"I see you're really tall: "+height);
    }
}
