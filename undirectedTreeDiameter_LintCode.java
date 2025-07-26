import java.util.*;

class Main {
    
    public int undirectedTreeDiameter(int [][]edges){
        int n = edges.length + 1;
        
        List<Integer>[] adj = new ArrayList[n];
        
        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        
        int []firstResult = bfs(0, n, adj);
        
        int []secondResult = bfs(firstResult[1], n, adj);
        
        return secondResult[0];
    }
    
    
    public int[] bfs(int src, int n, List<Integer>[] adj){
        int []vis = new int[n];
        
        Arrays.fill(vis, -1);
        vis[src] = 0;
        int maxDist = 0;
        int farthestNode = src;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            
            for(int neighbor : adj[current]){
                if(vis[neighbor] == -1) {
                    vis[neighbor] = vis[current] + 1;
                    
                    
                    if(vis[neighbor] > maxDist) {
                        maxDist = vis[neighbor];
                        farthestNode = neighbor;
                    }
                    
                    queue.offer(neighbor);
                }
            }
        }
        
        return new int[]{maxDist, farthestNode};
    }
}
