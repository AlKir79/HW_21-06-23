public class Task06 {
    public static void main (String[] args) {
        for (int i=10000000;i<100000000;i++){
            int step = 0;
            int number=i;
            int numberTemp = number;
            boolean isUnicue = true;
            while(number>0 && isUnicue){
                int tempNumber = number%10;
                int stepTemp = 0;
                numberTemp = i;
                while(numberTemp>0 && isUnicue){
                    int tempNumber1 = numberTemp%10;
                    if(stepTemp==step) {
                    numberTemp/=10;
                    stepTemp++;
                    continue;}
                    if (tempNumber1==tempNumber) {
                        isUnicue = false;
                        break;
                    }
                    numberTemp/=10;
                    stepTemp++;
                }
                number/=10;
                step++;
            }
            if(isUnicue && i%12345==0) System.out.println(i);
        }
    }
}
