import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

// YOUR OTHER IMPORTS HERE IF NEEDED

/**
 * The class <b>GameController</b> is the controller of the game. It is a listener
 * of the view, and has a method <b>play</b> which computes the next
 * step of the game, and  updates model and view.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */


public class GameController implements ActionListener, ItemListener {

    // YOUR VARIABLES HERE
    private int width;
    private int height;
    private GameModel model;

    /**
     * Constructor used for initializing the controller. It creates the game's view 
     * and the game's model instances
     * 
     * @param width
     *            the width of the board on which the game will be played
     * @param height
     *            the height of the board on which the game will be played
     */
    public GameController(int width, int height) {

        // YOUR CODE HERE
        this.width = width;
        this.height = height;

    }


    /**
     * Callback used when the user clicks a button (reset, 
     * random or quit)
     *
     * @param e
     *            the ActionEvent
     */

    public void actionPerformed(ActionEvent e) {
        
        // YOUR CODE HERE
        if(e.getActionCommand().equals("Reset")) {
			// Your code here.
			model.reset();
        }
        if(e.getActionCommand().equals("Random")) {
			// Your code here.
			model.randomize();
        }
        if(e.getActionCommand().equals("Quit")) {
			// Your code here.
			Gameview.LightsOut.dispose();
		}

        GameView.update();
    }

    /**
     * Callback used when the user select/unselects
     * a checkbox
     *
     * @param e
     *            the ItemEvent
     */

    public void  itemStateChanged(ItemEvent e){

        // YOU CODE HERE
        if(e.getActionCommand().equals("Solution")) {
			// Your code here.
			GameView.solutionShow();
        }
        GameView.update();
    }

    // YOUR OTHER METHODS HERE

}
