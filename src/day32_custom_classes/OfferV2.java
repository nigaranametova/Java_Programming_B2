package day32_custom_classes;

public class OfferV2 {

    // 5 instance variables: company, location, salary, isFullTime, numberOfPTO
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    // day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a constructor with two parameters - company and location
    public OfferV2(String company, String location){
        this.company = company;
        this.location = location;
    }


    //day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a constructor with all parameters - company, location, salary, isFullTime, numberOfPTO
    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location);
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }




    public String toString () {
        return company + " located in " + location +
                "\nPays $" + salary + " salary and provides " + numberOfPTO + " number of PTO" +
                "\nThis is day36_inheritance.app.access.day36_inheritance.access.a.a full time position: " + isFullTime;

    }

}
