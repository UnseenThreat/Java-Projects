public class GameModel {

 // Your code here
    private int width;
    private int height;
    private boolean[][] board;

    public GameModel(int width, int height){

        this.width = width;
        this.height = height;
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

        for(int i = 0; i < this.getWidth(); i++) {
            for(int j = 0; j < this.getHeight(); j++) {
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


}
