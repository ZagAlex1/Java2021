package Course.Course2.Gusev.JavaLesson2.Poly;

public class Cater extends Transport implements Swimmalle{
    private int speed;

    @Override
    void load() {
        System.out.println("Диско-шар и алкоголь");
    }
}
