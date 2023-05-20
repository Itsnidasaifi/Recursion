public class Nto1 {
    public static void main(String[] args) {
        int n=6;
        print(n);
        
    }
    static void print(int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.println(n);
        //return -1;

    }
}
