// Hierarchical Inheritance example
// Employee class definition
class Employee {
    // Field for employee ID
    int empId;

    // Method to display employee ID
    void displayEmpId() {
        System.out.println("Employee ID: " + empId);
    }
}

public class ContractEmployee extends Employee {
    // Fields specific to ContractEmployee
    int contractPeriod;    // Duration of the contract period in months
    int privillageLeaves;  // Number of privilege leaves
    int workingDays;       // Number of working days in the contract period

    // Method to display ContractEmployee information
    void ContractEmpInfo() {
        System.out.println("Contract employee Details: " + contractPeriod + ", " + privillageLeaves + ", " + workingDays);
    }

    public static void main(String[] args) {
        // Create an instance of ContractEmployee
        ContractEmployee emp = new ContractEmployee();

        // Set values for the employee
        emp.empId = 1234;            // Assuming empId is defined in the Employee class
        emp.workingDays = 350;       // Set the number of working days
        emp.contractPeriod = 12;     // Set the contract period in months
        emp.privillageLeaves = 10;   // Set the number of privilege leaves
        
        // Call the method to display the employee details
        emp.ContractEmpInfo();
    }
}
