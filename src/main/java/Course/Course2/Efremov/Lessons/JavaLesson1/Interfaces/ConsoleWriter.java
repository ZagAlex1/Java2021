package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
