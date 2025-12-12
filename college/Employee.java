public class Employee {
    public static void main(String[] args) {
        employeesal employee=new employeesal(1,"Rohan", 5000);

        System.out.println("Initial employee details\n");
        employee.employeedetails();
        employee.raiseSalary(30);
        System.out.println("employee details after raising salary:\n");
        employee.employeedetails();
    }

}
