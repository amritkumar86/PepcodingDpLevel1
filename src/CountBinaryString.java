import java.util.Scanner;

public class CountBinaryString {

    public static void main(String[] args) throws Exception {

        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();

        int binarystring   =  countBinaryString(n);
        System.out.println("Number of String which doesn't have consecutive zeros - " + binarystring);
    }

    private static int countBinaryString(int n) {

        int res   = 0 ;

        int [] strendwithzero  = new int[n+1];
        int [] strendwithone  = new int[n+1];

        strendwithzero[0]=0;
        strendwithone[0]=0;
        strendwithone[1]=1;
        strendwithzero[1]=1;

       for(int i  = 2 ; i <= n ; i++)
       {

           strendwithzero[i] = strendwithone[i-1];
           strendwithone[i] = strendwithone[i-1]+strendwithzero[i-1];
           System.out.println(strendwithone[i]);
           System.out.println(strendwithzero[i]);
       }


         res  = strendwithone[n]+strendwithzero[n];
            return res;
    }
}
