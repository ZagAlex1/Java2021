package Course.Course2.Gusev.JavaLesson1;

public class Guard {

    boolean canPass(User user) {
        return user.getAgeBefore18() == 0;
    }
}