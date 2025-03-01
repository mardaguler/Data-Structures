package OfficialLinkedLists;

public class DoublySortingElements {
    static DoublyLinkedList linkedList1 = new DoublyLinkedList(); // given sorted list
    public static void main(String[] args){
        linkedList1.insertLast(new DoubleNode(5));
        linkedList1.insertLast(new DoubleNode(7));
        linkedList1.insertLast(new DoubleNode(2));
        linkedList1.insertLast(new DoubleNode(3));
        linkedList1.insertLast(new DoubleNode(4));
        linkedList1.insertLast(new DoubleNode(2));
        linkedList1.insertLast(new DoubleNode(3));
        linkedList1.insertLast(new DoubleNode(4));
        linkedList1.insertLast(new DoubleNode(3));
        linkedList1.insertLast(new DoubleNode(2));

        System.out.println("Before sorting:\n" + linkedList1 + "\n");
        System.out.println("After sorting:\n" + sortElements() + "\n");

    }

    static DoublyLinkedList sortElements(){
        DoublyLinkedList sortedList = new DoublyLinkedList();

        DoubleNode tmp = linkedList1.head;
        int largest = tmp.getData();
        
        while(tmp != null){                 // find largest and set,set largest (if largest somewhere excpet first element)
            if(tmp.previous != null && tmp.next != null){
                if(largest < tmp.next.getData())
                    largest = tmp.next.getData();
                if(tmp.getData() > largest)
                    largest = tmp.getData();
            }
            tmp = tmp.getNext();     
        }

        int frequency[] = new int[largest + 1]; 
        /*
            // largest is 5 (from 0 to 5 = 6 length), 
            // indecies values are freq of that index number 
            // which the integer we are interested in
        */

        
        tmp = linkedList1.head; // bec. tmp is null after first while loop
        while(tmp != null){
            frequency[tmp.getData()]++;
            tmp = tmp.getNext();
        }
        

        for (int i = 0; i <= largest; i++)              // which number
            for(int j = 0; j < frequency[i]; j++){      // at which frequency 
                DoubleNode newNode = new DoubleNode(i);
                if(sortedList.head == null){
                    sortedList.head = newNode;
                    sortedList.tail = newNode;
                }

                else
                    sortedList.tail.next = newNode;
                newNode.previous = sortedList.tail;
                sortedList.tail = newNode;
            }
        return sortedList;
    }
}
