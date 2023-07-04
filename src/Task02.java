//Задание 2
//Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до 1 000 000

public class Task02 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
