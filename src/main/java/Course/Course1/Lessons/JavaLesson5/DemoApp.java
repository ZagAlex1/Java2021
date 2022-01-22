package Course.Course1.Lessons.JavaLesson5;

import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {
        Car car = new Car("Dodge");
        car.info();
        System.out.println();


        // Car.info() - нельзя, так как не статический
        car.printModel();
        car.crash();
        car.info();

        /*String carModel = car.getModel();
        System.out.println(carModel);*/

        /*Car car2 = new Car();
        car2.setModel("Ford");
        car2.setYear(1998);


        System.out.println("Model = " + car.model + "  Year = " + car.year + "  WasCrashed = " + car.wasCrashed + " WheelsNumber = " + car.wheelsNumber);
        System.out.println("Model = " + car2.model + "  Year = " + car2.year + "  WasCrashed = " + car2.wasCrashed + " WheelsNumber = " + car2.wheelsNumber);

        int wheelsNumber = Car.wheelsNumber;*/


        //Car[] cars = new Car[]{car, car2};

        String str = "Name"; //stringpool
        String str1 = new String("SerName"); // не stringpool
/*

        Robot[] robots = new Robot[10];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot " + i, i + 10);
        }

        for (Robot robot : robots) {
            robot.info();
        }
*/

    }
}



