package OfficialLinkedLists;

public class DeleteBetween {
    static LinkedList linkedList = new LinkedList();
    public static void main(String[] args){
        linkedList.insertFirst(new Node(19));    
        linkedList.insertFirst(new Node(17));    
        linkedList.insertFirst(new Node(15));    
        linkedList.insertFirst(new Node(9));    
        linkedList.insertFirst(new Node(6));    
        linkedList.insertFirst(new Node(5));    
        linkedList.insertFirst(new Node(4));    
        linkedList.insertFirst(new Node(3));    
        linkedList.insertFirst(new Node(2));           
        linkedList.insertFirst(new Node(1));    
        System.out.println("\n" + linkedList + "\n");

        deleteBetween(2, 6);
        System.out.println("\n" + linkedList + "\n");
    }

    static void deleteBetween(int p, int q){    // indexed between p and q, for ex p = 2, q = 6;
        Node startNode = null;
        Node endNode = null;
        Node tmp = linkedList.head;
        int index = 0;

        while(tmp != null){
            if(index == p - 1){
                startNode = tmp;
            }
                
            if(index == q){
                endNode = tmp;
                break;
            }
            tmp = tmp.next;
            index++;
        }

        startNode.next = endNode.next;
    }

}
