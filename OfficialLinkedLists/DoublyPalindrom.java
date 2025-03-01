package OfficialLinkedLists;

public class DoublyPalindrom {
    static DoublyLinkedList list1 = new DoublyLinkedList();

    public static void main(String[] args){
        list1.insertLast(new DoubleNode(1));
        list1.insertLast(new DoubleNode(3));
        list1.insertLast(new DoubleNode(5));
        list1.insertLast(new DoubleNode(4));
        list1.insertLast(new DoubleNode(5));
        list1.insertLast(new DoubleNode(3));
        list1.insertLast(new DoubleNode(1));

        System.out.println("\n" + list1 + "\n");
        System.out.println(isPalindrom());
    }

    static boolean isPalindrom(){
        DoubleNode p1 = list1.head;
        DoubleNode p2 = list1.tail;

        while(p1 != p2  || p1.getNext() == p2){
            if(p1.getData() == p2.getData()){
                p1 = p1.getNext();
                p2 = p2.getPrevious();
            }
    
            else
                return false;

        } 
        return true;
    }

}
