//Задание 7
//Показать битовое представление значения переменной
//типа int, используя только один цикл, управляющую переменную, вывод на консоль и битовые операции.
//Не использовать строки и любые другие готовые функции (методы).

import java.util.Scanner;
public class Task07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        while(num>0) {
            if(num%2==0) System.out.print("0");
            else System.out.print("1");
            num/=2;
        }
    }
}
