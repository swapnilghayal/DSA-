public class sparialmatrix {

    public static void main(String args[]){

        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int startrow = 0;
        int endrow = a.length - 1;        // ✅ fixed
        int startcol = 0;
        int endcol = a[0].length - 1;     // ✅ fixed

        while(startrow <= endrow && startcol <= endcol)
        {

            // top row
            for(int j = startcol; j <= endcol; j++)
            {
                System.out.print(a[startrow][j] + " ");   // print not println
            }

            // right column
            for(int i = startrow + 1; i <= endrow; i++)
            {
                System.out.print(a[i][endcol] + " ");
            }

            // bottom row
            if(startrow < endrow)   // ❌ removed return, use condition
            {
                for(int j = endcol - 1; j >= startcol; j--)
                {
                    System.out.print(a[endrow][j] + " ");
                }
            }

            // left column
            if(startcol < endcol)   // ❌ removed return, use condition
            {
                for(int i = endrow - 1; i >= startrow + 1; i--)
                {
                    System.out.print(a[i][startcol] + " ");
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
}