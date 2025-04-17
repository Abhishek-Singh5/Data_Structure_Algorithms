import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        int countDivisor[] = new int[n];
        int sumDivisor[] = new int[n];
        
        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j += i){
                
                countDivisor[j]++;
                sumDivisor[j] += i;
            }
        }
        
        for(int i = 1; i < n; i++){
            System.out.println(i + "->" + countDivisor[i] + " ");
        }
        
        for(int i = 1; i < n; i++){
            System.out.println(i + "->" + sumDivisor[i] + " ");
        }
    }
}
