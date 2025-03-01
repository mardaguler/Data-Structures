package OfficialLinkedLists;

public class EvenOddSorted {
    static DoublyLinkedList linkedList1 = new DoublyLinkedList(); // given sorted list
    public static void main(String[] args){ // 6 4 9 13 0 20
        linkedList1.insertLast(new DoubleNode(2));
        linkedList1.insertLast(new DoubleNode(10));
        linkedList1.insertLast(new DoubleNode(3));
        linkedList1.insertLast(new DoubleNode(7));
        linkedList1.insertLast(new DoubleNode(6));
        linkedList1.insertLast(new DoubleNode(4));
        linkedList1.insertLast(new DoubleNode(9));
        linkedList1.insertLast(new DoubleNode(2));
        linkedList1.insertLast(new DoubleNode(13));
        linkedList1.insertLast(new DoubleNode(0));
        linkedList1.insertLast(new DoubleNode(20));

        System.out.println("\n" + linkedList1 + "\n");
        System.out.println(evenOddSorted());

    }

    static boolean evenOddSorted(){
        DoubleNode evenIndex = linkedList1.head.getNext();
        DoubleNode oddIndex = linkedList1.head;

        while(evenIndex != null && oddIndex != null){
            DoubleNode tmpevenIndex = evenIndex;
            DoubleNode tmpoddIndex = oddIndex;

            evenIndex = evenIndex.getNext().getNext();
            oddIndex = oddIndex.getNext().getNext();

            if(evenIndex != null)
                if(tmpevenIndex.getData() < evenIndex.getData())
                    return false;
            if(oddIndex != null)    
                if(tmpoddIndex.getData() > oddIndex.getData())
                    return false;  
        }

        return true;
    }

}
