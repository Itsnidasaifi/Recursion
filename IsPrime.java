import java.util.Scanner;

public class IsPrime {
    public static void main(StringBuilder[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
        sc.close();
    }
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }  
        int  c=2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;


        }
        return c*c>n;
        //sc.close();
      }
    
}
