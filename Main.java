// Abstract class showing Abstraction
abstract class Student {
    // Encapsulation: private fields
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Abstract method (Abstraction)
    public abstract void study();

    // Common method (can be overridden)
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

// Subclass demonstrating Inheritance and Polymorphism
class EngineeringStudent extends Student {
    private String branch;

    public EngineeringStudent(String name, int age, String studentId, String branch) {
        super(name, age, studentId);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Method overriding (Polymorphism)
    @Override
    public void study() {
        System.out.println(getName() + " is studying engineering concepts.");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Branch: " + branch);
    }
}

// Main class to run
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Parent class reference, child class object
        Student student = new EngineeringStudent("Bhavneet", 21, "ENG123", "Computer Science");

        student.study();          // Calls overridden method
        student.printDetails();   // Calls overridden method with super
    }
}
