public class Employee {
    public static void main(String[] args) {
        Employeesal employee = new Employeesal(1,"vishal",5000);
        System.out.println("Initial employee details:");
        employee.EmployeeDetails();
        employee.raisesalary(30);
        System.out.println("Employee details after raise salary");
        employee.EmployeeDetails();
    }

}
