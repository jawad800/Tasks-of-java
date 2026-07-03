import java.util.ArrayList;
import java.util.Scanner;
// question number 5
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    public static void main(String[] args) {

    }
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public void dropStudent(String student) {
        students.remove(student);
    }
    public ArrayList<String> getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getCourseName() {
        return courseName;
    }
    public void clear() {
        students.clear();
    }
}
