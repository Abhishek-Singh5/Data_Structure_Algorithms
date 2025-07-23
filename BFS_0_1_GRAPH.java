Output :- 
            Shortest distance from node 0:
            Node 0: 0
            Node 1: 0
            Node 2: 1
            Node 3: 1
            Node 4: 2






import java.util.*;
class Main{
    static final int INF = Integer.MAX_VALUE;
    
    public static int[] zeroOneBFS(int n, ArrayList<ArrayList<int[]>> adj, int s){
        int dist[] = new int[n];
        
        Arrays.fill(dist, INF);
        dist[s] = 0;
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(s);
        
        while(!deque.isEmpty()) {
            int u = deque.pollFirst();
            
            for(int[] edge : adj.get(u)) {
                int v = edge[0], w = edge[1];
                
                if(dist[u] != INF && dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    
                    if(w == 0){
                        deque.addFirst(v);
                        
                    } else {
                        deque.addLast(v);
                    }
                }
            } 
        }
        
        return dist;
    }
    
	public static void main(String[] k) {
	    int n = 5;
	    ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
	    
	    for(int i = 0; i < n; i++){
	        adj.add(new ArrayList<>());
	    }
	    
	    // graph
	    adj.get(0).add(new int[]{1, 0});
	    adj.get(0).add(new int[]{2, 1});
	    adj.get(1).add(new int[]{3, 1});
	    adj.get(2).add(new int[]{3, 0});
	    adj.get(3).add(new int[]{4, 1});
	    
	    
	    int start = 0;
	    
	    int distance[] = zeroOneBFS(n, adj, start);
	    
	    System.out.println("Shortest distance from node " + start + ":");
	    
	    for(int i = 0; i < n; i++){
	        System.out.print("Node " + i + ": ");
	        
	        if(distance[i] == INF) {
	            System.out.println("INF");
	            
	        } else {
	            System.out.println(distance[i]);
	        }
	    }
	}
}

