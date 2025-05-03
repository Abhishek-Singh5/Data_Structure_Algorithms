class Solution {
    
    ArrayList<String> answer = new ArrayList<>();
    ArrayList<Character> currentSeq = new ArrayList<>();
    int visited[][];
    
    public void recursion(int i, int j, int mat[][], int n){
        
        // base case
        if(i == n-1  &&  j == n-1){
            StringBuilder currentAnswer = new StringBuilder();
            for(int k = 0; k < currentSeq.size(); k++){
                currentAnswer.append(currentSeq.get(k));
            }
            
            answer.add(currentAnswer.toString());
            return;
        }
        
        // Recursive Case
        
        // UP move
        
        if(i >= 1  &&  mat[i-1][j] == 1  &&  visited[i-1][j] == 0){  
            currentSeq.add('U');
            visited[i-1][j] = 1;
            
            recursion(i-1, j, mat, n);
            
            currentSeq.remove(currentSeq.size() - 1);
            visited[i-1][j] = 0;
        }
        
        
        // Down move
        
        if(i+1 < n  &&  mat[i+1][j] == 1  &&  visited[i+1][j] == 0){  
            currentSeq.add('D');
            visited[i+1][j] = 1;
            
            recursion(i+1, j, mat, n);
            
            currentSeq.remove(currentSeq.size() - 1);
            visited[i+1][j] = 0;
        }
        
        // LEFT move
        
        if(j >= 1  &&  mat[i][j-1] == 1  &&  visited[i][j-1] == 0){  
            currentSeq.add('L');
            visited[i][j-1] = 1;
            
            recursion(i, j-1, mat, n);
            
            currentSeq.remove(currentSeq.size() - 1);
            visited[i][j-1] = 0;
        }
        
        
        // RIGHT move
        
        if(j+1 < n  &&  mat[i][j+1] == 1  &&  visited[i][j+1] == 0){  
            currentSeq.add('R');
            visited[i][j+1] = 1;
            
            recursion(i, j+1, mat, n);
            
            currentSeq.remove(currentSeq.size() - 1);
            visited[i][j+1] = 0;
        }
        
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        int n = maze.length;
        
        visited = new int[n][n];
        
        if(maze[0][0] == 1){
            visited[0][0] = 1;
            recursion(0, 0, maze, n);
        }
        
        if(answer.isEmpty()) {
            answer.add("-1");
        }
        
        return answer;
        
        
        
    }
}
