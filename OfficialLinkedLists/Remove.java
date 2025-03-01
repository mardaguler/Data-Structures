package OfficialLinkedLists;

public class Remove {
    static LinkedList linkedList1 = new LinkedList(); 
    static LinkedList linkedList2 = new LinkedList(); 
    
    public static void main(String[] args){
        linkedList1.insertLast(new Node(1));
        linkedList1.insertLast(new Node(2));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(4));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(8));
        linkedList1.insertLast(new Node(9));
        linkedList1.insertLast(new Node(11));
        linkedList1.insertLast(new Node(13));
        linkedList1.insertLast(new Node(12));
        System.out.println("\n" + linkedList1 + "\n");

        linkedList2.insertLast(new Node(2));
        linkedList2.insertLast(new Node(4));
        linkedList2.insertLast(new Node(5));
        linkedList2.insertLast(new Node(9));
        System.out.println("\n" + linkedList2 + "\n");
        remove(linkedList1, linkedList2);
        System.out.println("\n" + linkedList1 + "\n");



    }

    static void remove(LinkedList list1, LinkedList list2 ){
        Node tmp1 = list1.head;
        Node tmp2 = list2.head;
        Node prevNode = null;

        while(tmp1 != null){
            while(tmp2 != null){
                if(tmp1.getData() == tmp2.getData()){
                    if(prevNode == null){
                        list1.head = list1.head.next;
                        tmp1 = list1.head;
                    }
                    
                    else{
                        prevNode.setNext(tmp1.getNext());
                        tmp1 = tmp1.getNext(); // silineni güncellee !!!
                    }

                }
                tmp2 = tmp2.getNext();
            }
            tmp2 = list2.head;
            prevNode = tmp1;
            tmp1 = tmp1.getNext();
            
        }

    }

}
