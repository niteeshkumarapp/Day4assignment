package Day4;


class Person {

    String name;
    int age;

    void showInfo() {
        System.out.println(age);
        System.out.println(name);

    }

    static class Teacher extends Person
    {
        String subject;
        void showteacherInfo()
        {
            System.out.println(subject);

        }

    }

    public static void main(String[] args)
    {
        Teacher obj=new Teacher();
        obj.name = "Nikk";
        obj.age = 30;
        obj.subject="Physics";
        obj.showInfo();
        obj.showteacherInfo();


    }

}
