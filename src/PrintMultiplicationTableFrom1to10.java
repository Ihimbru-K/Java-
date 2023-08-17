public class PrintMultiplicationTableFrom1to10 {

    public static void main(String[] args){
        int i, j =0;
        for(i = 1; i <= 10; i++){
            for( j = 1; j<=10; j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println("   ");
        }
    }
}
