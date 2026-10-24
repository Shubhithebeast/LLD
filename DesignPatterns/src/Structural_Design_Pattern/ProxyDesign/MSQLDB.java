package Structural_Design_Pattern.ProxyDesign;

public class MSQLDB  implements Database {

    @Override 
    public void delete() {
        System.out.println("User deleted");
    }

}
