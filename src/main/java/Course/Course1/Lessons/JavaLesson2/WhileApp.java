package Course.Course1.Lessons.JavaLesson2;

public class WhileApp {
    public static void main(String[] args) {

        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        /*while (true){    infinity
            Бесконечный цикл
        }*/

        int j = 10;
        do {
            System.out.println("j= " + j);
            j--;
        } while (j > 0);
    }
}
