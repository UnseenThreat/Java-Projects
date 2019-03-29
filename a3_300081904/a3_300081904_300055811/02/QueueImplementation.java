public class QueueImplementation<E> implements Queue<E> {

    // YOUR CODE HERE
    private ArrayList<E> queue;
    
    public  QueueImplementation(){
        queue = new ArrayList<E>();
    }

    public void enqueue( E obj ){
        
        queue.add(obj);

    }
    public E dequeue(){
        
        return queue.remove(0);

    }
    public boolean isEmpty(){

        return queue.isEmpty();

    }

    public  int size(){

        return queue.size();

    }
    
}
