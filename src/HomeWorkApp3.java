import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String args[]) {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] arr = new int[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 12; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        /*2. Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("task 2:" + Arrays.toString(arr1));

        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2;*/
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("task 3.1:" + Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println("task 3.2:" + Arrays.toString(arr2));

        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
        System.out.println("task 4:");
        int[][] arr3 = new int[5][5];
        for (int x = 0; x < arr3.length; x++) {
            for (int y = 0; y < arr3[x].length; y++) {
                if (x == y) {
                    arr3[x][y] = 1;
                    arr3[x][arr3[x].length - x - 1] = 1;
                }
            }
            System.out.println(Arrays.toString(arr3[x]));
        }

        System.out.println("task 5:");
        System.out.println(Arrays.toString(task5(3, 5)));
    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] task5(int len, int initialValue) {
        int[] result = new int[len];
        for (int x = 0; x < len; x++) {
            result[x] = initialValue;
        }
        return result;
    }
}

