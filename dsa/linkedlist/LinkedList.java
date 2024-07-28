package dsa.linkedlist;

class LinkedList{

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

    public void addFirst(int data){

        // #1 Create New node 
        Node ll = new Node(data);

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

    public  void printLL (){
        Node ll = head;
        while(ll != null){
            System.out.println(ll.data);
            ll = ll.next;
        }
    
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
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

    }
}