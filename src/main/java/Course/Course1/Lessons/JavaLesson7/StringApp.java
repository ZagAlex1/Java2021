package Course.Course1.Lessons.JavaLesson7;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());
        System.out.println(str2);

        str.toUpperCase();
        System.out.println(str + " " + str.toUpperCase());

        System.out.println(str.startsWith("S"));

        System.out.println(str.contains("ing"));

        String stringUpper = "STrInG";
        System.out.println(str.equals(stringUpper));
        System.out.println(str.equalsIgnoreCase(stringUpper));

        String s = 1 + " " + 2 + " smth else " + 3;

        StringBuilder stringBuilder = new StringBuilder(str);// перевод строки в стрингбилдер
        stringBuilder.append(1).append(" ").append(2);

        //StringBuffer тоже самое, только потоко безопасен

        String newString = stringBuilder.toString();
        System.out.println(newString);
    }
}
