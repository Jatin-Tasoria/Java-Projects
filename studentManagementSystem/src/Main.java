import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        StudentManager manager = new StudentManager();
        int choice;
        boolean isRunning = true;

        do{
            System.out.println("===========================");
            System.out.println("      Student Manager      ");
            System.out.println("===========================");
            System.out.println("1.Add new Student");
            System.out.println("2.Display all Students");
            System.out.println("3.Search Student by Roll no");
            System.out.println("4.Calculate average marks");
            System.out.println("5.Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> addStudent(manager);
                case 2 -> manager.display();
                case 3 -> {
                    System.out.print("Enter Roll no: ");
                    int roll = scanner.nextInt();
                    manager.searchStudent(roll);
                }
                case 4 -> manager.average();
                case 5 -> isRunning = false;
                default -> System.out.println("Entered Wrong Choice");
            }
        } while (isRunning);
        scanner.close();
    }
    static void addStudent(StudentManager manager) {
        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();

        scanner.nextLine(); // consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        Student s = new Student(roll, name, marks);
        manager.addStudent(s);
    }
}
