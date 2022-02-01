package Course.Course1.Lessons.JavaLesson6;

public class Cabrio extends Car {

    boolean hasHardTop;

    public Cabrio(String model, int year, boolean hasHardTop) {
        super(model, year);
        this.hasHardTop = hasHardTop;
    }

    public boolean isHasHardTop() {
        return hasHardTop;
    }

    public void setHasHardTop(boolean hasHardTop) {
        this.hasHardTop = hasHardTop;
    }
}
