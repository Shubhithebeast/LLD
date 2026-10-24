package Creational_Design_Pattern.SingeltonDesign;

public class Calculator {
    
    public int a;
    public int b;

    private static Calculator obj = new Calculator();

    private Calculator() {

    }

    public int sum(){
        return a+b;
    }

    public static Calculator getInstance() {
        return obj;
    }

}
