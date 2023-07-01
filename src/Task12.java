import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первоначальный суточный пробег спортсмена (x)");
        float dailyDist = in.nextFloat();
        System.out.println("Введите пробег спортсмена (y)");
        float dist = in.nextFloat();
        int day=1;
        while(dist>dailyDist){
            day++;
            dailyDist= (float) (dailyDist*1.1);
        }
        System.out.println("На "+day+" день спортсмен пробежит не менее "+dist+" км в день.");
    }
}
