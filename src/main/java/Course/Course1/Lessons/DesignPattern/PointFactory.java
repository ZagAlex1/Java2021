package Course.Course1.Lessons.DesignPattern;

import Course.Course1.Lessons.DesignPattern.Interface.*;

public class PointFactory {

    public static ColoredPoint startAtRed() {
        return ColoredPoint.builder()
                .setX(0)
                .setY(0)
                .setColor("red")
                .build();
    }

    public static Movable getMovable() {
        return new ChronoMovable(new CompositeMovable(new DefaultMovable(), new ColoredMovable()));
    }
}
