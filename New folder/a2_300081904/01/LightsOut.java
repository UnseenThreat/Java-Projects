import java.util.ArrayList;


/**
 * The class <b>LightsOut</b> is the
 * class that implements the method to
 * computs solutions of the Lights Out game.
 * It contains the main of our application.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class LightsOut {

    // Your variables here
    private static int width;
    private static int height;

    /**
     * The method <b>solve</b> finds all the 
     * solutions to the <b>Lights Out</b> game 
     * for an initially completely ``off'' board 
     * of size <b>widthxheight</b>, using a  
     * Breadth-First Search algorithm. 
     *
     * It returns an <b>ArrayList&lt;Solution&gt;</b> 
     * containing all the valid solutions to the 
     * problem.
     *
     * During the computation of the solution, the 
     * method prints out a message each time a new 
     * solution  is found, along with the total time 
     * it took (in milliseconds) to find that solution.
     *
     * @param width
     *  the width of the board
     * @param height
     *  the height of the board
     * @return
     *  an instance of <b>ArrayList&lt;Solution&gt;</b>
     * containing all the solutions
     */
    public static ArrayList<Solution> solve(int width, int height){

        //Your code here
        long starttime;
        long stoptime;
        long elapsedtime;
        ArrayListSolutionQueue partialSolutions = new ArrayListSolutionQueue();
        ArrayList<Solution> solutions = new ArrayList<Solution>();
        Solution initial;
        Solution current;
        Solution tcopy;
        Solution fcopy;

        starttime = System.currentTimeMillis();
        initial = new Solution(width, height);
        partialSolutions.enqueue(initial);

        do{
            
            current = partialSolutions.dequeue();
            //partialSolutions.dequeue();

            if((current.isSuccessful()) && (current.isReady())){
                
                stoptime = System.currentTimeMillis();
                solutions.add(current);
                System.out.println("Solution found in " + (stoptime -starttime) + " milisecondes.");
                starttime = System.currentTimeMillis();

            }
            else{
                
                tcopy = new Solution(current);
                fcopy = new Solution(current);

                tcopy.setNext(true);
                fcopy.setNext(false);

                partialSolutions.enqueue(tcopy);
                partialSolutions.enqueue(fcopy);

            }

        } while(partialSolutions.isEmpty() != true);

        return solutions;

        
    }

    /**
     * <b>main</b> method  calls the method <b>solve</b> 
     * and then prints out the number of solutions found,
     * as well as the details of each solution.
     *
     * The <b>width</b> and <b>height</b> used by the 
     * main are passed as runtime parameters to
     * the program. If no runtime parameters are passed 
     * to the program, or if the parameters are incorrect,
     * then the default values are used.
     *
     * @param args
     *  Strings array of runtime parameters
     */
    public static void main(String[] args) {

        StudentInfo.display();

        //Your code here
        if (args.length == 0) {
            width = 3;
            height = 3;
          } else {
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
          }
          ArrayList<Solution> solutions = new ArrayList<Solution>();
          solutions = solve(width, height);
          System.out.println("Le nombre de solutions dans un tableau de "+ width +"x"+height+" : "+(solutions.size()));
          for (int i=0; i<solutions.size(); i++) {
            System.out.println("*************");
            System.out.println(solutions.get(i).toString());
          }
        
    }
}