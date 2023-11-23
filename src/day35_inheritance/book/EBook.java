package day35_inheritance.book;

// EBook IS-A Book
public class EBook extends Book {

    int pages;

    public void read(){
        System.out.println("Reading day36_inheritance.app.access.day36_inheritance.access.a.a digital copy of " + title + " which has " + pages + " pages." );
    }


}