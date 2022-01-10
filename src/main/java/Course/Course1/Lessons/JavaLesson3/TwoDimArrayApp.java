package Course.Course1.Lessons.JavaLesson3;

import java.util.Arrays;

public class TwoDimArrayApp {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        array[2][2] = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(Arrays.toString(array));

        int[] subArray = array[2];
        System.out.println(Arrays.toString(subArray));
        int[] subArray1 = array[1];
        System.out.println(Arrays.toString(subArray1));

        System.out.println();
        System.out.println();
        System.out.println();


        int[][] newArray = new int[5][];
        System.out.println(Arrays.toString(newArray));

        newArray[0] = new int[]{1, 2, 3};
        newArray[1] = new int[]{1, 2, 3, 4, 5};
        newArray[2] = new int[]{1};
        newArray[3] = new int[]{1, 1};

        System.out.println(Arrays.toString(newArray));
        System.out.println();
        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
        System.out.println();
        System.out.println();

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        char[] chars = "Java".toCharArray();
        System.out.println(chars[2]);

        System.out.println("Java".charAt(3));
    }
}
