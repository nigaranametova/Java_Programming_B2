package day35_inheritance.person;

import day35_inheritance.person.Person;
import day35_inheritance.person.Student;

public class Runner {
    public static void main(String[] args) {
        Person objOne = new Person();
        objOne.name = "Eyad";
        objOne.age = 25;
        objOne.favouriteHobby = "Java";
        objOne.talk();

        Student studentOne = new Student();
        studentOne.name = "Valentina";
        studentOne.age = 23;
        studentOne.favouriteHobby = "Of course Java";
        studentOne.talk();
        studentOne.study();
        studentOne.grades = 'A';
        System.out.println(studentOne.grades);

    }
}
