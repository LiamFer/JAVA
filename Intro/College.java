package Intro;
import java.util.ArrayList;

public class College {
    public static void main(String[] args) {

        // Criando a Escola
        School school = new School("Cambridge");

        // Criando o Array de Notas do primeiro estudante
        ArrayList<Float> studentGrade1 = new ArrayList<Float>();
        studentGrade1.add(7.6F);
        studentGrade1.add(8.45F);
        studentGrade1.add(9.89F);
        Student student1 = new Student("Ryan",true,19,studentGrade1);

        // Criando o Array de Notas da segunda estudante
        ArrayList<Float> studentGrade2 = new ArrayList<Float>();
        studentGrade2.add(9.6F);
        studentGrade2.add(4.45F);
        studentGrade2.add(6.23F);
        Student student2 = new Student("Viserys",false,120,studentGrade2);

        school.addStudent(student1);
        school.addStudent(student2);

        school.printAllStudents();
    }
}
