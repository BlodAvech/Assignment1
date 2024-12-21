package Classes;

import java.util.ArrayList;

public class Student extends Person
{
    private static int id = 1;
    private int studentID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender)
    {
        super(name, surname, age, gender);
        studentID = id++;
    }

    public void addGrade(int grade)
    {
        grades.add(grade);
    }

    public float calculateGPA()
    {
        float sumOfGrades = 0;
        for (int grade : grades)
        {
            sumOfGrades += grade;
        }
        return (sumOfGrades/grades.size());
    }

    @Override
    public String toString()
    {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
