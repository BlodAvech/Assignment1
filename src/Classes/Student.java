package Classes;

import java.util.ArrayList;

public class Student extends Person
{
    private static int id = 1;
    private int barcode;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(int barcode , String name, String surname, int age, boolean gender)
    {
        super(name, surname, age, gender);
        this.barcode = barcode;
    }

    public void addGrade(int grade)
    {
        grades.add(grade);
    }

    public int calculateGPA()
    {
        int sumOfGrades = 0;
        for (int grade : grades)
        {
            sumOfGrades += grade;
        }
        return (sumOfGrades/grades.size());
    }

    @Override
    public String toString()
    {
        return super.toString() + " I am a student with ID " + barcode + ".";
    }
}
