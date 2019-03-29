import java.awt.event.*;

public class Controller implements ActionListener {

	private Timer model;

	private View[] views;
	private int numberOfViews;

	public Controller(){

		views = new View[2];
		numberOfViews = 0;
		model = new Timer() ;
		register(new GraphicalView(model, this));
		register(new TextView(model));
		update();
	}

	public Timer getModel() {
		return model;
	}

	public View[] getViews() {
		return views;
	}

	private void register(View view) {
		views[numberOfViews] = view;
		numberOfViews++;
	}
	private void update() {
		for (int i = 0; i < numberOfViews; i++) {
			views[i].update();
		}
	}

	public void actionPerformed ( ActionEvent e ) {

		if(e.getActionCommand().equals("IncrementHours")) {
			// Your code here.
			model.incrementHours();
		}

		if(e.getActionCommand().equals("IncrementMinutes")) {
			// Your code here.
			model.incrementMinutes();
		}

		if(e.getActionCommand().equals("IncrementSeconds")) {
			// Your code here.
			model.incrementSeconds();
		}

		if(e.getActionCommand().equals("DecrementHours")) {
			// Your code here.
			model.decrementHours();
		}

		if(e.getActionCommand().equals("DecrementMinutes")) {
			// Your code here.
			model.decrementMinutes();
		}

		if(e.getActionCommand().equals("DecrementSeconds")) {
			// Your code here.
			model.decrementSeconds();
		}

	update();
	}
}