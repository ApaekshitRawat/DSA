
package arrays;

import java.util.Scanner;

/**
 *
 * @author APAEKSHIT
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        int b[] = new int[size+1];
        System.out.println("Enter the elements of arrays");
        for (int i =0; i<a.length ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("The array is :");
        for (int i : a) {
            System.out.println(i);         
        }
        System.out.println("Now enter the value of index where new element is to be inserted ");
        int index = s.nextInt();
        System.out.println("Now Enter the value");
        int value = s.nextInt();
        
        for(int i=0;i<b.length;i++)
        {
            if(i<index){
                b[i] = a[i];
            }
            else if (i==index) {
                b[i] = value;
            }
            else{
                b[i] = a[i-1];
            }
        }
        System.out.println("The new array is :");
        for (int i : b) {
            System.out.println(i);
        }
        
        System.out.println("Now for Deletion");
        System.out.println("enter the index where the elements need to be deleted");
        index = s.nextInt();
        for(int i=0; i<a.length;i++){
            if(i<index){
                b[i] = a[i];
            }
            else if (i==index) {
                continue;
            }
            else{
                b[i-1] = a[i];
            }
        }
        for (int i : b) {
            System.out.println(i);
        }
        
    }
    
}
