package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
