//Задание 11
//Напишите программу, которая выводит на экран числа
//от 1 до 1 000. При этом вместо чисел, кратных трём, программа должна выводить слово , а вместо чисел, кратных
//пяти – слово buzz. Если число кратно пятнадцати, то программа должна выводить вместо числа слово hiss.

public class Task11 {
    public static void main (String[] args){
        for (int i=1;i<=1000;i++){
            if (i%3==0) System.out.println("fizz");
            else if(i%5==0) System.out.println("buzz");
            else if(i%15==0) System.out.println("hiss");
            else System.out.println(i);
        }
    }
}
