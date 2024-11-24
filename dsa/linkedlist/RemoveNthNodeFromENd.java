package dsa.linkedlist;

class RemoveNthNodeFromENd{

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){

        // #1 Create New node 
        Node ll = new Node(data);
        size++;
        if (head == null){
            head = tail = ll;
            return;            
        }

        // #2 init head 
        ll.next = head;

        // #3 init new node to head
        head = ll;
    }

    public void addLast(int data){
            Node ll = new Node(data);
            size++;
            if(head == null){
                head = tail = ll;
                return;
            }
            tail.next = ll;
            tail = ll;
    }

    public void addInIdx(int data,int idx){
        int i=0;
        Node ll = new Node(data);
        size++;
        Node temp = head;

        if (idx == 0 ){
            addFirst(data);
            return;
        }
        
        while (i<idx-1) {
            temp = temp.next;
            if(temp.next == null){
                addLast(data);
                return;
            }
            i++;
        }

        ll.next = temp.next;
        temp.next = ll;
    }

    // ------ -- D E L E T E ---- Nth ----N O D E ---- F R O M ---- E N D ---

    public void removeNthNode_End(int n){
         int sz =0; 
         Node temp =head;

         while(temp!=null){
            temp = temp.next;
            sz++;
         }

         if(n == sz){
            head = head.next;
            size--;
            return;
         }

         int i=1;
         int itoFind = sz - n;
         Node prev = head;

         while(i<itoFind){
            prev = prev.next;
            i++;
         }
         if(itoFind + 1 == sz){
            prev.next  = prev.next.next;
           tail = prev;
           size--;
           return;

         }
         prev.next  = prev.next.next;
         size--;
         
    }
   
    
    public  void printLL (){
        Node ll = head;
        while(ll != null){
            System.out.println(ll.data);
            ll = ll.next;
        }

        System.out.println("Size of LL = "+size);
    
    }
    public static void main(String[] args) {
        RemoveNthNodeFromENd ll = new RemoveNthNodeFromENd();
        ll.addFirst(0);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(5);
      
        // ll.printLL(); 
        
        // ll.addInIdx(1,0);
        // ll.addInIdx(9,6);

        ll.printLL();
        System.out.println("Head = "+head.data); 
        System.out.println("Tail = "+tail.data);

      System.out.println("Hello World");
        
        ll.printLL();
        System.out.println("Head = "+head.data); 
        System.out.println("Tail = "+tail.data);

        System.out.println("Hello World");
        ll.removeNthNode_End(1);
        ll.removeNthNode_End(1);

        ll.printLL();
        System.out.println("Head = "+head.data); 
        System.out.println("Tail = "+tail.data);
    }
}