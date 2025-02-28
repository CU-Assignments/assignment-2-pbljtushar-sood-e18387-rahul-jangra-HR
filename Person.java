// Abstract class Person
abstract class Person {
    // Common attributes
    private String name;
    private int age;

    // Constructor to initialize Person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for Person attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to display details (must be implemented by subclasses)
    public abstract void displayDetails();
}

// Derived class Student extending Person
class Student extends Person {
    private int rollNumber;

    // Constructor to initialize Student details
    public Student(String name, int age, int rollNumber) {
        super(name, age); // Call the constructor of the Person class
        this.rollNumber = rollNumber;
    }

    // Getter method for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Overriding displayDetails to show student details
    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class Teacher extending Person
class Teacher extends Person {
    private String subject;

    // Constructor to initialize Teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the constructor of the Person class
        this.subject = subject;
    }

    // Getter method for subject
    public String getSubject() {
        return subject;
    }

    // Overriding displayDetails to show teacher details
    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Creating instances of Student and Teacher
        Student student = new Student("John Doe", 20, 101);
        Teacher teacher = new Teacher("Dr. Smith", 45, "Mathematics");

        // Displaying details of the student and teacher
        student.displayDetails();
        teacher.displayDetails();
    }
}
