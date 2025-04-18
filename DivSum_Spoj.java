import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int t = s1.nextInt();
        
        int N = 500001;

        int sumDivisor[] = new int[N];
        
        for(int i = 1; i < N; i++){
            for(int j = 2*i; j < N; j += i){


                sumDivisor[j] += i;
            }
        }
        
        while(t > 0){
            int n = s1.nextInt();
            
            System.out.println(sumDivisor[n]);
            
            t--;
        }
    }
}
