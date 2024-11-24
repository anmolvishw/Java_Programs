class unknown{

    public class node{
        int data;
        node next;

       public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  static node head;
    public  static node tail;

    public void addfirst(int data){
        node ll = new node(data);

        if(head == null){
            head = tail = ll;
            return;
        }

        ll.next = head;
        head = ll;

    }

    public void addlast(int data){
        node ll = new node(data);
        if(head == null){
            addfirst(data);
            return;
        }

        tail.next = ll;
        tail = ll;
    }

    public void addAtIndx(int data,int indx){
        int i =0;
        node ll = new node(data);
        node temp = head;

         if(indx == 0){
            addfirst(data);
            return;
         }

        while(i < indx -1){
            temp = temp.next;
            if(temp.next == null){
                addlast(data);
                return;
            }
            i++;
        }

        ll.next = temp.next;
        temp.next = ll;
    }

    public void delfirst(){
        node ll =  head;

        if(head == null){
            System.out.println("LinkedList is Empty. Deletion Not Perform");
            return;
        }

        if(head.next == null){
            head = tail = null;
            return;
        }

       head = head.next;
       ll.next = null;
    }

    public void dellast(){
        node ll = head;

        if(head == null){
            System.out.println("LinkedList is Empty. Deletion Not Perform");
            return;
        }

        if(head.next == null){
            head = tail = null;
            return;
        }

        while(ll.next.next != null){
            ll = ll.next;
        }

        ll.next = null;
        tail = ll;
    }
    public void printll(){
        node ll = head;
        while(ll != null){
            System.out.print(ll.data+" ");
            ll = ll.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        unknown ll=new unknown();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(7);
        ll.addlast(6);
        ll.addlast(1);
        ll.addAtIndx(8, 2);
        ll.delfirst();
        ll.delfirst();
        ll.dellast();

        ll.printll();
  
    }
}