package Creational_Design_Pattern.SingeltonDesign;

public class Calculator {
    
    public int a;
    public int b;

    private static Calculator obj ;

    private Calculator() {
        System.out.println("Calculator instance created");

    }

    public int sum(){
        return a+b;
    }

    public static Calculator getInstance() {

        if (obj == null) {
            obj = new Calculator();
        }
        return obj;
    }

}
