package OfficialLinkedLists;

public class DeleteEvenIndexed {
    static LinkedList linkedList1 = new LinkedList(); // given sorted list
    public static void main(String[] args){
        linkedList1.insertLast(new Node(0));
        linkedList1.insertLast(new Node(2));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(5));

        System.out.println("\n" + linkedList1 + "\n");
        deleteEvenIndexed();
        System.out.println("\n" + linkedList1 + "\n");


    }

    static void deleteEvenIndexed(){
        Node tmp = linkedList1.head; 
        Node previous = null;
        int index = 0;

        while(tmp != null){
            if(previous == null){
                linkedList1.head = linkedList1.head.next;
                previous = linkedList1.head;
                tmp = linkedList1.head.next;
                index++;
            }   
            if(index % 2 == 1 && previous != null){
                previous.next = tmp.next;
            }
            else
                previous = tmp;
            tmp = tmp.getNext();
            index++;
        }

        if(tmp == null && (index % 2 == 0))
            linkedList1.tail = previous;
    }
}
