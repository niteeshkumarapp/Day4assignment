package Day4;

public class Student
{

    String name;
    int rollNumber;
    float marks;

    void showResults()
    {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);

       if(marks>=35)
       {
           System.out.println("Pass");
       }
       else
       {
           System.out.println("Fail");
       }

    }
    public static void main(String[] args)
    {
        Student obj1=new Student();

        obj1.name="Niteesh";
        obj1.rollNumber=12345;
        obj1.marks=75;
        obj1.showResults();

        Student obj2=new Student();
        obj2.name="Lalit";
        obj2.rollNumber=54321;
        obj2.marks=20;
        obj2.showResults();




    }


}
