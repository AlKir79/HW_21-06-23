//Задание 4
//Показать на экране все совершенные числа в диапазоне от
//0 до 1 000 000.

public class Task04 {
public static void main(String[] args) {
    for (int i=1; i<1000000;i++) {
        int sum=0;
        for (int j=1;j<i;j++) {
            if (i % j == 0) sum += j;
        }
    if (i==sum) System.out.println(i);
    }
}
}
