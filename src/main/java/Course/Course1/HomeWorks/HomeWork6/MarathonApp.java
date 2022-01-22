package Course.Course1.HomeWorks.HomeWork6;

public class MarathonApp {
    public static void main(String[] args) {

        Animal dog = new Dog("Strelka", true, true);
        dog.swimDistance(11);
        dog.runDistance(600);
        System.out.println();

        Animal dog1 = new Dog("Belka", true, true);
        dog1.swimDistance(9);
        dog1.runDistance(300);
        System.out.println();

        Animal cat = new Cat("Murzik", false, true);
        cat.swimDistance(9);
        cat.runDistance(100);
        System.out.println();

        Animal cat1 = new Cat("Vasjan", false, true);
        cat1.swimDistance(9);
        cat1.runDistance(201);
        System.out.println();

        // Что то ничего умнее я не придумал
        Animal[]cats = {cat, cat1};
        int score = 0;
        for (int i =0 ; i < cats.length; i++ ) {
            score++;
        }
        System.out.println("Всего котов " + score);

        Animal[]dogs = {dog, dog1};
        int score1 = 0;
        for (int i =0 ; i < cats.length; i++ ) {
            score1++;
        }
        System.out.println("Всего собак " + score1);
        System.out.println("Всего зверей " + (score + score1) );
        System.out.println();
        System.out.println();


        Animal[] animals = {dog, dog1, cat, cat1};

        for (Animal animal : animals) {
            animal.runDistance(50);
            animal.swimDistance(5);
        }

    }
}
