
import java.util.Scanner;


/**
 *Linked list implementation.
 * @author APAEKSHIT
 */
public class linkedList {
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
    public void InsertAtPos(){
        int data;
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter the data");
        data = s.nextInt();
        node new_node = new node(data);
        System.out.println("Enter the positon of the node to be inserted");
                  int p = s.nextInt();
                  node temp1 = head;
                  for(int i =0;i<p-2;i++){
                      temp1 = temp1.next;
                  }
                  new_node.next = temp1.next;
                  temp1.next = new_node;
        
        
    }
    public void deleteAtbegining(){
        node temp = head;
       temp=temp.next;
       head=temp;
    }
    public void deleteAtlast(){
        node temp = head;
        node ptr = temp.next;
        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
    }
    public void deleteAtPos(){
        System.out.println("Enter the position of the  element which needs to be deleted");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        node temp=head;
        node ptr = temp.next;
        for(int i=0;i<p-2;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        
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
    
    public static void main(String[] args) {
        linkedList l = new linkedList();
        boolean flag = true;
        while (flag) {            
        System.out.println("Enter 1 to insert at begining");
        System.out.println("Enter 2 to insert at last");
            System.out.println("Enter 3 to insert at position");
            System.out.println("Enter 4 to traverse");
            System.out.println("Enter 5 to delete from begining");
            System.out.println("Enter 6 to delete from last");
            System.out.println("Enter 7 to delete from position");
            System.out.println("Enter 8 to exit the loop");
            Scanner s = new Scanner(System.in);;
            int c = s.nextInt();
            switch(c){
                
                case 1:l.InsertAtbegining();
                    break;
                    
                case 2: l.InsertAtlast();
                    break;
                    
                case 3: l.InsertAtPos();
                    break;
                    
                case 4: l.traverser();
                    break;
                    
                case 5: l.deleteAtbegining();
                    break;
                    
                case 6 : l.deleteAtlast();
                    break;
                    
                case 7: l.deleteAtPos();
                    break;
                    
                case 8: flag=false;
                    break;
                    
                    default:System.out.println("Enter a valid choice");
                    break;
              
            }   
        } 
    }
}
