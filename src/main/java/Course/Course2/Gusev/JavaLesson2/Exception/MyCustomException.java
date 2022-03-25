package Course.Course2.Gusev.JavaLesson2.Exception;

public class MyCustomException extends RuntimeException {

    public MyCustomException(int a) {
        super("Не умею делить на " + a);
    }
}
