import java.awt.*;
import java.iawt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {
	private JLabel input;
	private Timer model;
	public GraphicalView (Timer model, Controller controller) {
		setLayout (new GridLayout(2, 3));
		this.model = model;
		
		// Your code here
		JButton IncrementHours = new JButton("IncrementHours");
		JButton IncrementMinutes = new JButton("IncrementMinutes");
		JButton IncrementSeconds = new JButton("IncrementSeconds");
		JButton DecrementHours = new JButton("DecrementHours");
		JButton DecrementMinutes = new JButton("DecrementMinutes");
		JButton DecrementSeconds = new JButton("DecrementSeconds");
		JLabel time = new JLabel(model.toString());

		IncrementHours.addActionListener(controller);
		IncrementMinutes.addActionListener(controller);
		IncrementSeconds.addActionListener(controller);
		DecrementHours.addActionListener(controller);
		DecrementMinutes.addActionListener(controller);
		DecrementSeconds.addActionListener(controller);
		
		
		add(IncrementHours);
		add(IncrementMinutes);
		add(IncrementSeconds);
		add(DecrementHours);
		add(DecrementMinutes);
		add(DecrementSeconds);
		add(time);

		//setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);

		//display the window
		setVisible(true);
	}
	public void update () {
	input.setText(model.toString());
}
}