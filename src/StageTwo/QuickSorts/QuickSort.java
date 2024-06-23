package StageTwo.QuickSorts;

public record QuickSort<T extends Comparable<T>>(T[] arr) {

    public void sort() {
        quicksort(0, arr.length - 1);
    }

    private void quicksort(int low, int high) {

        //ломаем рекурсию
        if (low >= high) {
            return;
        }

        //ставим пайвот, сортируем массив, запускаем 2 рекурсии на правую и левую части
        int pivot = partition(low, high);
        quicksort(low, pivot - 1);
        quicksort(pivot + 1, high);
    }

    private int partition(int low, int high) {

        //Какой-нибудь способ выбрать пайвот
        int pivotIndex = (low + high) / 2;

        swap(pivotIndex, high); //Свапаем в конец, чтобы свести задачу к разбиению по Ламуту
        int pivotIndexCounter = low;
        for (int i = low; i < high; i++) { //Пробегаем по всему массиву, нанизывая к пайвоту большие элементы
            if (arr[i].compareTo(arr[high]) <= 0) swap(pivotIndexCounter++, i);
        }
        swap(pivotIndexCounter, high); //Помещаем пивот на финальное место
        return pivotIndexCounter;
    }

    private void swap(int firstIndex, int secondIndex) {
        if (firstIndex != secondIndex) {
            T temp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = temp;
        }
    }
}