
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
public class binary {
    public static void main(String[] args) {
        int n ,i , iteam ,c=0,beg,end,mid=0;
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
        
        System.out.println("Enter the element to search");
        iteam = s.nextInt();
        beg = 0; 
        end= n-1;
        
        while(beg<=end){
            mid = (beg+end)/2;
            
            if(iteam==a[mid]){
                c++;
                break;
            }
            else if (iteam>a[mid]) {
                beg=mid+1;
            }
            else if (iteam<a[mid]){
                end = mid-1;
            }
        }
                if(c>0)
                {
                    System.out.println("Iteam found at " + mid );
                }
                else{
                    System.out.println("Iteam not found");
                }
         
    }
}
