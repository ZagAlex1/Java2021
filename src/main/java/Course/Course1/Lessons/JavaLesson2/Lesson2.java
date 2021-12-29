package Course.Course1.Lessons.JavaLesson2;

public class Lesson2 {

    public static final String TEMPLATE = "int = %s string = %s\n";

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");

        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "st12313r");

    }

    public static int multiplication(int n1, int n2) {
        int result = n1 * n2;
        return result;
        // return n1 + n2 тоже самое
    }

    public static int multiplication(int n1, double n2) { // ctrl + клик - понять какой метод вызывается
        return (int) (n1 * n2);
    }


    //Модификатор доступа + тип значения + имя + Набор параметров

    //Правильное присваивание имен
    //naming - ClassName MyClassName
    //methods, variables - loaerCaseUperCase methodName variableName - camelCase

    //CONSTANTS - UPPER_CASE (snake_case) через нижнее подчеркивание

    //Тип значения (возвращает или нет)
    //type - void / real type

    //Модификатор доступа
    //public(доступен всем классам, всем пакетам)
    //protect(доступен всем в текущем пакете + всем наследникам)
    //(no modifier) default - модификатора нет (доступен только тем, кто в пакете)
    //private - доступен только внутри данного класса
}
