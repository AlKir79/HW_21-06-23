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
