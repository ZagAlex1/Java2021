package Course.Course1.Lessons.DesignPattern;

import Course.Course1.Lessons.DesignPattern.Interface.DefaultMovable;
import Course.Course1.Lessons.DesignPattern.Interface.Movable;

public class Main {
    public static void main(String[] args) {
        Point point = Point.startPoint();

        ColoredPoint coloredPoint = ColoredPoint.builder().setX(0).setY(0).build();

        ColoredPoint red = PointFactory.startAtRed();


        Movable movable = PointFactory.getMovable();

        red = movable.move(red, 10, 10);

    }
}
