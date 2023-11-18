package day35_inheritance.person;

import day35_inheritance.person.Person;

public class Student  extends Person {

    char grades;
    public void study (){
        System.out.println(name + " is studying");
    }
}
