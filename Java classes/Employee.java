class Employee {

    int salary;
    int uid;
    String name;

    void Employee(String name, int salary, int uid)
    {
    System.out.println(name+ " " +salary+ " " +uid);
    }

    public static void mian(String [] args)
    {
        Employee p = new Employee();
        Employee p1 = new Employee("Lucky",1000000,15);
    }
    
}
