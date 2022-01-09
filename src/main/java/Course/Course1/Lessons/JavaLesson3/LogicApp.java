package Course.Course1.Lessons.JavaLesson3;

public class LogicApp {
    public static void main(String[] args) {

        // или ||  | один знак ставится, если нужно вызвать две проверки
        // false false вернет false
        // false true вернет true
        // true false вернет true
        // true true вернет true

        // и   &&  & один знак ставится, если нужно вызвать две проверки
        // false false вернет false
        // false true вернет false
        // true false вернет false
        // true true вернет true

        // не  !

        int a = -10;
        if (isPositive(a) && !isZero(a)) {
            System.out.println("Положительно и не 0");
        }

        if (!isPositive(a) || isZero(a)) {
            System.out.println("Отрицательное или 0");
        }
    }

    public static boolean isPositive(int val) {
        return val >= 0;
    }

    public static boolean isZero(int val) {
        return val == 0;
    }
}
