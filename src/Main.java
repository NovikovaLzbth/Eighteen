import java.util.*;
interface Sort {
    boolean sort(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Выберите метод сортировки first (по возрастанию) / second (по убыванию): ");
        Scanner scanner1 = new Scanner(System.in);
        String sc = scanner1.nextLine();
        if (sc.equals("first")) {
            Sort x = (a,b) -> a > b;
            bubbleSort(arr, x);
        }
        else if (sc.equals("second")) {
            Sort x = (a,b) -> a < b;
            bubbleSort(arr, x);
        }

        System.out.println("\n Отсортированный массив");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
    public static void bubbleSort(int[] array, Sort x){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (x.sort(array[j], array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
