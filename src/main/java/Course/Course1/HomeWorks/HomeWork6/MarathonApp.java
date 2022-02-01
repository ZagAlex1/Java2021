package Course.Course1.HomeWorks.HomeWork6;

public class MarathonApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Strelka", true, true);
        dog.swimDistance(11);
        dog.runDistance(600);
        System.out.println();

        Dog dog1 = new Dog("Belka", true, true);
        dog1.swimDistance(9);
        dog1.runDistance(300);
        System.out.println();

        Cat cat = new Cat("Murzik", false, true);
        cat.swimDistance(9);
        cat.runDistance(100);
        System.out.println();

        Cat cat1 = new Cat("Vasjan", false, true);
        cat1.swimDistance(9);
        cat1.runDistance(201);
        System.out.println();

        Cat[] cats = {cat, cat1};
        Cat.numberCats(cats);

        Dog[] dogs = {dog, dog1};
        Dog.numberDogs(dogs);

        Animal[] animals = {dog, dog1, cat, cat1};
        Animal.numberAnimals(animals);
        System.out.println();

        for (Animal animal : animals) {
            animal.runDistance(50);
            animal.swimDistance(5);
        }

    }
}
