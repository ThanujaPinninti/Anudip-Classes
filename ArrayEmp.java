/*Write a program to create a array of Employee objects, initialize and print employee objects.*/
class Employee {
    private int empId;
    private String name;
    private String department;
    private int salary;

    // Constructor
    public Employee(int empId, String name, String department, int salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // toString method to print Employee details
    @Override
    public String toString() {
        return "ID: " + empId + ", Employer Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class ArrayEmp {
    public static void main(String[] args) {
        // an array of Employee objects
        Employee[] employees = new Employee[4];

        // Initialize
        employees[0] = new Employee(1, "Thanuja", "Engineering", 75000);
        employees[1] = new Employee(2, "Sanjay", "Marketing", 65000);
        employees[2] = new Employee(3, "Lovely", "Sales", 70000);
        employees[3] = new Employee(4, "Shivarjun", "HR", 80000);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
