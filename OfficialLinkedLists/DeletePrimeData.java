package OfficialLinkedLists;

public class DeletePrimeData {
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
        deletePrimes();
        System.out.println("\n" + linkedList + "\n");

    }

    static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        if(number < 2)
            return false;
        return true;
    }

    static void deletePrimes (){
        Node tmp = linkedList.head;
        Node previous = null;

        while(tmp != null){
            boolean prime = isPrime(tmp.data);
            if(prime && previous != null){
                previous.next = tmp.next;

            } else if(prime && previous == null) {
                linkedList.head = linkedList.head.next;
                previous = tmp;
            }
            else
                previous = tmp;
            tmp = tmp.getNext();    

        }
    }
}
