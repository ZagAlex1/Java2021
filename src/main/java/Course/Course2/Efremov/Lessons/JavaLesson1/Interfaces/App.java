package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;



public class App {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        CharCounter counter = new CharCounter(reader, writer);
        counter.count();

    }
}
