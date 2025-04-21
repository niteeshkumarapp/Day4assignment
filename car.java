package Day4;

public class car
{
    String name="Mahindra";
    int year=5;
    double price=50000;

    void displayDetails()
    {
        System.out.println(name);
        System.out.println(year);
        System.out.println(price);

    }

    public static void main(String[] args)
    {
          car obj1= new car();
          obj1.displayDetails();

          car obj2=new car();
          obj2.name="Tata";
          obj2.year=10;
          obj2.price=600000;
          obj2.displayDetails();

    }
}
