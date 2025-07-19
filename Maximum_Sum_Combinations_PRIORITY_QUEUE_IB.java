Problem Description :-

Given two equally sized 1-D arrays A, B containing N integers each.
A sum combination is made by adding one element from array A and another element of array B.
Return the maximum C valid sum combinations from all the possible sum combinations.



Problem Constraints
1 <= N <= 105
1 <= A[i] <= 105
1 <= C <= N



Input Format
First argument is an one-dimensional integer array A of size N.
Second argument is an one-dimensional integer array B of size N.
Third argument is an integer C.



Output Format
Return a one-dimensional integer array of size C denoting the top C maximum sum combinations.

NOTE:
The returned array must be sorted in non-increasing order.



Example Input
Input 1:

 A = [3, 2]
 B = [1, 4]
 C = 2
Input 2:

 A = [1, 4, 2, 3]
 B = [2, 5, 1, 6]
 C = 4


Example Output
Output 1:

 [7, 6]
Output 1:

 [10, 9, 9, 8]


Example Explanation
Explanation 1:

 7     (A : 3) + (B : 4)
 6     (A : 2) + (B : 4)
Explanation 2:

 10   (A : 4) + (B : 6)
 9   (A : 4) + (B : 5)
 9   (A : 3) + (B : 6)
 8   (A : 3) + (B : 5)



public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
    
        int n = A.size();
        int m = B.size();
        
        Collections.sort(A);
        Collections.sort(B);
        
        PriorityQueue<Pair> queue = new PriorityQueue<>(Collections.reverseOrder());
        Set<PairIndex> seen = new HashSet<>();
        
        int i = n - 1, j = m - 1;
        queue.add(new Pair(A.get(i) + B.get(j), i, j));
        seen.add(new PairIndex(i, j));
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(C > 0 && !queue.isEmpty()) {
            Pair top = queue.poll();
            result.add(top.sum);
            C--;
            
            i = top.i;
            j = top.j;
            
            
            if(i > 0 && !seen.contains(new PairIndex(i - 1, j))) {
                queue.add(new Pair(A.get(i - 1) + B.get(j), i - 1, j));
                seen.add(new PairIndex(i - 1, j));
            }
            
            if(j > 0 && !seen.contains(new PairIndex(i, j - 1))) {
                queue.add(new Pair(A.get(i) + B.get(j - 1), i, j - 1));
                seen.add(new PairIndex(i, j - 1));
            }
        }
        
        return result;
    }


static class Pair implements Comparable<Pair> {
    int sum, i, j;
    
    Pair(int sum, int i, int j){
        this.sum = sum;
        this.i = i;
        this.j = j;
    }
    
    public int compareTo(Pair other){
        return Integer.compare(this.sum, other.sum);
    }
}

static class PairIndex {
    int i, j;
    
    PairIndex(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        
        if(!(obj instanceof PairIndex)){
            return false;
        }
        
        PairIndex other = (PairIndex) obj;
        
        return this.i == other.i && this.j == other.j;
    }
    
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
}
