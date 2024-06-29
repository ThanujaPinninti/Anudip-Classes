/*  1. Write a program using different access specifiers for declaring the variables.
   public, private, protected and default.  */
public class CollegeApplication {
    public String studentName; // Public: It variable accessible from anywhere
    private int studentId; // Private: It variable accessible only within the class
    protected double gpa; // Protected: It variable accessible within the same package and by subclasses
    String major; // Default: It variable accessible within the same package
    
    // Constructor
    public CollegeApplication(String name, int id, double gpa, String major) {
        this.studentName = name;
        this.studentId = id;
        this.gpa = gpa;
        this.major = major;
    }
    
    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
    
    public static void main(String[] args) {
        // Creating an instance of CollegeApplication
        CollegeApplication application = new CollegeApplication("THANUJA", 036, 9.04, "MCA");
        
        // Accessing and displaying student information
        application.displayStudentInfo();
    }
}
            /*output */
/*
PS E:\Programming\anudip> javac CollegeApplication.java
PS E:\Programming\anudip> java CollegeApplication      
Student Name: THANUJA
Student ID: 30
GPA: 9.04
Major: MCA
PS E:\Programming\anudip>
 */