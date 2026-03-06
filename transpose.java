import java.util.*;
public class transpose {
    
    public static void main(String args[]){
        int mat[][]={{1,2,2},{1,4,5}};
        int row=2,column=3;
       
       
        int tran[][]=new int[column][row];
 for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
               tran[j][i]=mat[i][j];
            }
        }
    
        for(int i=0; i<tran.length; i++)
        {
            for(int j=0; j<tran[0].length; j++)
            {
                System.out.print(tran[i][j]);
            }
              System.out.println();
        }
      
    }
}
