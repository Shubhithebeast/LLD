package ISP;

public class QA implements Employee {
    @Override
    public void writecode() {
        throw new UnsupportedOperationException("QA cannot write code");
    }

    @Override
    public void testcode() {
        System.out.println("QA is testing code");
    }

    @Override
    public void deploycode() {
        throw new UnsupportedOperationException("QA cannot deploy code");
    }
}
