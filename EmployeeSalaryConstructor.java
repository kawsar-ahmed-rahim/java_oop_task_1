// 5.Create an Employee class with fields: name, designation, and salary.

// Assign values directly in main.

// Write a method increaseSalary() to add a given amount to salary.

// Display updated salary.

// use constructor

class Employee {
    String name;
    String designation;
    double salary;

    Employee(String name,
            String designation,
            double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void increaseSalary(double amount) {
        salary += amount;
    }
}

public class EmployeeSalaryConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", "Software Engineer", 40000);

        System.out.println("Before increment, salary: " + emp.salary);

        emp.increaseSalary(5000);

        System.out.println("Name: " + emp.name);
        System.out.println("Designation: " + emp.designation);
        System.out.println("Updated salary: " + emp.salary);
    }
}
