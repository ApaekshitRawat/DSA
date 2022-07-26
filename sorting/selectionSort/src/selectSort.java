
import java.util.Scanner;


/**
 *
 * @author APAEKSHIT
 */
public class selectSort {
    public static void main(String[] args) {
        int n ,i ;
        int a[],loc;
        Scanner s = new Scanner(System.in); 
        System.out.println("How many elements you want to enter");
        n = s.nextInt();
        a = new int[n];
        
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++){
            
            a[i] = s.nextInt();
        }
        for(i=0;i<n-1;i++){
            loc=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[loc]){
                    loc = j;
                }
            }
            int temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        System.out.println("The sorted elements are");
        for (int j : a) {
            System.out.println(j);
            
        }
    }
}
