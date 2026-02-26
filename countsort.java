import java.util.*;
public class countsort {

    public static void countsortt(int a[]){

            int large=Integer.MIN_VALUE;

            for(int i=0; i<a.length; i++){
                large=Math.max(a[i],large);
            }
            int count[]=new int[large+1];

            for(int i=0; i<a.length; i++){
                count[a[i]]++;
                           

            }
            System.out.println(Arrays.toString(count));

            int j=0;
            for(int i=0;i<count.length; i++){
                while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
                }
            }
                 System.out.println(Arrays.toString(a));

        }
    public static void main(String args[]){
        int a[]={5,2,1,2,4,3,2,1};
        countsortt(a);
    }
    
}
