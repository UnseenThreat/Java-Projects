public interface Queue<E> {
 
    // YOUR CODE HERE
    public abstract void enqueue( E obj );
    public abstract E dequeue();
    public abstract boolean isEmpty();
    public abstract int size();
    
}
