import java.util.Random;

public class GameModel {

  // YOUR CODE HERE
    private int width;
    private int height;
    private int clicks;
    private boolean[][] board;
    private Solution solution;
    

    public GameModel(int width, int height){

        this.width = width;
        this.height = height;
        this.clicks = 0;
        board = new boolean[height][width];

    }

    public int getWidth(){

        return width;

    }

    public int getHeight(){

        return height;

    }

    public boolean isON(int i, int j){

        return board[i][j];

    }

    public void reset(){

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                this.set(i,j,false);
            }
        }

    }
    
    public void set(int i, int j, boolean value){

        board[j][i] = value;    

    }

    public String toString() {
        StringBuffer out = new StringBuffer();
        out.append("[");
        for(int i = 0; i < height; i++){
            out.append("[");
            for(int j = 0; j < width ; j++) {
                if (j>0) {
                    out.append(",");
                }
                out.append(board[i][j]);
            }
            out.append("]"+(i < height -1 ? ",\n" :""));
        }
        out.append("]");
        return out.toString();
    }

    public void click(int i, int j){
      clicks = clicks++;
      if(board[i][j] == false){
        board[i][j] = true;
      }
      if(board[i][j] == true){
        board[i][j] = false;  
      }
      update();
    }

    public int getNumberOfSteps(){
      return clicks;
    }
    
    public boolean isFinished(){
      Solution copy = new Solution;

      for(int i = 0; i < ((width*height)-1); i++){
        if(this.isON(i/width, i%height) == true){
            copy.setNext(true);
        }
        else{
            copy.setNext(false);
        }
      } 
    
    return copy.isSuccessful();

    }

    public void randomize(){
      
      int randnum = 0;
      int size = 0;
      boolean solvable = false;
      Solution random = new Solution(width, height);
      //ArrayList<Solution> list = solve(this.getWidth(), this.getHeight());
      
      for(int i = 0; i < width; i++) {
        for(int j = 0; j < width; j++) {
            this.set(i,j,false);
        }
      }

      size = Math.random() * (width * height - 1);

      while(solvable == false){
        
        for(int i = 0; i < size ){
          
          randnum = Math.random() * 1;  
          
          if (randnum == 0){
            random.setNext(true);
            this.set(i/width, j%width, true);
          }
          
          if (randnum == 1){
            random.setNext(false);
            this.set(i/width, j%width, false);
          }

        }

        if(random.stillPossible()){
          solvable = true;
        }
      }

      

        

    }

    public void setSolution(){
      
      solution = LightsOut.shortestSolve(height, width);

    }
    
    public boolean solutionSelects(int i, int j){

      return solution.get(i,j);

    }
}
