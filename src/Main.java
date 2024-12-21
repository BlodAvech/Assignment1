import Classes.Person;
import Classes.School;
import Classes.Student;
import Classes.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers  = new ArrayList<>();
        School school = new School();

        File stundentsFile = new File("Materials/students.txt");
        File teachersFile = new File("Materials/teachers.txt");

        //Students Read
        Scanner scanner = new Scanner(stundentsFile);
        while (scanner.hasNextLine())
        {
            String name = scanner.next();
            String surname = scanner.next();
            int age = Integer.parseInt(scanner.next());
            boolean gender = true;
            switch (scanner.next()){
                case "Male":
                    gender = true;
                    break;
                case "Female":
                    gender = false;
                    break;
            }
            ArrayList<Integer> grades = new ArrayList<>();

            while (scanner.hasNextInt())
            {
                grades.add(Integer.parseInt(scanner.next()));
            }

            Student student = new Student(name,surname,age,gender);
            for(int grade : grades) {student.addGrade(grade);}

            students.add(student);
            school.addMember(student);
        }

        //Teachers Read
        scanner = new Scanner(teachersFile);
        while (scanner.hasNextLine())
        {
            String name = scanner.next();
            String surname = scanner.next();
            int age = Integer.parseInt(scanner.next());
            boolean gender = true;
            switch (scanner.next()){
                case "Male":
                    gender = true;
                    break;
                case "Female":
                    gender = false;
                    break;
            }

            String subject = scanner.next();
            int yearsOfExpirience = Integer.parseInt(scanner.next());
            int salary = Integer.parseInt(scanner.next());
            Teacher teacher = new Teacher(name,surname,age,gender , subject , yearsOfExpirience , salary);

            teachers.add(teacher);
            school.addMember(teacher);
        }

        System.out.println(school.toString());


        for(Teacher teacher : teachers)
        {
            System.out.println(teacher.getName()+"  :  "+ teacher.getSalary() + " + "+(teacher.getYearsOfExpirience()+"%") + " = " + teacher.getSalary() * teacher.getYearsOfExpirience() );
        }

        for(Student student : students)
        {
            System.out.println(student.getName() +"'s GPA : " + student.calculateGPA());
        }
    }
}