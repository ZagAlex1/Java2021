package Course.Course1.HomeWorks.HomeWork6;

public class Dog extends Animal {

    static int score = 0;

    public static void numberDogs(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            score++;
        }
        System.out.println("Всего собак " + score);
    }

    public Dog(String name, boolean swim, boolean run) {

        super(name, swim, run, 500, 10);
    }

}
