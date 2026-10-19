package ISP;

public class Backend implements Employee {
    @Override
    public void writecode() {
        System.out.println("Backend Developer is writing code");
    }

    @Override
    public void testcode() {
        System.out.println("Backend Developer is testing code");
    }

    @Override
    public void deploycode() {
        throw new UnsupportedOperationException("Backend Developer cannot deploy code");
    }
}
