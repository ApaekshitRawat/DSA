
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APAEKSHIT
 */
public class bubble {
    public static void main(String[] args) {
        int n ,i ;
        int a[],temp;
        Scanner s = new Scanner(System.in); 
        System.out.println("How many elements you want to enter");
        n = s.nextInt();
        a = new int[n];
        
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++){
            
            a[i] = s.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(int k=0;k<n-i-1;k++){
                if(a[k]>a[k+1]){
                    temp = a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
            
            
        }
         System.out.println("Sorted elements are");
            for (int j = 0 ; j<n;j++) {
                System.out.println(a[j]);
            }   
        
    }
}
