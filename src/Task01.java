public class Task01 {
    public static void main(String[] args){
        int num=0;
        int num1=1;
        System.out.println(num);
        System.out.println(num1);
        do {
            int temp=num+num1;
            num=num1;
            num1=temp;
            System.out.println(num1);
        } while(num+num1<10000000);
    }
}
