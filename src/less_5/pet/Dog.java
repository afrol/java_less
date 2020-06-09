package less_5.pet;

public class Dog extends BasePet {
    public Dog(String name) {
        super(name);
    }

    @Override
    protected String getType() {
        return "Cобака";
    }

    @Override
    protected int getWeight() {
        return 15;
    }
}
