package Course.Course2.Efremov.Lessons.JavaLesson1;

public class Outer {
    private int i;
    private static int a;

    public Outer() {
        System.out.println("Outer");
    }

    private void m1() {
        class A {         //Локальный класс
        }
        A a1 = new A();


        i = 10;
        a = 11;
    }

    private static void staticM2() {
        a = 1;
    }

    //Внутренний класс, имеет доступ к приватным полям внешнего класса
    class Inner {
        public Inner() {
            System.out.println("Inner");
        }

        private int b;

        private void v() {
            i = 11;
        }
    }
    //Вложенный статический класс
    static class StaticInner {

        public StaticInner() {
            System.out.println("StaticInner");
        }

        private int b;

        private void v() {
            a = 2;
        }
    }
}
