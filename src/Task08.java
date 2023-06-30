public class Task08 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0;i<=23;i++){
            for (int j=0;j<59;j++){
                if(i%10==j/10&&i/10==j%10) {System.out.printf("%02d:%02d \n",i,j);count ++;}
            }
        }
        System.out.println("Всего совпадений - "+count);
    }
}
