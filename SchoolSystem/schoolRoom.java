package SchoolSystem;
import java.util.ArrayList;

public class schoolRoom {
    String classNumber;
    int floor;
    String schoolyear;
    ArrayList<teacher> teachers = new ArrayList<>();
    ArrayList<student> students = new ArrayList<student>();

    public schoolRoom(String classNumber,int floor,String schoolyear) {
        this.classNumber = classNumber;
        this.floor = floor;
        this.schoolyear = schoolyear;
    }
}
