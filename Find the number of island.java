//BFS traversal
class Solution {
    // Function to find the number of islands.
    public void bfs(int row,int col,char[][] grid,int[][] vis){
        vis[row][col]=1;//visited
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int delrow = -1;delrow<=1;delrow++){
                for(int delcol = -1;delcol<=1;delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'&& vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
        
    }
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;//row
        int m = grid[0].length;//col
        int[][] vis = new int[n][m];
        int count = 0;
        for(int row =0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    bfs(row,col,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }
}

//Time Complexity : O(n^2)
//Space Complexity : O(n^2)
