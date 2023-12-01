package day32_custom_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;



    // day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a constructor with two parameter - name & jobTitle
    public Employee (String name, String jobTitle) {
        this.name = name;
        jobTitle = jobTitle;
    }
    // day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a constructor with four parameters - name, jobTitle, id, salary

    public Employee (String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;

        // day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a method that say $name is going into meeting.


    }

    public void goToMeeting() {
        System.out.println(name + " is going into meeting. ");

    }
    public String toString () {
        String result = " info about the employee: " + name +
                "\n\tId:\t\t" + id +
                "\n\tJob Title: \t" + jobTitle +
                "\n\tSalary:\n\t$" + salary;

        return result;
    }
}
