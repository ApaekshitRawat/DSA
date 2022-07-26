/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackAndQueue;

import java.util.Scanner;

/**
 *
 * @author APAEKSHIT
 */
public class Stack {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the stack you want :");
        int size = s.nextInt() ,top=-1;
        Boolean loop = true;
        Stack_class ss = new Stack_class(size, top); 
        while (loop) {            
            
  
        System.out.println("Enter 1 for pushing element");
        System.out.println("Enter 2 for poping element");
        System.out.println("Enter 3 for displaying elements");
        System.out.println("Enter 4 for exiting the program");
        int c= s.nextInt();
        switch(c){
            case 1 : System.out.println("Enter the element you want to insert");
                      int p = s.nextInt();
                      int temp,temp2 ,sum=0,count=0;
                      temp = p;
                      temp2 =p;
                      while (temp!=0) {
                          temp = temp/10;
                          count++;
                          System.out.println(count);
                      }
                      for(int i =0; i<count;i++){
                          sum=(sum*10)+(temp2%10);
                          temp2= temp2 /10;
                      
                      }
                      
                      if(p==sum){
                      ss.push(p);    
                      }
                      else {
                          System.out.println("Cant be pushed , the number is not pallindrome");
                      }
                      
            break;
            
            case 2: ss.pop();
            break;
            
            case 3: ss.display();
            break;
            case 4: loop =false;
            break;
            default:System.out.println("Enter a valid number");
            break;
        
        }
              }
    }
    
    
}
class Stack_class{
    int size,top;
     int arr[];
    public Stack_class(int x , int y) {//constructor used for initialising 
        
        this.size = x;
        top = y;
        arr=new int[size];
        
    }
   
    
    void push(int x){
        
        System.out.println("size is "+size);
        if(top==size-1){ // condition for stack overflow 
            System.out.println("The Stack is aldready full");
           
        }
        else 
        {
            top += 1;
            arr[top] = x;
            System.out.println("The current stack is :");
            
            for(int i = top ; i>=0;i--){
                System.out.println(+arr[i]);
            }
        }               
    }
    void pop(){
        
        if(top==-1){  // condition for stack underflow
            System.out.println("The stack is aldready empty");
        }
        else 
        {
            int temp = arr[top];
            top--;
            System.out.println("The deleted element is :"+temp);
            System.out.println("The current stack is :");
            
            for(int i = top ; i>=0;i--){
                System.out.println(+arr[i]);
            }
        }
        
    }
    
    
    void display(){
        if(top==-1){
            System.out.println("The stack is empty , nothing to display");
        }
        else
        {
            for(int i=top;i>=0;i--){
                
                System.out.println(arr[i]);
            }
        }
        
    }
    
    
    
    
}