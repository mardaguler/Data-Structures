package OfficialLinkedLists;

public class RemoveSingles {
    static LinkedList linkedList1 = new LinkedList(); // given sorted list
    
    public static void main(String[] args){
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(6));
        linkedList1.insertLast(new Node(7));
        linkedList1.insertLast(new Node(8));
        linkedList1.insertLast(new Node(8));
        linkedList1.insertLast(new Node(9));
        System.out.println("\n" + linkedList1 + "\n");
        removeSingles(linkedList1);
        System.out.println("\n" + linkedList1 + "\n");


    }

    static void removeSingles(LinkedList A){ // 6,7 ve 9 gitcek
        Node tmp = A.head;
        Node previous = null;

        while(tmp != null){
            if(tmp.next == null && previous.data != tmp.data){
                A.tail = previous;
                A.tail.next = null;
                break;
            }
            if(previous != null && tmp.data != previous.data && tmp.data != tmp.next.data){
                previous.next = tmp.next;
            }
            else 
                previous = tmp;
            tmp = tmp.next;    

        }
      
    }

}

