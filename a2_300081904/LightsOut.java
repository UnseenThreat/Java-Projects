import java.util.ArrayList;
import java.util.Queue;

public class LightsOut{

    //Instance variables
    ArrayListSolutionQueue Solutions  = new ArrayListSolutionQueue;

    public ArrayList<Solution> solve(int width, int height){

        ArrayListSolutionQueue partialSolutions =  ArrayListSolutionQueue();
        ArrayList<Solution> solutions = new ArrayList<solution>;

        do{

            current = partialSolutions.dequeue();
            //partialSolutions.dequeue();

            if((current.isSuccessful()) && (current.isReady())){

                solutions.add(current);

            }
            else{
                
                Solution tcopy = new Solution(current.setNext(true));
                Solution fcopy = new Solution(current.setNext(false));

                partialSolutions.add(tcopy);
                partialSolutions.add(fcopy);

            }

        } while(partialSolutions.isEmpty() != true)

        return solutions;

    }


    public static void main(String[] args){

       
        

    }



    
}