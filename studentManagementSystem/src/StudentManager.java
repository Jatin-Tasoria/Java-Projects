import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students =new ArrayList<>();

    //Adding Students
    void addStudent(Student S){
        students.add(S);
        System.out.println("Student added successfully");
    }

    //Displaying Students
    void display(){
        if(students.isEmpty()){
            System.out.println("No student in the list");
        } else {
            for(Student s :students){
                s.display();
            }
        }
    }

    //Searching the student
    void searchStudent(int roll_no){
        for(Student s :students){
            if(s.roll_no ==roll_no){
                s.display();
                return;
            } else {
                System.out.println("Student Not Found");
                return;
            }
        }
    }

    //Calculating Average
    void average(){
        if (students.isEmpty()) {
            System.out.println("⚠ No students available");
            return;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        double avg = sum / students.size();
        System.out.println("Average Marks: " + avg);
    }
}
