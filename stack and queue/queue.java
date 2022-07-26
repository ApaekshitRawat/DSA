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
public class queue {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size = s.nextInt();
        queue_imple q = new queue_imple(size);
        
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
                         q.Enqueue(n);
                         break;
                case 2:  q.Dequeue();
                         break;
                case 3:  q.Display();
                         break;
                case 4:  b=false;
                         break;
                
                
            }
            
        }
    }    
        
    }
    
class queue_imple{
        int size ,F,R;
        int arr[];

        public queue_imple(int x) {
            size= x;
            arr = new int[x];
            F=-1;
            R=-1;
        }
        void Enqueue(int x){
            
            if(R==size-1){
                System.out.println("The Queue is full");
            }
            else if(F==-1&&R==-1){
                R++;
                F++;
                arr[R]=x;
            }
            else{
                R++;
                arr[R] = x;
            }         
        }
        void Dequeue(){
            if(F == -1 && R == -1){
                System.out.println("The Queue is aldready empty");
                
            }
            else if (F>R){
                F = -1;
                R = -1;
            }
            else {
                int temp = arr[F];
                System.out.println("The element deleted is :"+" "+temp);
                F++;
            }
            
        }
        void Display()
      {
                if(F==-1&&R==-1){
            System.out.println("Nothing to display /Queue is empty");
        }
        else
        {
                System.out.println("The current queue is :");
            for(int i = F ; i<=R ; i++)
            {
                System.out.println(arr[i]);
            }
            
        }
      }
        