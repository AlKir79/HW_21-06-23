//Задание 10
//2520 – наименьшее число, которое можно разделить на
//каждое из чисел от 1 до 10, без остатка. Написать программу,
// которая рассчитывает наименьшее положительное число, которое делится на все числа от 1 до 20.

public class Task10 {
    public static void main(String[] args){
        int i=1;
        while(true){
            boolean isThisNumber=true;
            for (int j=1;j<=20;j++){
                if(i%j!=0) {isThisNumber=false;break;}
            }
            if(isThisNumber==true) {System.out.println(i);System.exit(0);}
            i++;
        }
    }
}
