import java.util.ArrayList;
import java.util.Queue;

public class ArrayListSolutionQueue implements SolutionQueue{

    //Instance variables
    ArrayList<Solution> queue;
    //Queue<solution> queue;

    //Constructor
    public ArrayListSolutionQueue(){

          //Queue<Solution> queue = new ArrayList<Solution>;
          //ArrayList<Solution> 
          queue = new ArrayList<Solution>;
    }

    public void enqueue(Solution value){

        queue.add(value);
    
    }
    
    public Solution dequeue(){

        queue.remove(0);

    }

    public boolean isEmpty(){

        return queue.isEmpty();

    }

}