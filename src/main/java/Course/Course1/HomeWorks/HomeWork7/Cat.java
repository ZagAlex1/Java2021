package Course.Course1.HomeWorks.HomeWork7;

public class Cat {

    private String name;
    private final int appetite;
    private boolean satiety;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void catInfo() {
        System.out.println(this);
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.takeFood(appetite);
            setSatiety(true);
            System.out.println("Я наелся");
        } else {
            System.out.println("Мне не хватило");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
