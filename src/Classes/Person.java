package Classes;

public abstract class Person
{
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;


    public Person()
    {
        id_gen = id++;
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

    public int getId_gen() {
        return id_gen;
    }
}
