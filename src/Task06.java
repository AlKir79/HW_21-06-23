//Задание 6
//Вывести на консоль все восьмизначные числа, цифры в
//которых не повторяются. Эти числа должны делиться на
//12345, без остатка. Показать общее количество найденных
//чисел.

public class Task06 {
    public static void main (String[] args) {
        int count = 0;
        for (int i=10000000;i<100000000;i++){
            int number=i;
            int numberTemp = 0;
            boolean isUnicue = true;
            while(number>0 && isUnicue){
                int tempDigit = number%10;
                numberTemp = number/10;
                while(numberTemp>0 && isUnicue){
                    if (numberTemp%10==tempDigit){
                        isUnicue = false;
                        break;
                    }
                    numberTemp/=10;
                }
                if(isUnicue==false) break;
                number/=10;
            }

            if(isUnicue && i%12345==0) {System.out.println(i);count++;}

        }
            System.out.println("общее количество чисел "+count);
    }
}
