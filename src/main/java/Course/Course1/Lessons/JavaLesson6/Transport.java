package Course.Course1.Lessons.JavaLesson6;

public abstract class Transport extends Invention {

    protected String color;

    void printName() {
        System.out.println("Transport");
    }

    @Override
    public void printInventionDate() {
        System.out.println("1900");
    }

    public abstract void wroomWroom();
    //public abstract int getCapacity();
}
