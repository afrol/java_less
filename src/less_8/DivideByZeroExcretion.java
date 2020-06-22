package less_8;

public class DivideByZeroExcretion extends RuntimeException {
    private final double a;

    public DivideByZeroExcretion(double a) {
        this.a = a;
    }

    @Override
    public String getMessage() {
        return "Divide a: " + a + " by 0";
    }
}
