public class Employeesal {
    private int id;
    private String name;
    private double salary;

    public Employeesal(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void raisesalary(double percent) {
        if (percent > 0) {
            double raiseamount = salary * (percent / 100);
            salary += raiseamount;
            System.out.println(name+"salary raised by"+percent+"%\n Newsalary:$"+salary);
        } 
        else {
            System.out.println("Invalid percentage Salary remains unchanged");
        }

    }

    public void EmployeeDetails()
    {
        System.out.println("Employee ID"+id+"\n Name"+name+"\n Salary:"+salary);
    }

}
