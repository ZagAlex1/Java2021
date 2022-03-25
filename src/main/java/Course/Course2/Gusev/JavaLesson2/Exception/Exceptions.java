package Course.Course2.Gusev.JavaLesson2.Exception;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            System.out.println(" a/b = " + div(a, b));
            b = 0;
            System.out.println(" a/b = " + div(a, b));
        } catch (ArithmeticException ae) {          // можно catch (Exception ae)
            System.out.println("Поймал исключение");
            ae.printStackTrace(System.out);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //open file
        try {
            //read
            System.out.println(divFirstAndSecond(args));
        } catch (ArithmeticException ex) {
            System.out.println("Попытались поделить на ноль");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Массив не той длинны");
        } catch (Exception ex) {
            System.out.println("Что-то другое " + ex.getMessage());
        } finally {
            // close file
            System.out.println("Будет выполнено всегда");
        }

    }


    static int div(int a, int b) {
        return div2(a, b);
    }

    static int div2(int a, int b) {
        return a / b;
    }

    /**
     * Передали массив. Вернем результат деления первого на второй.
     * Не умеем делить на 10.
     *
     * @param array
     * @return
     */

    static int divFirstAndSecond(String[] array) {

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if (b == 10) {
            throw new MyCustomException(10);
        }
        return a / b;
    }
}
