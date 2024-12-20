package dsa.linkedlist;

class RecursiveSerach{

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

    // ------ -- R E C U R S I V E ---- S E A R C H ---
    public int helperfun(Node head, int key){
        if(head == null)
            return -1;

        if(head.data == key )
            return 0;

        int idx = helperfun(head.next, key);
        if(idx == -1)
            return -1;
        
        return ++idx;
    }

    public int recSearch(int key){
        return helperfun(head,key);
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
        RecursiveSerach ll = new RecursiveSerach();
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

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(9));
      
    }
}