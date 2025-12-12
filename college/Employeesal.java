class employeesal{
    private int id;
    private String name;
    private double salary;

    employeesal(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void raiseSalary(double percent)
    {
        if(percent>0)
        {
            double raiseAmount=salary*(percent/100);
            salary+=raiseAmount;
            System.out.println(name+" Salary raised by "+percent+"%"+" new salary:"+salary);
        }
        else
        {
            System.out.println("Invalid percentage");
        }
    }

    void employeedetails()
    {
        System.out.println("Employee id:"+id+"\nEmployee name"+name+"\nEmployee salary:"+salary);
    }

}