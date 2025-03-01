package OfficialLinkedLists;

public class LastOneWins {
    static LinkedList linkedList1 = new LinkedList(); // given sorted list
    public static void main(String[] args){
        linkedList1.insertLast(new Node(1));
        linkedList1.insertLast(new Node(2));
        linkedList1.insertLast(new Node(3));
        linkedList1.insertLast(new Node(4));
        linkedList1.insertLast(new Node(5));
        linkedList1.insertLast(new Node(6));

        System.out.println("\n" + linkedList1 + "\n");
        ;
        System.out.println(lastOneWins(2));

    }

    static Node lastOneWins(int k){
        Node temp = linkedList1.head;
        linkedList1.tail.next = linkedList1.head;
        if(temp.next == null)
            return temp;
        while (temp.next != temp) {             // More than one node remains
            for (int i = 1; i < k - 1; i++) {   // Move (k-1) steps
                temp = temp.next;
            }
            temp.next = temp.next.next;         // Remove k-th node
            temp = temp.next;                   // Move to the next node
        }
        return temp;                            // Last remaining node
    
    }

}

