package Classes;

public abstract class Person
{
    private String name;
    private String surname;
    private int age;
    private boolean gender;


    public Person()
    {

    }

    public Person(String name , String surname , int age , boolean gender)
    {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Hi, i am " + name + " " + surname+", a " + age + "-year-old " + (gender?"Male":"Female")+".");
    }
}
