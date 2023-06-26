public class Task03 {
public static void main (String[] args) {
    for (int i = 10; i < 1000000; i++) {
        int temp1 = i;
        int count = 0;
        int sum = 0;
        while (temp1 > 0) {
            temp1 = temp1 / 10;
            count++;
        }
        temp1=i;
        for (int j = 0; j < count; j++) {
            sum += Math.pow(temp1%10,count);
            temp1=temp1/10;
        }
        if (i == sum) System.out.println(i);
        }
    }
}