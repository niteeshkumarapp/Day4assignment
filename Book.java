package Day4;

public class Book
{
    String title;
    String author;
    int pages;

   void getSummary()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pages);

    }

       public static void main(String[] args)
       {

           Book obj=new Book();
           obj.title="the ice and fire";
           obj.author="GOT";
           obj.pages=1000;
           obj.getSummary();

           Book obj2=new Book();

           obj2.title="Lord of Ring";
           obj2.author="hobits";
           obj2.pages=2000;
           obj2.getSummary();
       }





}
