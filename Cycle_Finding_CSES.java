You are given a directed graph, and your task is to find out if it contains a negative cycle, and also give an example of such a cycle.

Input:-
    The first input line has two integers n and m: the number of nodes and edges. The nodes are numbered 1,2,\ldots,n.
    After this, the input has m lines describing the edges. Each line has three integers a, b, and c: there is an edge from node a to node b whose length is c.

Output:-
    If the graph contains a negative cycle, print first "YES", and then the nodes in the cycle in their correct order. If there are several negative cycles, you can print any of them. If there are no negative cycles, print "NO".
    

Constraints:-
    1 \le n \le 2500
    1 \le m \le 5000
    1 \le a,b \le n
    -10^9 \le c \le 10^9


Example:-
      Input:-
          4 5
          1 2 1
          2 4 1
          3 1 1
          4 1 -3
          4 3 -2

    Output:-
          YES
          1 2 4 1









import java.util.*;
class Main {
    static class Edge {
        int a;
        int b;
        long c;
        
        Edge(int a, int b, long c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int m = s1.nextInt();
        
        List<Edge> edges = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            int a = s1.nextInt();
            int b = s1.nextInt();
            long c = s1.nextInt();
            
            edges.add(new Edge(a, b, c));
        }
        
        for(int i = 1; i <= n; i++){
            edges.add(new Edge(0, i, 0));
        }
        
        long[] distance = new long[n + 1];
        int[] predecessor = new int[n + 1];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;
        Arrays.fill(predecessor, -1);
        
        for(int i = 0; i < n; i++){
            for(Edge e : edges){
                if(distance[e.a] != Long.MAX_VALUE  &&  distance[e.a] + e.c < distance[e.b]) {
                    distance[e.b] = distance[e.a] + e.c;
                    predecessor[e.b] = e.a;
                }
            }
        }
        
        int lastUpdated = -1;
        boolean hasCycle = false;
        
        for(Edge e : edges){
            if(distance[e.a] != Long.MAX_VALUE &&  distance[e.a] + e.c < distance[e.b]){
                hasCycle = true;
                lastUpdated = e.b;
                predecessor[e.b] = e.a;
                break;
            }
        }
        
        if(!hasCycle) {
            System.out.println("NO");
            return;
        }
        
        int v = lastUpdated;
        for(int i = 0; i < n; i++){
            v = predecessor[v];
        }
        
        
        List<Integer> cycle = new ArrayList<>();
        int u = v;
        
        do {
            
            cycle.add(u);
            u = predecessor[u];
            
        } while (u != v);
        
        Collections.reverse(cycle);
        
        
        System.out.println("YES");
        
        for(int i = 0; i < cycle.size(); i++){
            System.out.print(cycle.get(i));
            
            if(i < cycle.size() - 1){
                System.out.println(" ");
            }
        }
        
        System.out.println();
    }
}











