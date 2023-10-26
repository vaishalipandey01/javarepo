import java.util.*;
public class linkedlist {
  static  class Node {
         int data;
         Node next;
         public Node(int data){
            this.data = data;
             this.next = null;

         }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public static void addfirst(int data){
     // creation of new node ;
     Node newnNode = new Node(data);
     size++;
       // base case for onlu one node 
       if( head == null){
        head= tail=newnNode;
        return ;
       }
       // 2. new node next ==head;
       newnNode.next = head;//linking
       //3.head = newnode;
       head = newnNode;
    }
    public static void addlast(int data){
        //create
    Node newNode = new Node(data);
    size++;

    if(head == null){
        head=tail=newNode;
        return;
    }
    // new node next
    tail.next = newNode;
    // tail last
    tail = newNode;

    }
    public static void print(){
        if( head == null){
            System.out.println("ll is empty ");
        }
        Node temp = head;
        while ((temp!=null)) {
        System.out.print(temp.data+" ");
        temp = temp.next;

        }
        System.out.println();

    }
    public void addatidx(int idx, int data){
        Node newNode = new Node(data);
        size++;
        
        Node temp = head ;
        int i =0 ;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = I-1
        newNode.next = temp.next;
        temp.next = newNode;

    }
       public int removefirst(){
       
      int val = head.data;
      head = head.next;
      return val;

       }
      public int removelast(){
        if( size==0){
            System.out.println("ll is empty ");
            return Integer.MIN_VALUE;

        }else if(size==1){
       int val = head.data;
       head = tail= null;
       size =0;
       return val;
        }
        //pre i=s-2;
        Node prev = head ;
        for(int i =0; i<size-2; i++){
            prev = prev.next;

        }
        int val = tail.data;
        prev.next = null ;
        tail = prev;
        size--;
        return val;








      }
      public int itrsearch(int key){
        Node temp = head ;
        int i = 0;
        while(temp !=null){
            if(temp.data==key){
                return i;

            }
            temp =temp.next ;
            i++;
        }
        //key not found;
        return -1 ;
      }
     public static void main( String args[]){
        linkedlist ll = new linkedlist();
       
        ll.addfirst(2);

        ll.addfirst(1);

        ll.addlast(4);

        ll.addlast(5);
            ll.addatidx(2,3);
            ll.print();
       //     System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        // ll.removelast();
        // ll.print(); 
        System.out.println(ll.size);

System.out.println(ll.itrsearch(3));
System.out.println(ll.itrsearch(10));

     }
    
}
