package Course.Course2.Gusev.JavaLesson1;

public class App {
    public static void main(String[] args) {
        ComputerUser user = new ComputerUser();
        Guard guard = new Guard();
        boolean canPass = guard.canPass(user);
    }
}
