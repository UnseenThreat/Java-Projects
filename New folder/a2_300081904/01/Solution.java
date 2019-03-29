
/**
 * The class <b>Solution</b> is used
 * to store a (partial) solution to the game
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
public class Solution {


    // Your variables here
    private boolean[][] board;
    private int c;
    private int r;
    private int width;
    private int height;
    private boolean ready = false;

    /**
     * Constructor. Creates an instance of Solution 
     * for a board of size <b>widthxheight</b>. That 
     * solution does not have any board position
     * value explicitly specified yet.
     *
     * @param width
     *  the width of the board
     * @param height
     *  the height of the board
     */
    public Solution(int width, int height) {

        //Your code here
        this.board = new boolean[height][width];
        this.height = height;
        this.width = width;
        this.c = 0;
        this.r = 0;
        System.out.println(height);
        System.out.println(width);
        
    }

   /**
     * Constructor. Creates an instance of Solution 
     * wich is a deep copy of the instance received
     * as parameter. 
     *
     * @param other
     *  Instance of solution to deep-copy
     */
     public Solution(Solution other) {

        //Your code here
        this.board = new boolean[other.r][other.c] ;
        this.c = other.c;
        this.r = other.r;
        
        for (int r=0; r<height; r++){
            
            for (int c=0; r<width; c++){
            this.board[r][c] = other.board[r][c];

            }
          }
        
    }


    /**
     * returns <b>true</b> if and only the parameter 
     * <b>other</b> is referencing an instance of a 
     * Solution which is the ``same'' as  this 
     * instance of Solution (its board as the same
     * values and it is completed to the same degree)
     *
     * @param other
     *  referenced object to compare
     */

    public boolean equals(Object other){
       
        //Your code here
        /*try{
            other = (Solution) new Object();
        } catch (Exception e) {
            System.out.println("lol");
            return false;
        }
        for(int r = 0; r < board.length; r++){

            for(int c = 0; c < board[r].length; c++){

                if(board[r][c] !=  ((Solution) other).board[r][c]){
                    
                    return false;

                }

            }  

        }
    
        return true;*/

        if (other == null) {
            return false;
          }
    
          if (other == this) {
            return true;
          }
    
          if (other.getClass() != Solution.class) {
            return false;
          }
    
          Solution otherSolution = (Solution) other;
    
          if (otherSolution.width != this.width || otherSolution.height != this.height) {
            return false;
          }
    
          for (int r=0; r<height; r++){
            for (int c=0; c<width; c++){
              if (board[r][c] != otherSolution.board[r][c]) {
                return false;
              }
            }
          }
    
          return true;
    

    }


    /** 
    * returns <b>true</b> if the solution 
    * has been entirely specified
    *
    * @return
    * true if the solution is fully specified
    */
    public boolean isReady(){

        //Your code here

        /*for(int r = 0; r < board.length; r++){

            for(int c = 0; c < board[r].length; c++){

                if(board[r][c] !=  true || board[r][c] != false){
                    
                    return false;

                }

            }
    
        }*/
        
        if(ready == true){
        
            return true;

        }
        else{
            
            return false;

        }
        
    }

    /** 
    * specifies the ``next'' value of the 
    * solution. 
    * The first call to setNext specifies 
    * the value of the board location (1,1), 
    * the second call specifies the value
    *  of the board location (1,2) etc. 
    *
    * If <b>setNext</b> is called more times 
    * than there are positions on the board, 
    * an error message is printed out and the 
    * call is ignored.
    *
    * @param nextValue
    *  the boolean value of the next position
    *  of the solution
    */
    public void setNext(boolean nextValue) {

        //Your code here
        if((r == height - 1) && (c == width - 1)){

            ready = true;

        }
       
       //if((r > height - 1) && (c > width - 1) ){

            //System.out.println("You are out of moves.");
            

       // }
        else{
            if(nextValue == true){

                    board[r][c] = true;

                    if(c == (width - 1)){
                        
                        
                        r = r + 1;
                        c = 0;
                        
                        
                    }
                    else{

                        c = c + 1; 
                        
                    }
                }

                //if(nextValue == false){
                else{    
                    board[r][c] = false;
                    
                    if(c == (width - 1)){
                        
                        r = r + 1;
                        c = 0;

                    }
                    else{

                        c = c + 1;

                    }

                }
             }
        
    }
    
    /**
    * returns <b>true</b> if the solution is completely 
    * specified and is indeed working, that is, if it 
    * will bring a board of the specified dimensions 
    * from being  entirely ``off'' to being  entirely 
    * ``on''.
    *
    * @return
    *  true if the solution is completely specified
    * and works
    */
    public boolean isSuccessful(){

        //Your code here
        int count = 0;
        
        //Corners   
                
        //Top Left
        if(board[0][0] == true){
            count = count + 1;
        }
        if(board[0][1] == true){
            count = count + 1;
        }
        if(board[1][0] == true){
            count = count + 1;
        }
        if(count%2 == 0){
            return false;
        }
        count = 0;

        //Top Right
        if(board[0][width - 1] == true){
            count = count + 1;
        }
        if(board[0][width-2] == true){
            count = count + 1;
        }
        if(board[1][width - 1] == true){
            count = count + 1;
        }
        if(count%2 == 0){
            return false;
        }
        count = 0;

        //Bottom Left
        if(board[height - 1][0] == true){
            count = count + 1;
        }   
        if(board[height - 2][0] == true){
            count = count + 1;
        }
        if(board[height - 1][1] == true){
            count = count + 1;
        }
        if(count%2 == 0){
            return false;
        }
        count = 0;

        //Bottom Right
        if(board[height - 1][width - 1] == true){
            count = count + 1;
        }
        if(board[height - 2][width - 1] == true){
            count = count + 1;
        }
        if(board[height - 1][width - 2] == true){
            count = count + 1;
        }
        if(count%2 == 0){
            return false;
        }
        count = 0;

        //3 Adjacent (if 2D array is bigger than 2 by 2)
        if(height > 2 && width > 2){

            for(int r = 1; r < board.length - 1; r++){

                for(int c = 1; c < board[r].length - 1; c++){

                    if(board[r][c] == true){
                        count =  count  + 1;    
                    }
                    if(board[r - 1][c] == true){   
                        count =  count  + 1;
                    }
                    if(board[r][c - 1] == true){   
                        count =  count  + 1;
                    }
                    if(board[r + 1][c] == true){   
                        count =  count  + 1;
                    }
                    if(board[r][c + 1] == true){    
                        count =  count  + 1;    
                    } 
                    if(count % 2 == 0){
                        return false;
                    }
                    count = 0;
                }  
            }
        }

        //4 Adjacent(if 2Darray is bigger that 3 by 3)
        if(width > 3 && height > 3){
            for(int r = 1; r < board.length - 1; r++){
                for(int c = 1; c < board[r].length - 1; c++){
                    if(board[r][c] == true){
                        count =  count  + 1;  
                    }
                    if(board[r - 1][c] == true){
                        count =  count  + 1;
                    }
                    if(board[r][c - 1] == true){
                        count =  count  + 1;
                    }
                    if(board[r + 1][c] == true){     
                        count =  count  + 1;   
                    }
                    if(board[r][c + 1] == true){
                        count =  count  + 1;
                    }
                    if(count % 2 == 0){
                        return false;
                    }
                    count = 0;
                }  
            }   
        }
    
        
        return true;
;

    }


    /**
     * returns a string representation of the solution
     *
     * @return
     *      the string representation
     */
    public String toString() {
 
        //Your code here
        String stringboard;
        stringboard = "[";
        
        for(int r = 0; r < board.length; r++){
           
            stringboard = stringboard + "[";

            for(int c = 0 ; c < board[r].length; c++){
            
                stringboard = stringboard + board[r][c];
               
                if (c != width - 1){
                    
                    stringboard = stringboard + ",";

                }
                

            }
            
            stringboard = stringboard + "]";
            if (r != height - 1){
                    
                stringboard = stringboard + ",";

            }
        }
        stringboard = stringboard + "]";
        return stringboard;

    }

}
