package SchoolSystem;

public class mainProgram {
    public static void main(String[] args) {

        teacher person = new teacher("William","fernandes",19,2004);
        student aluno1 = new student("Agatha","Tarbino",19);
        student aluno2 = new student("John","Michael",20);

        schoolRoom room = new schoolRoom("Sala 1",1,"3 Ano do Ensino Médio");

        room.students.add(aluno1);
        room.students.add(aluno2);

        person.applyExam(room);
        person.applyExam(room);
        person.checkGrades(aluno1);
        aluno1.checkGrades();
    }
}
