package ISP;

public class Devops implements Employee {
    @Override
    public void writecode() {
        throw new UnsupportedOperationException("Devops cannot write code");
    }

    @Override
    public void testcode() {
        throw new UnsupportedOperationException("Devops cannot test code");
    }

    @Override
    public void deploycode() {
        System.out.println("Devops is deploying code");
    }
}
