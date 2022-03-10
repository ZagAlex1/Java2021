package Course.Course1.Lessons.DesignPattern.Interface;

import Course.Course1.Lessons.DesignPattern.ColoredPoint;

public interface Movable {
    ColoredPoint move(ColoredPoint point, int dx, int dy);

    ColoredPoint moveRight(ColoredPoint point, int dx);
}
