import java.util.*;
class Main {
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();  // number of nodes
        int m = s1.nextInt();  // number of edges
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n + 1; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++){
            int x = s1.nextInt();
            int y = s1.nextInt();
            
            
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        
        // Print the adjacency list
        
        System.out.println(" Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
