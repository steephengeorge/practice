import java.util.*;
import java.io.*;

class Soluton{
   
     static int[] findSum(int a, int b, int n){
        int result[] = new int[n];
        if( n >= 1){
            result[0] = a+b;
        }    
    
        for( int j = 1; j < n; ++j){
            result[j] = result[j-1]+(int) Math.pow(2, j) * b; 
        }
        return result;    
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           
            System.out.println(Arrays.toString(findSum(a, b, n)).replace("[","")
                                                                .replace("]","")
                                                                .replace(",",""));            
             
        }
        in.close();
    } 
    
}
