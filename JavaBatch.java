class StudentClass {
    int id;
    String name;
    int age;

    // Constructor to initialize the student object
    public StudentClass(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method to provide a custom string representation of the student object
    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class JavaBatch {
    public static void main(String[] args) {
        // Array to hold up to 20 StudentClass objects
        StudentClass[] students = new StudentClass[20];

        // Initializing the first 5 elements of the array with student objects
        students[0] = new StudentClass(1, "thanu", 21);
        students[1] = new StudentClass(2, "arjun", 22);
        students[2] = new StudentClass(3, "sanjay", 21);
        students[3] = new StudentClass(4, "Ananaya", 21);
        students[4] = new StudentClass(5, "Upender", 21);

        // Printing the first 5 student objects using a traditional for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }

        // Printing all non-null student objects in the array using an enhanced for loop
        for (StudentClass student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
