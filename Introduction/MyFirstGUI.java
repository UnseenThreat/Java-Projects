import javax.swing.*;
import java.awt.*;

 public class MyFirstGUI{

  public static void main(String[] args){

	JFrame myFrame = new JFrame();
	//set the title
	myFrame.setTitle("My first Window");

	//set the size to 500X300 pixels (width by heigth)
	myFrame.setSize(500, 300);

	//set the object to the middle of our screen
	myFrame.setLocationRelativeTo(null);

	//end program when user closes the window
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	//create a panel
	JPanel myPanel = new JPanel();
	//add a label to the panel
	myPanel.add(new Label("My first panel"));
	//set panel background color
	myPanel.setBackground(Color.green);
	//add the panel to the frame
	myFrame.add(myPanel, BorderLayout.NORTH);

    //YOUR CODE HERE
    JButton start = new JButton();
    start.setBackground(Color.WHITE);
    start.add(new Label("Start"));

    JButton end = new JButton();
    end.setBackground(Color.RED);
    end.add(new Label("End"));

    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.ORANGE);
    panel2.add(start);
    panel2.add(end);
    myFrame.add(panel2, BorderLayout.EAST);

    JPanel panel3 = new JPanel();
    panel3.add(new Label("My Third Panel"));
    panel3.setBackground(Color.YELLOW);
    myFrame.add(panel3, BorderLayout.SOUTH);

	//set the window to visible
    myFrame.setVisible(true);
	}

}