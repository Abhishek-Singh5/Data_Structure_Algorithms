Anjali and Nakul are good friends. They both had a quarrel recently while playing chess. Nakul wants to know the minimum number of moves a knight takes to reach 
from one square to another square of a chess board (8 × 8). Nakul is brilliant and he had already written a program to solve the problem. Nakul wants to know whether 
Anjali can do it. Anjali is very weak in programming. Help her to solve the problem.

A knight can move in the shape of an "L" in a chessboard - two squares either forward, backward, left, or right and then one square to its left or right. 
A knight move is valid if it moves as mentioned above and it is within the boundary of the chessboard (8 × 8).

knight

Input
There are T test cases in total. The next T lines contain two strings (start and destination) separated by a space.

The strings start and destination will only contain two characters - First character is an alphabet between 'a' and 'h' (inclusive), 
Second character is a digit between '1' and '8' (inclusive) - (Quotes just for clarity).
To know the knight moves more clearly refer to the above figure.

Output
Print the minimum number of moves a knight takes to reach from start to destination in a separate line.

Constraints
1 ≤ T ≤ 4096

Example
Input:
3
a1 h8
a1 c2
h8 c3

Output:
6
1
4












  

import java.util.*;

public class KnightMoves {
    
    static class Point {
        int x, y, dist;
        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    // All 8 possible moves for a knight
    static int[] dx = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

    static boolean isValid(int x, int y) {
        return (x >= 0 && x < 8 && y >= 0 && y < 8);
    }

    static int minKnightMoves(String start, String end) {
        if (start.equals(end)) return 0;

        boolean[][] visited = new boolean[8][8];

        int sx = start.charAt(0) - 'a';
        int sy = start.charAt(1) - '1';
        int ex = end.charAt(0) - 'a';
        int ey = end.charAt(1) - '1';

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(sx, sy, 0));
        visited[sx][sy] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == ex && current.y == ey) {
                return current.dist;
            }

            for (int i = 0; i < 8; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Point(nx, ny, current.dist + 1));
                }
            }
        }

        return -1; // should not reach here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // consume newline
        while (T-- > 0) {
            String[] input = sc.nextLine().split(" ");
            String start = input[0];
            String end = input[1];
            System.out.println(minKnightMoves(start, end));
        }
        sc.close();
    }
}
