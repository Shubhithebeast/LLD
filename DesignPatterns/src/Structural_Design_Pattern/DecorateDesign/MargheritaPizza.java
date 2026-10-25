package Structural_Design_Pattern.DecorateDesign;

public class MargheritaPizza implements Pizza   {

    @Override 
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 10;
    }

}
