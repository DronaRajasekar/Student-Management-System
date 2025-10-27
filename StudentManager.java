import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student added successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🎓 Found: " + s);
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }
}
