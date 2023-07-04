//Задание 8
//Электронные часы показывают время в формате от 00:00
//до 23:59. Написать программу, которая выведет на консоль
//сколько раз за сутки случается так, что слева от двоеточия
//показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
//на экран все симметричные комбинации. Вывести общее
//число комбинаций.

public class Task08 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0;i<=23;i++){
            for (int j=0;j<59;j++){
                if(i%10==j/10&&i/10==j%10) {System.out.printf("%02d:%02d \n",i,j);count ++;}
            }
        }
        System.out.println("Всего совпадений - "+count);
    }
}
