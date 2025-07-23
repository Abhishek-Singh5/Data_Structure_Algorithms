Input:-

6 5
1 2
1 3
2 4
3 5
5 6
1 6


Output will be:

1 2 3 4 5 6 
Number of components - 1
0 1 1 2 2 3 
Path - 
1 3 5 6 











import java.util.*;

public class Main {

    public static void bfs(int src, int n, List<List<Integer>> adj, int[] level, int[] parent) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        level[src] = 0;

        while (!q.isEmpty()) {
            int topElement = q.poll();
            System.out.print(topElement + " ");

            for (int neighbour : adj.get(topElement)) {
                if (level[neighbour] == -1) {
                    q.add(neighbour);
                    level[neighbour] = level[topElement] + 1;
                    parent[neighbour] = topElement;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        int m = sc.nextInt(); // number of edges

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] level = new int[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(level, -1);
        Arrays.fill(parent, -1);

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (level[i] == -1) {
                count++;
                bfs(i, n, adj, level, parent);
            }
        }

        System.out.println("Number of components - " + count);

        // Single source shortest path from node 1 (or any src)
        for (int i = 1; i <= n; i++) {
            System.out.print(level[i] + " ");
        }

        System.out.println("\nPath - ");
        int src = sc.nextInt();
        int dest = sc.nextInt();

        List<Integer> path = new ArrayList<>();
        while (dest != -1) {
            path.add(dest);
            dest = parent[dest];
        }

        Collections.reverse(path);
        for (int x : path) {
            System.out.print(x + " ");
        }
    }
}
