package OfficialLinkedLists;

public class PrintOddNodes {
    static LinkedList linkedList = new LinkedList();
    public static void main(String[] args){
        linkedList.insertFirst(new Node(9));    //7
        linkedList.insertFirst(new Node(7));    //6
        linkedList.insertFirst(new Node(6));    //5
        linkedList.insertFirst(new Node(5));    //4
        linkedList.insertFirst(new Node(4));    //3
        linkedList.insertFirst(new Node(3));    //2
        linkedList.insertFirst(new Node(2));    //1        
        linkedList.insertFirst(new Node(1));    //0
        System.out.println("\n" + linkedList + "\n");
        printOddNodes();

    }

    static void printOddNodes(){
        LinkedList OddIndexed = new LinkedList();
        Node tmp = linkedList.head;
        Node previous = null;
        int index = 0;

        while(tmp != null){
            if(index % 2 == 0 && previous != null){
                if(OddIndexed.tail == null){
                    Node newNode = new Node(previous.data);
                    OddIndexed.head = newNode;
                    OddIndexed.tail = newNode;
                } else {
                    Node newNode = new Node(previous.data);
                    OddIndexed.tail.next = newNode;
                    OddIndexed.tail = newNode;
                }
            }
            previous = tmp;
            tmp = tmp.getNext();
            index++;
        }

        if(index % 2 == 0){
            Node newNode = new Node(previous.data);
            OddIndexed.tail.next = newNode;
            OddIndexed.tail = newNode;
        }
            

        System.out.println(OddIndexed);

    }

}
