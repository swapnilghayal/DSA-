public class sumofsecond {
    

    public static void main(String args[]){
        int mat[][]={{1,2,3},{2,8,5},{7,5,6}};

        int sum=0;
        for(int i=0; i<mat.length; i++)
        {
            sum+=mat[2][i];
        }
        System.out.println(sum);
    }
}
