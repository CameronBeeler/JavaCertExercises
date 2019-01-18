package com.cameronbeeler.ClassManipulations;

import java.util.ArrayList;
import java.util.List;

public
class TestArrayListCollection
{
    public static
    void main(String[] args)
    {

        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for ( Student stud : students)
        {
            System.out.println(stud);
        }
    }
}


class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}
