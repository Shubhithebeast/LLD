package ISP;

public class Backend implements Coder, Tester {
    @Override
    public void writecode() {
        System.out.println("Backend Developer is writing code");
    }

    @Override
    public void testcode() {
        System.out.println("Backend Developer is testing code");
    }

}
