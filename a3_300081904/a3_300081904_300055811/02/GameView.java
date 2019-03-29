import javax.swing.*;

// your other import here if needed

/**
 * The class <b>GameView</b> provides the current view of the entire Game. It extends
 * <b>JFrame</b> and lays out a matrix of <b>GridButton</b> (the actual game) and 
 * two instances of JButton. The action listener for the buttons is the controller.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class GameView extends JFrame {

    // your variables here
    private GameController gameController;
    private GameModel gameModel;


    /**
     * Constructor used for initializing the Frame
     * 
     * @param gameModel
     *            the model of the game (already initialized)
     * @param gameController
     *            the controller
     */

    public GameView(GameModel gameModel, GameController gameController) {

        // YOUR CODE HERE
        JFrame LightsOut = new JFrame();
        LightsOut.setTitle("LightsOut");
        LightsOut.setLocationRelativeTo(null);

        JPanel grid = new JPanel();
        JPanel nos = new JPanel();
        JPanel buttons = new JPanel();

        JCheckBox solution =  new JCheckBox("Solution");
        JButton Reset = new JButton("Reset");
        JButton Random = new JButton("Random");
        JButton Quit = new JButton("Quit");
        JLabel numberOfSteps = new JLabel(model.clicks);


        Reset.addActionListener(gameController);
        Solution.addActionListener(gameController);
        Random.addActionListener(gameController);
        Quit.addActionListener(gameController);

        nos.add(numberOfSteps);

        buttons.add(Reset, BorderLayout.EAST);
        buttons.add(Random, BorderLayout.EAST);
        buttons.add(solution, BorderLayout.EAST);
        buttons.add(Quit, BorderLayout.EAST);
        
        LightsOut.add(buttons, BorderLayout.EAST);
        LightsOut.add(nos, BorderLayout.SOUTH);

        LightsOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LightsOut.setVisible(true);
    }

    /**
     * updates the status of the board's GridButton instances based 
     * on the current game model, then redraws the view
     */

    public void update(){

        // YOUR CODE HERE

    }

    /**
     * returns true if the ``solution'' checkbox
     * is checked
     *
     * @return the status of the ``solution'' checkbox
     */

    public boolean solutionShown(){

        // YOUR CODE HERE
        return solution.isSelected();

    }

}
