package OfficialLinkedLists;

public class DoublyLinkedList{
    protected DoubleNode head;
    protected DoubleNode tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    void insertFirst(DoubleNode newNode){ 
        if ( tail == null)
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertLast(DoubleNode newNode){
        if (head == null)
            head = newNode;
        else
            tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    void insertMiddle(DoubleNode newNode, DoubleNode previous){
        newNode.next = previous.next;
        newNode.previous = previous;
        previous.next.previous = newNode;
        previous.next = newNode;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        DoubleNode tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" <-> ");
            tmp = tmp.getNext();
            if(tmp.getNext() == null){
                result.append(tmp).append(" <-> null ");
                break;
            }
        }
        return result.toString();
    }
}
