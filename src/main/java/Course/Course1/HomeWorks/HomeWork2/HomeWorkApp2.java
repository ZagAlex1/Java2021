package Course.Course1.HomeWorks.HomeWork2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(from10To20(10, 10));
        positiveNumberOrNot(-20);
        System.out.println(trueOrFalse(10));
        stringNumber("Женя привет", 5);
        System.out.println(leapYear(800));

    }

    public static boolean from10To20(int number1, int number2) {

        /*int number3 = number1 + number2;
        if (number3 > 10 && number3 <= 20) {
            return true;
        } else {
            return false;
        }*/

        int number3 = number1 + number2;
        boolean result = (number3 > 10 && number3 <= 20);
        return result;
    }

    public static void positiveNumberOrNot(int number) {

        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    //Про ноль не сказано в условии, решил сделать так
    public static boolean trueOrFalse(int number) {
        boolean result = (number <= 0);
        return result;
    }

    public static void stringNumber(String name, int howManyTimes) {
        for (int i = 0; i < 5; i++){
            System.out.println(name);
        }
    }

    public static boolean leapYear(int year) {
        boolean result = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        return result;
    }
}
