import java.util.Scanner;

public class Task05 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число");
    int num = in.nextInt();
    int tmp=num;
    int count=0;
    while(tmp>0){
        tmp=tmp/10;
        count++;
    }
    int rightNum = 0;
    int leftNum = 0;
    int i=1;
    tmp=num;
    boolean polyndrom=true;
    while(i<=count/2){
        rightNum= (int) ((num%(Math.pow(10,i)))/(Math.pow(10,i-1)));
        leftNum= (int) (tmp/Math.pow(10,count-i));
        tmp = (int) (num%Math.pow(10,count-i));
        if (leftNum!=rightNum) {polyndrom=false;break;}
        i++;
    }
    if (polyndrom) System.out.println("YES");
    else System.out.println("NO");
    }
}
