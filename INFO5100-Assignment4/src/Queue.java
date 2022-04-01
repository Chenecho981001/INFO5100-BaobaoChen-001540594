import org.w3c.dom.Node;

public class Queue<T> {
    private Node head;
    private Node last;
    private int N;


    public class Node{
        public T item;
        public Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public Queue(){
        this.head = new Node(null,null);
        this.last = null;
        this.N = 0;
    }

// 1.  void add(T data)
    public void add(T item){
        if(last == null){
            last = new Node(item,null);
            head.next = last;
        }else{
            Node oldLast = last;
            last = new Node(item,null);
            oldLast.next = last;
        }
        this.N ++;
    }


//2. T remove()
    public T remove(){
        if (isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        if (isEmpty()){
            return null;
        }
        return oldFirst.item;
    }



//3. T peek()
    public T peek(){
        if (isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        if (isEmpty()){
            return null;
        }
        return oldFirst.item;
    }

//4. boolean isEmpty()
    public boolean isEmpty(){
        return N == 0;
    }


//5.thread safe
    private static  Queue  q;
    private static Object obj = new Object();
    private String QueueName = "";
    public static Queue getInstance(){

        if(q == null){
            synchronized (obj){
                if(q == null){
                    q = new Queue();
                }
            }
        }
        return  q;
    }


}
