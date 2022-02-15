package Course.Course1.HomeWorks.HomeWork7;

public class MealApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 15);
        Cat cat1 = new Cat("Moorzik", 20);
        Cat cat2 = new Cat("Nikotin", 10);

        Cat[] cats = {cat, cat1, cat2};
        for (Cat cat_ : cats) {
            cat_.catInfo();
        }
        System.out.println();

        Plate plate = new Plate(40);

        plate.info();
        System.out.println();

        for (Cat cat_ : cats) {
            cat_.eat(plate);
        }
        System.out.println();

        for (Cat cat_ : cats) {
            cat_.catInfo();
        }

        plate.info();

        plate.addFood(40);
        plate.info();


    }
}
