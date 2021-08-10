public class HomeWorkApp2 {

    public static void main(String[] args) {
        int x = -7;
        int y = 7;

        System.out.println(task1(x, y));
        task2(0);
        System.out.println(task3(x));
        task4("Alina", 3);
    }

    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
          что их сумма лежит в пределах от 10 до 20 (включительно),
          если да – вернуть true, в противном случае – false.*/
    public static boolean task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
          метод должен напечатать в консоль, положительное ли число передали или отрицательное.
          Замечание: ноль считаем положительным числом.*/
    public static void task2(int a) {
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static boolean task3(int a) {
        return a < 0;
    }

    /*4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void task4(String word, int a){
        int i = 0;
        while(i < a){
            System.out.println(word);
            i++;
        }
    }
}



