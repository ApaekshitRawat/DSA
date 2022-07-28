
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
public class bubbleLinkedList {
    
    public static void main(String[] args) {
        bubbleLinkedList l = new bubbleLinkedList();
        boolean flag = true;
        while (flag) {            
        System.out.println("Enter 1 to insert at begining");
        System.out.println("Enter 2 to insert at last");
            System.out.println("Enter 3 to insert at position");
            System.out.println("Enter 4 to traverse");
            System.out.println("Enter 5 to sort");
            System.out.println("Enter 6 to exit the loop");
            Scanner s = new Scanner(System.in);;
            int c = s.nextInt();
            switch(c){
                
                case 1:l.InsertAtbegining();
                    break;
                    
                case 2: l.InsertAtlast();
                    break;
                             
                case 4: l.traverser();
                    break;
                       
                case 5: l.sort();
                    break;
                    
                case 6: flag=false;
                break;
                    
                    default:System.out.println("Enter a valid choice");
                    break;
              
            }   
        } 
    
        
    }
    
    static class node{   //main node class for defining the structure of the list.
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    node head = null;
    
    
    public void InsertAtbegining(){
        int data , n;
        Scanner s = new Scanner(System.in);
                    
            
        System.out.println("Enter the data");
        data = s.nextInt();
        node new_node = new node(data);
        
        if(head == null){
            head = new_node;
        }
        else{
               new_node.next =head;
                head=new_node;
              }
    }
    public void InsertAtlast(){
        System.out.println("Enter the data");
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        node new_node = new node(data);
             node temp = head;
             while (temp.next!=null){
              temp = temp.next;
             }
             temp.next=new_node;
          }
     public void traverser(){
        node temp=head;
        if(head == null ){
            System.out.println("The list is empty");
            
        }
        else{
            System.out.println("The list is ");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
                
            }
        }       
    }
     
     public void sort(){
         int c=0;
         if(head!=null){
             node temp3 = head;
             while(temp3!=null){
                 temp3 = temp3.next;
                 c += 1;
             }
         }
         System.out.println("The number of nodes are " + c);
         for(int i =0 ; i<c ; i++){
             node temp = head;
                 node temp1 = temp.next;
             for(int j=0 ; j<c-i-1 ; j++){
                 
                 int d;
                 if(temp.data>temp1.data){
                     d= temp1.data;
                     temp1.data = temp.data;
                     temp.data = d;    
                 } 
                 temp = temp1;
                 temp1 = temp1.next;
                 
             }
        }
         System.out.println("The sorted array is : ");
         node temp2 = head;
         while(temp2!=null){
             System.out.println(temp2.data + " ");
             temp2 = temp2.next;
         }
     }
}
