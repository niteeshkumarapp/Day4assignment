package Day4;

public class Employee
{
    String name;
    int employeeId;
    double salary;


    Employee(String name, int employeeId, double salary)
    {
        this.name=name;
        this.employeeId=employeeId;
        this.salary=salary;
    }

    void Display()
        {
          System.out.println(name);
            System.out.println(employeeId);
            System.out.println(salary);

        }

        public static void main(String[] args)
        {
          Employee emp=new Employee("Nikk", 1234,55500);

          emp.Display();


        }

}
