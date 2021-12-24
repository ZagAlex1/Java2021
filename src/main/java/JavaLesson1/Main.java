package JavaLesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, java");

        int name = 10;

        float val = 10;             //double + float = double
        double doubleVal = 10.0;

        int b = 100 + name;

        System.out.println("b= " + b);

        int c = (name + b) * 2;

        System.out.println("c= " + c);

        int a = 42;

        a++;
        a--;

        a += 10;
        a -= 10;
        // и т.д.


        boolean boolValue = true;
        System.out.println(boolValue);

        int v1 = 10;
        int v2 = 100;

        /*boolean result = v1 > v2;
        System.out.println(result);*/

        if (v1 > v2) {
            System.out.println("v1 > v2");
        } else if (v1 < v2) {
            System.out.println("v1 < v2");
        } else {
            System.out.println("v1 = v2");
        }


    }
    // 2 типа данных
    // - ссылочные
    // - примитивные

    //Численные типы
    //byte -128 ... 127
    //short - 2^16   -2^15....2^15 - 1
    //int - 2^32
    //long - 2^64

    //Числа с плавающей точкой
    //float - 2^32
    //double - 2^64

    //boolean
    //true/false

    //Символьный
    //char (ASCII / Unicode)
}
