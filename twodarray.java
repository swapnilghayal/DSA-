import java.util.Scanner;

public class twodarray {
    
    public static void main(String[] args) {
         int a[][]=new int[3][3];
      Scanner sc=new Scanner(System.in);
      int n=a.length ,m=a[0].length;
      for(int i=0; i<n; i++){
          for(int j=0; j<m; j++)
          {
          a[i][j]=sc.nextInt();
          
          }
      }

      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }

}
