package Course.Course1.HomeWorks.HomeWork3;

import java.util.Arrays;

public class HomeWorkArray {
    public static void main(String[] args) {

        arrayElementsReplace();
        System.out.println();
        arrayFrom1To100();
        System.out.println();
        System.out.println();
        arrayElementsLessThenSix();
        System.out.println();
        squareArray();
        System.out.println();
        System.out.println();
        int[] array = fillArray(4, 5);

    }

    public static void arrayElementsReplace() {
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayFrom1To100() {
        int[] array1 = new int[100];
        int value = 1;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = value;
            value++;
            System.out.print(array1[i] + " ");
        }

    }

    public static void arrayElementsLessThenSix() {
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6) {
                array2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
//Расскажешь на уроке, как заполнять вторую диагональ поподробнее?
    public static void squareArray() {
        int[][] array3 = new int[5][5];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i] == array3[j]) {
                    array3[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array3[i]));
        }

    }

    public static int[] fillArray(int len, int initialValue) {
        int[] array4 = new int[len];
        /*for (int i = 0; i < array4.length; i++) {
            array4[i] = initialValue;
        }
        System.out.println(Arrays.toString(array4));*/

        Arrays.fill(array4, initialValue);
        System.out.println(Arrays.toString(array4));
        return array4;
    }


}
