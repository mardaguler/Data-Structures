package OfficialLinkedLists;

public class DoublyGetEvenOnes{
    static DoublyLinkedList linkedList = new DoublyLinkedList();
    public static void main(String[] args){
        linkedList.insertFirst(new DoubleNode(10));
        linkedList.insertFirst(new DoubleNode(9));
        linkedList.insertFirst(new DoubleNode(7));
        linkedList.insertFirst(new DoubleNode(5));
        linkedList.insertFirst(new DoubleNode(4));
        linkedList.insertFirst(new DoubleNode(2));
        linkedList.insertFirst(new DoubleNode(1));
        System.out.println("\n" + linkedList + "\n");
        
        System.out.println("\n" + getEvenOnes() + "\n");
    }

    static DoublyLinkedList getEvenOnes(){ // newlist = 4 <-> 7 <-> 10 (i did insertfirst)
        DoublyLinkedList evenIndexed = new DoublyLinkedList();
        DoubleNode tmp = linkedList.head.next;
        int index = 1;

        while(tmp != null){
            if(index % 2 == 0){
                DoubleNode newNode = new DoubleNode(tmp.data);
                if(evenIndexed.tail == null){
                    evenIndexed.tail = newNode;
                } else
                    evenIndexed.head.setPrevious(newNode);
                newNode.next = evenIndexed.head;
                evenIndexed.head = newNode;    
            }
            tmp = tmp.getNext();
            index++;
        }


        return evenIndexed;
    }

}
