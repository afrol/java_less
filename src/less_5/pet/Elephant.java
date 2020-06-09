package less_5.pet;

public class Elephant extends BasePet {
    public Elephant(String name) {
        super(name);
    }

    @Override
    protected String getType() {
        return "Cлон";
    }

    @Override
    protected int getWeight() {
        return 2000;
    }
}
