//DFS and recurrsion
class Solution {

    public void DFS(char[][]grid,int row,int col){
        int n = grid.length;
        int m = grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m || grid[row][col]!='1'){
            return;
        }
        
        grid[row][col]='0';
        
        DFS(grid,row-1,col);
        DFS(grid,row+1,col);
        DFS(grid,row,col+1);
        DFS(grid,row,col-1);
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int count=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(grid[row][col]=='1'){
                    count++;
                    DFS(grid,row,col);
                    
                }
            }
        }
        return count;
    }
}
