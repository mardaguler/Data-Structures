package OfficialLinkedLists;

public class Intersection {
    static LinkedList list1 = new LinkedList();
    static LinkedList list2 = new LinkedList();

    public static void main(String[] args){
        list1.insertLast(new Node(1));
        list1.insertLast(new Node(3));
        list1.insertLast(new Node(5));
        list1.insertLast(new Node(7));
        list1.insertLast(new Node(11));
        list1.insertLast(new Node(12));

        System.out.println("\n" + list1 + "\n");

        list2.insertLast(new Node(1));
        list2.insertLast(new Node(2));
        list2.insertLast(new Node(6));
        list2.insertLast(new Node(7));
        list2.insertLast(new Node(9));
        list2.insertLast(new Node(11));

        System.out.println("\n" + list2 + "\n");
        LinkedList inter = intersection(list1, list2);
        System.out.println(inter);

    }

    static LinkedList intersection(LinkedList List1, LinkedList List2){
        LinkedList interSexList = new LinkedList();
        Node p1 = List1.head;
        Node p2 = List2.head;

        while(p1 != null && p2 != null){
            if(p1.getData() == p2.getData()){
                Node newNode = new Node(p1.data);
                if(interSexList.tail == null){
                    interSexList.tail = newNode;
                    interSexList.head = newNode;
                }
                else
                    interSexList.tail.setNext(newNode);
                interSexList.tail = newNode;

                p1 = p1.getNext();
                p2 = p2.getNext();
            }
            if(p1 != null && p2 != null){
                if(p1.getData() < p2.getData())
                    p1 = p1.getNext();
                if(p1.getData() > p2.getData())
                    p2 = p2.getNext();
            }

        }

        return interSexList;

    }
}
