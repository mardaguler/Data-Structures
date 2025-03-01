package OfficialLinkedLists;

public class PrimeDivisors {
    static LinkedList linkedList1 = new LinkedList(); // given sorted list
    public static void main(String[] args){
        
        LinkedList primedivisors = primeDivisors(200);
        System.out.println("\n" + primedivisors + "\n");

    }
    static boolean isPrime(int Num){
        for (int i = 2; i < Num; i++){
            if(Num % i == 0)
                return false;
        }
        return true;
    }

    static LinkedList primeDivisors (int N){
        LinkedList primes = new LinkedList();

        // Prime numbers added to the tail in primes
        for (int i = 2; i < N; i++){
            if(isPrime(i)){
                Node newNode = new Node(i);
                if(primes.head == null){
                    primes.head = newNode;
                    primes.tail = newNode;
                }

                else
                    primes.tail.next = newNode;
                primes.tail = newNode;
            }
        } 

        //Traversing
        Node tmp = primes.head;

        // new list to return prime divisors
        LinkedList primeDivisors = new LinkedList();

        while(tmp != null){
            if(N % tmp.data == 0){ // 200 % 2 = 100
                N /= tmp.data;      // N= 100
                Node newNode = new Node(tmp.data);
                if(primeDivisors.head == null){
                    primeDivisors.head = newNode;
                    primeDivisors.tail = newNode;
                }
                else
                    primeDivisors.tail.next = newNode;
                primeDivisors.tail = newNode;
            }

            else
                tmp = tmp.getNext();
        }

        return primeDivisors;


    }

}
