
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
public class selectionsortLinkedList {
    
     public static void main(String[] args) {
        selectionsortLinkedList l = new selectionsortLinkedList();
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
         node temp = head;
         System.out.println("The number of nodes are " + c);
         while (temp!=null) {
        node min = temp;
        node r = temp.next;
  
        // Traverse the unsorted sublist
        while (r!=null) {
            if (min.data > r.data){
                min = r;
            }
            else{
            r = r.next;
            }
        }
  
        // Swap Data
        int x = temp.data;
        temp.data = min.data;
        min.data = x;
        temp = temp.next;
    }

 }
}