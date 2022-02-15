package Course.Course1.HomeWorks.HomeWork6;

public class Animal {

    static int score = 0;
    protected String name;
    protected boolean swim;
    protected boolean run;
    protected int maxRun;
    protected int maxSwim;

    public static void numberAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            score++;
        }
        System.out.println("Всего зверей " + score);
    }

    public int getMaxRun() {

        return maxRun;
    }

    public int getMaxSwim() {

        return maxSwim;
    }

    public Animal(String name, boolean swim, boolean run, int maxRun, int maxSwim) {
        this.name = name;
        this.swim = swim;
        this.run = run;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public Animal(String name, boolean swim, boolean run, int maxRun) {
        this.name = name;
        this.swim = swim;
        this.run = run;
        this.maxRun = maxRun;
    }

    public Animal(String name, boolean swim, boolean run) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    public void runDistance(int meters) {
        if (meters <= maxRun) {
            System.out.println(name + " пробежал " + meters);
        } else {
            System.out.println("Я столько не пробегу");
        }
    }

    public void swimDistance(int meters) {
        if (meters <= maxSwim) {
            System.out.println(name + " проплыл " + meters);
        } else if (swim == false) {
            System.out.println("Я не умею плавать");
        } else {
            System.out.println("Я столько не проплыву");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
}
