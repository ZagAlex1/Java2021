package Course.Course1.Lessons.JavaLesson6;

import java.util.Arrays;

public class RentApp {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2012);
        System.out.println();


        Car van = new Van("Ford", 2010, 7);
        Car cabrio = new Cabrio("Peugeot", 2015, true);
        System.out.println();
        System.out.println();

        System.out.println(car instanceof Van);//false
        System.out.println(car instanceof Car);//true
        System.out.println(van instanceof Van);//true
        System.out.println(cabrio instanceof Van);//false
        System.out.println(cabrio instanceof Transport);//true

        System.out.println();
        System.out.println();

        Car[] cars = {car, cabrio, van};

        for (Car c : cars) {
            System.out.println(c.getModel());
        }
        System.out.println();
        System.out.println("Only vans");
        for (Car c : cars) {
            if (c instanceof Van) {
                Van v = (Van) c;
                System.out.println("This is a van " + c.getModel());
                System.out.println(("This is a van " + v.getSeats()));
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Transport[] transports = {car, cabrio, van};

        for (Transport transport : transports) {
            System.out.println(transport);
        }

        System.out.println(Arrays.toString(transports));
    }
}
