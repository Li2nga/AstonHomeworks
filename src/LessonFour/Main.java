package LessonFour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a1 = new int[]{3, 15, 11, 2, 27, 3, 11, 4};
        int[] b1 = new int[]{3, 15, 11, 2, 10, 3, 11, 4};
        System.out.println('a');
        System.out.println(Arrays.toString(a1));
        roundSort(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println('b');
        System.out.println(Arrays.toString(b1));
        roundSort(b1);
        System.out.println(Arrays.toString(b1));
        System.out.println("insertionSort");
        int[] a = new int[]{3, 15, 11, 2, 27, 3, 11, 4};
        int[] b = new int[]{3, 15, 11, 2, 10, 3, 11, 4};
        System.out.println('a');
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println('b');
        System.out.println(Arrays.toString(b));
        insertionSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("shellSort");
        int[] a2 = new int[]{3, 15, 11, 2, 27, 3, 11, 4};
        int[] b2 = new int[]{3, 15, 11, 2, 10, 3, 11, 4};
        System.out.println('a');
        System.out.println(Arrays.toString(a2));
        shellSort(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println('b');
        System.out.println(Arrays.toString(b2));
        shellSort(b2);
        System.out.println(Arrays.toString(b2));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

    }

    public static void roundSort(int[] array) {
////////////////////////////////////////////////////////////////////////////////////////////iter1
        if (array[1] < array[0]) {
////arr0==8, arr1==5

            int temp = array[1];
//arr0==8, arr1==5, temp==5

            array[1] = array[0];
//arr0==8, arr1==8, temp==5

            array[0] = temp;
//arr0==5, arr1==8, temp==5

////aar0==5, arr1==8
        }
////////////////////////////////////////////////////////////////////////////////////////////iter2
        if (array[2] < array[1]) {
            int temp = array[2];
            array[2] = array[1];
            array[1] = temp;
        }
        if (array[1] < array[0]) {
            int temp = array[1];
            array[1] = array[0];
            array[0] = temp;
        }
////////////////////////////////////////////////////////////////////////////////////////////iter3
        if (array[3] < array[2]) {
            int temp = array[3];
            array[3] = array[2];
            array[2] = temp;
        }
        if (array[2] < array[1]) {
            int temp = array[2];
            array[2] = array[1];
            array[1] = temp;
        }
        if (array[1] < array[0]) {
            int temp = array[1];
            array[1] = array[0];
            array[0] = temp;
        }
//        [][][][][!][][][][][][][][][]
////////////////////////////////////////////////////////////////////////////////////////////iter4
        if (array[4] < array[3]) {
            int temp = array[4];
            array[4] = array[3];
            array[3] = temp;
        }
        if (array[3] < array[2]) {
            int temp = array[3];
            array[3] = array[2];
            array[2] = temp;
        }
        if (array[2] < array[1]) {
            int temp = array[2];
            array[2] = array[1];
            array[1] = temp;
        }
        if (array[1] < array[0]) {
            int temp = array[1];
            array[1] = array[0];
            array[0] = temp;
        }
    }

    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}