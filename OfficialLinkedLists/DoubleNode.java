package OfficialLinkedLists;

public class DoubleNode{
    protected int data;
    protected DoubleNode next;
    protected DoubleNode previous;

    public DoubleNode(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public DoubleNode getPrevious(){
        return previous;
    }

    public void setPrevious(DoubleNode node){
        previous = node;
    }

    public void setNext(DoubleNode next){
        this.next = next;
    }

    public DoubleNode getNext(){
        return next;
    }

    public int getData(){
        return data;
    }

    /*
    public String toString(){
        return "" + data;
    }
    */
    @Override
    public String toString(){
        return "[" + this.data +"]";
    }

}

