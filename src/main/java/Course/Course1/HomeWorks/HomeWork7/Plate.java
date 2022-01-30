package Course.Course1.HomeWorks.HomeWork7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void takeFood(int needToEat) {
        this.food -= needToEat;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void info() {
        System.out.println(this);
    }
}
