package Classes;

public class Teacher extends Person
{
    private String subject;
    private int yearsOfExpirience;

    public int getSalary() {
        return salary;
    }

    public int getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public String getSubject() {
        return subject;
    }

    private int salary;

    public void giveRaise(float percentage)
    {
        salary = (int)(salary * (percentage / 100));
    }

    public Teacher(String name, String surname, int age, boolean gender , String subject , int yearsOfExpirience , int salary)
    {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExpirience = yearsOfExpirience;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return  super.toString() + "I teach " + subject+".";
    }
}
