// YOUR IMPORT HERE

public class GridButton extends JButton {


    // YOUR VARIABLES HERE
    private int column;
    private int row;
    private int icon;


    /**
     * Constructor used for initializing a GridButton at a specific
     * Board location.
     * 
     * @param column
     *            the column of this Cell
     * @param row
     *            the row of this Cell
     */

    public GridButton(int column, int row) {

        // YOUR CODE HERE
        this.column = column;
        this.row = row;
        this.icon = 1;
    }

   /**
    * sets the icon of the button to reflect the
    * state specified by the parameters
    * @param isOn true if that location is ON
    * @param isClicked true if that location is
    * tapped in the model's current solution
    */ 
    public void setState(boolean isOn, boolean isClicked) {

        // YOUR CODE HERE
        if(isOn){
            icon = 0;
        }
        if(isClicked){
            icon = 0;
        }

    }

 

    /**
     * Getter method for the attribute row.
     * 
     * @return the value of the attribute row
     */

    public int getRow() {
        // YOUR CODE HERE
        return row;
    }

    /**
     * Getter method for the attribute column.
     * 
     * @return the value of the attribute column
     */

    public int getColumn() {
        // YOUR CODE HERE
        return column;
    }

    // YOUR OTHER METHODS HERE
    public int getImageIcon(){

        return icon;

    }
}
