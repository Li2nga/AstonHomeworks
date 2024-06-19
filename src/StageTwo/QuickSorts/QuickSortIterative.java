package StageTwo.QuickSorts;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
//import java.util.Stack;

//Итеративная реализация алгоритма быстрой сортировкии от JavaRush. pivot = arr[high]
public class QuickSortIterative {


    static void quickSort(int[] arr, int l, int h) {
        if (arr == null || arr.length == 0)
            return;

        if (l >= h)
            return;

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(l);
        stack.push(h);

        while (!stack.isEmpty()) {
            h = stack.pop();
            l = stack.pop();

            int pivotIndex = partition(arr, l, h);

            if (pivotIndex - 1 > l) {
                stack.push(l);
                stack.push(pivotIndex - 1);
            }

            if (pivotIndex + 1 < h) {
                stack.push(pivotIndex + 1);
                stack.push(h);
            }
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }


        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] array = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("  Sorted Array: " + Arrays.toString(array));
    }
}