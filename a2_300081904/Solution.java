public class Solution{
    //Instance Variables
    boolean[][] board;
    int c;
    int r;
    int width;
    int height;
    boolean ready = false;

    //Constructor
    public Solution(int width, int height){
       
        this.board = new boolean[height][width];
        this.height = height;
        this.width = width;
        this.c = 0;
        this.r = 0;

    }

    public Solution(Solution other){

        this.board = new boolean[other.r][other.c] ;
        this.c = other.c;
        this.r = other.r;

    }

    //Methods

    //Getters
    /*public boolean[][] getBoard(){

        return board;

    }

    public int getR(){

        return r;
 
    }
    public int getC(){

        return c;

    }

    public int getWidth(){

        return width;

    }
 
    public int getHeight(){

        return height;

    }*/

    //Instance Methods
    public void setNext(boolean nextValue){
        if((r == height - 1) && (c == width - 1)){

            ready = true;

        }
       
        if((r > height - 1) && (c > width - 1) ){

            System.out.println("You are out of moves.");
            

        }
        
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

    public boolean isReady(){
        
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

    public boolean isSuccessful(){

        /*for(int r = 0; r < board.length; r++){

            for(int c = 0; c < board[r].length; c++){

                if(board[r][c] !=  true){
                    
                    return false;

                }

            }

        }

        return true;*/
    
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

    }

    public boolean equals(Solution other){

        for(int r = 0; r < board.length; r++){

            for(int c = 0; c < board[r].length; c++){

                if(board[r][c] !=  other.getBoard()[r][c]){
                    
                    return false;

                }

            }  

        }
    
        return true;
        
        
    }

    public String toString(){

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