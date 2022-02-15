package Course.Course1.HomeWorks.HomeWork6;

public class Cat extends Animal {

    static int score = 0;

    public static void numberCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            score++;
        }
        System.out.println("Всего котов " + score);
    }

    public Cat(String name, boolean swim, boolean run) {

        super(name, swim, run, 200);
    }

}
