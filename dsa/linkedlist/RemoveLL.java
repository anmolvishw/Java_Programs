package dsa.linkedlist;

class RemoveLL{

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

    //--------------------- R E M O V E --- C O D E -----------

    public void firstRemove(){
        Node ll = head;
        if(size == 0){
            System.out.println("LL is Empty "+Integer.MIN_VALUE);
            return;
        }
        if(head.next == null ){  // (size == 1)
            head = tail = null;
            size = 0;
            return;
        } 
        size--;
        head = head.next;
        ll.next = null; 
    }

    public void lastRemove(){
        if(size == 0){
            System.out.println("LL is Empty "+Integer.MIN_VALUE);
            return;
        }
        if(head.next == null){
            head = tail = null;
            size = 0;
            return ;
        }

        Node ll = head;

        for(int i=0; i<size -2; i++)
            ll = ll.next;

        ll.next = null;
        size--;
        tail = ll;
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
        RemoveLL ll = new RemoveLL();
        ll.addFirst(0);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(5);
      
        // ll.printLL(); 
        
        // ll.addInIdx(1,0);
        // ll.addInIdx(9,6);

        ll.printLL();
        ll.firstRemove();
        ll.printLL();
        ll.lastRemove();
        ll.printLL();
        System.out.println("Head = "+head.data); 
        System.out.println("Tail = "+tail.data);

    }
}