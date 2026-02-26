// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class  insertionsort{
    
    public static void insertionsortt(int a[]){
        
        for(int i=1; i<a.length; i++)
        {
            int cur=a[i];
            int prev=i-1;
            
            while(prev>=0 && a[prev]>cur){
                a[prev+1]=a[prev];
               prev--; 
                
            }
            a[prev+1]=cur;
            
            
        }
        
        System.out.println(Arrays.toString(a));
    }
    
    
    
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        insertionsortt(a);
    }
}