import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        boolean rows[] = new boolean[matrix.length];
        boolean columns[] = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    columns[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(rows[i]==true){
            int j=0;
          while(j<matrix[0].length){
              matrix[i][j++]=0;
          }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(columns[i]==true){
                int j=0;
            while(j<matrix.length){
                matrix[j++][i]=0;
            }
            }     
        }
    }

}
