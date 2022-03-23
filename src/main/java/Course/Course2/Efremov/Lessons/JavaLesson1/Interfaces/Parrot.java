package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;

public class Parrot implements Flyable, Voiceable {

    @Override
    public void fly() {

    }

    @Override
    public void voice() {
        System.out.println("Hello");
    }
}
