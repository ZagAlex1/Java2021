package Course.Course1.Lessons.JavaLesson6;

public class Bike extends Transport {
    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("BZZZZZZ");
    }

    @Override
    public void printInventionDate() {
        //any other logic
        System.out.println("1950");;
    }
}
