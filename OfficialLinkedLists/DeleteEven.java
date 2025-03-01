package OfficialLinkedLists;

public class DeleteEven {
    static LinkedList linkedList1 = new LinkedList(); 
    
    public static void main(String[] args){
        linkedList1.insertLast(new Node(2));
        linkedList1.insertLast(new Node(1));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(4));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(8));
        linkedList1.insertLast(new Node(10));
        linkedList1.insertLast(new Node(11));
        linkedList1.insertLast(new Node(12));
        System.out.println("\n" + linkedList1 + "\n");
        deleteEven();
        System.out.println("\n" + linkedList1 + "\n");
    }

    static void deleteEven(){
        Node tmp = linkedList1.head;
        Node prevNode = null;

        while(tmp != null){
            if(tmp.getData() % 2 == 0){
                if(prevNode == null)             //which means head value is even
                    linkedList1.head = linkedList1.head.getNext();
                else
                    prevNode.setNext(tmp.getNext());
            }   
            else
                prevNode = tmp;     // in else statment for even sequent values [5] -> [8] -> [10]
            tmp = tmp.getNext();
        }
    }
}
