class Solution
{
    public void dfs(int row,int col,int[][] ans,int[][] image,int newColor,int delrow[],int delcol[],int iniColor){
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0;i<4;i++){
            int nrow = delrow[i]+row;
            int ncol = delcol[i]+col;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==iniColor && ans[nrow][ncol]!=newColor){
                dfs(nrow,ncol,ans,image,newColor,delrow,delcol,iniColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int iniColor=image[sr][sc];
        int[][] ans = image;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,+1,0,-1};
        dfs(sr,sc,ans,image,newColor,delrow,delcol,iniColor);
        return ans;
    }
}
