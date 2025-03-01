package OfficialLinkedLists;

public class ContainsDuplicants {
    static LinkedList linkedList1 = new LinkedList(); // given sorted list
    public static void main(String[] args){
        linkedList1.insertLast(new Node(0));
        linkedList1.insertLast(new Node(2));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(5));

        System.out.println("\n" + linkedList1 + "\n");
        System.out.println(containsOnlyDuplicates());

    }

    static boolean containsOnlyDuplicates(){
        Node tmp = linkedList1.head.getNext();
        Node previous = linkedList1.head;
        boolean isDuplicate = false;

        while(previous != null){
            if(previous != null && tmp != null){
                if(tmp.data == previous.data)
                    isDuplicate = true;
                tmp = tmp.getNext();
            }

            if(previous == linkedList1.tail)
                break;
                
            if(tmp == null && previous != null){
                previous = previous.getNext(); 
                tmp = previous.getNext();
            }
                
        }

        return isDuplicate;
    }

}
