
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
public class linear {
    public static void main(String[] args) {
        int n ,i , iteam ,c=0;
        int a[];
        Scanner s = new Scanner(System.in); 
        System.out.println("How many elements you want to enter");
        n = s.nextInt();
        a = new int[n];
        
        System.out.println("Enter the elements");
        for(i=0;i<a.length;i++){
            
            a[i] = s.nextInt();
        }
        
        System.out.println("The enterer elements are : ");
        for (int j : a) {
            System.out.println(j);
        }
        System.out.println("Enter elemets to find");
        iteam = s.nextInt();
         for(i=0;i<a.length;i++){
             if(a[i]==iteam){
                    c++;
                    break;
             }
         }
             if(c>0){
                 System.out.println("Iteam exist at : "+i +"Index");
             }
             else{
                 System.out.println("Iteam does not exists");
             
         }
    }
}
