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
