package day35_inheritance.computer;

public class Mac  extends Computer {

    public Mac(int memory) {
        // super() - since there is not default constructor, I need to call the matching constructor for SUPER class

        super("macOS" , memory);

    }
}
