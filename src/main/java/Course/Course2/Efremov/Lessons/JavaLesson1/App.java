package Course.Course2.Efremov.Lessons.JavaLesson1;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Employee.Builder builder = new Employee.Builder();
        Employee hr = builder.birthday(LocalDate.now())
                .id(1)
                .firstname("Пулька")
                .build();

        Employee hr1 = new Employee.Builder()
                .birthday(LocalDate.now())
                .id(2)
                .firstname("Пулька1")
                .build();
    }
}
