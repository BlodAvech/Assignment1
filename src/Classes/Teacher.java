package Classes;

public class Teacher extends Person
{
    private String subject;
    private int yearsOfExpirience;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public String getSubject() {
        return subject;
    }

    public void giveRaise(float percentage)
    {
        salary = (int)(salary * ((percentage / 100f)+1));
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
