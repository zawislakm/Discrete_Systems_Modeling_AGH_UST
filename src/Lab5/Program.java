package Lab5;

import javax.swing.*;

public class Program extends JFrame {

	private static final long serialVersionUID = 1L;
	private GUI gof;

	public Program() {
		setTitle("Freeway Traffic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gof = new GUI(this);
		gof.initialize(this.getContentPane());

		this.setSize(1280, 220);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Program();
	}

}
