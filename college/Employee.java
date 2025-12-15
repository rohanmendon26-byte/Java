public class Employee {
    public static void main(String[] args) {
       employeesal employee=new employeesal(1, "vishal", 5000);
       System.out.println("inital Employee details:");
       employee.employeedetails();
       employee.raiseSalary(30);
       System.out.println("After changing Employee details:");
       employee.employeedetails();
    }

}
