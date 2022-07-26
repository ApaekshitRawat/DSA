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
public class circularQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the element");
        int size =s.nextInt();
        queuee1 q= new queuee1(size);
         boolean b=true;
        while (b) {
            System.out.println("Enter 1 as a choice for Enqueuing ");
            System.out.println("Enter 2 as a choice for Dequeuing ");
            System.out.println("Enter 3 as a choice for Displaying ");
            System.out.println("Enter 4 as a choice for ending the program ");
            int c = s.nextInt();
            switch(c){
                case 1 : System.out.println("Enter the number you want to enter in the queue");
                         int n =s.nextInt();
                         q.enqueue(n);
                         break;
                case 2:  q.dequeue();
                         break;
                case 3:  q.display();
                         break;
                case 4:  b=false;
                         break;
                
                
            }
    }
}
}


class queuee1 {
    
    int size , F,R;
    int arr[];

    public queuee1(int x) {
        arr=new int[x];
        size =x ;
        F=-1;
        R=-1;
        
    }
    
    void enqueue(int x){
        
        if(F==0 && R==size-1  || R==F-1){
            System.out.println("The queue is full");
        }
        else if(F==-1 && R==-1){
            F++;
            R++;
            arr[R]=x;
        }
        else {
            R=(R+1)%size;
            arr[R]=x;
        }
        
        
        
    }
    void dequeue(){
        if(F==-1){
            System.out.println("The queue is aldready empty");
            
        }
        else{
            System.out.println("The deleted element is"+" "+arr[F]);
            F=(F+1)%size;
        }
    }
    void display()
    {
        if(F==-1){
            System.out.println("The queue is empty");   
        }
        else{
            
            for(int i=F ;i<R;i=(i+1)%size){
                System.out.println(arr[i]);
            }
        }
    }
    
}

