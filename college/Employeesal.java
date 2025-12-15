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
            double raiseamount=salary*(percent/100);
            salary+=raiseamount;
            System.out.println(name+"\n salary raised by "+percent+"%"+"\nNew salary:"+salary);
        }

        else
        {
            System.out.println("Invalid percentage");
        }
    }

    void employeedetails()
    {
        System.out.println("Employee ID:\n"+id+"Employee name:\n"+name+"Employee salry:\n"+salary);
    }
}