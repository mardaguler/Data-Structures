package OfficialLinkedLists;

public class doublyReverse {
    /* 30. Question */
    static DoublyLinkedList linkedList1 = new DoublyLinkedList(); // given sorted list
    public static void main(String[] args){
        linkedList1.insertLast(new DoubleNode(1));
        linkedList1.insertLast(new DoubleNode(2));
        linkedList1.insertLast(new DoubleNode(4));
        linkedList1.insertLast(new DoubleNode(5));
        linkedList1.insertLast(new DoubleNode(6));

        System.out.println("\n" + linkedList1 + "\n");
        reverse();
        System.out.println("\n" + linkedList1 + "\n");
    }

    static void reverse(){
        DoubleNode tmp = linkedList1.head;
        DoubleNode prNode = null;

        while(tmp != null){
            // actually just swapping pointers, next => previous, previous => next
            prNode = tmp.getPrevious();
            tmp.setPrevious(tmp.getNext()) ;
            tmp.setNext(prNode);
            tmp = tmp.getPrevious();
            
        }
        // head => tail, tail => head;
        DoubleNode tmpHead = linkedList1.head;
        linkedList1.head = linkedList1.tail;
        linkedList1.tail = tmpHead;    
    }

}
