package Course.Course1.HomeWorks.HomeWork6;

public class Dog extends Animal {

    public Dog(String name, boolean swim, boolean run) {
        super(name, swim, run, 500, 10);
    }

    @Override
    public void runDistance(int meters) {
        super.runDistance(meters);
    }

    @Override
    public void swimDistance(int meters) {
        super.swimDistance(meters);
    }
}
