public class Student {
    int roll_no;
    String name;
    int marks;

    Student(int roll_no, String name, int marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Roll No: "+roll_no);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
