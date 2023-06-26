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
    System.out.println("count "+count);
    boolean even=false;
    if(count%2==0) even=true;
    tmp=num;
    int num1= (int) (tmp%(Math.pow(10,count/2)));
    System.out.println("num1 "+num1);
    tmp-=num1;
    tmp/=(Math.pow(10,count/2));
    System.out.println("tmp "+tmp);
    if (even!=true) tmp/=10;
    int num2=0;
    int tmp1=0;
    int tmp2=0;
     for(int i=1; i<=count/2;i++){
         tmp1= (int) (tmp%Math.pow(10,i));
     System.out.println("tmp1 "+tmp1);
        tmp1-=tmp2;
     System.out.println(tmp1);

        tmp2=tmp1;
     System.out.println(tmp2);
        tmp1= (int) (tmp/Math.pow(10,i-1));
        num2+=tmp1*Math.pow(10,count/2-i-1);
     System.out.println("num2 "+num2);

    }
     if (num1==num2) System.out.println("YES");
     else System.out.println("NO");
}
}
