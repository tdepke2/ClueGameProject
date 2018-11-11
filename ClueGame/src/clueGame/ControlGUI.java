package clueGame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * Control GUI for the clue game.
 * @author Joseph Thurston
 * @author Thomas Depke
 *
 */
public class ControlGUI extends JPanel {
	private JTextField roll, currentPlayer, guess, guessResult;
	/**
	 * Construct the GUI and add panels to setup the control layout.
	 */
	public ControlGUI() {
		setLayout(new GridLayout(2, 0));
		JPanel panel = createTopPanel();
		add(panel);
		panel = createBottomPanel();
		add(panel);
	}
	
	private JPanel createTopPanel() {
		JPanel panel = new JPanel();    // Top panel has whose turn, next player, and make accusation.
		panel.setLayout(new GridLayout(1,3));
		panel.add(createWhoseTurnPanel());
		JButton nextPlayer = new JButton("Next player");
		JButton accuse = new JButton("Make an accusation");
		panel.add(nextPlayer);
		panel.add(accuse);
		return panel;
		
	}
	private JPanel createBottomPanel() {
		JPanel panel = new JPanel();    // Bottom panel has die, guess, and guess result.
		panel.add(createDiePanel());
		panel.add(createGuessPanel());
		panel.add(createResultPanel());
		return panel;
		
	}
	private JPanel createResultPanel() {
		JLabel resultLabel = new JLabel("Response");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		guessResult = new JTextField(15);
		guessResult.setEditable(false);
		panel.add(resultLabel);
		panel.add(guessResult);
		panel.setBorder(new TitledBorder (new EtchedBorder(), "Guess Result"));
		return panel;
	}

	private JPanel createWhoseTurnPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		JLabel turnLabel = new JLabel("Whose turn?");
		currentPlayer = new JTextField(20);
		currentPlayer.setEditable(false);
		panel.add(turnLabel);
		panel.add(currentPlayer);
		return panel;
		
	}
	private JPanel createDiePanel() {
		JLabel dieLabel = new JLabel("Roll");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		roll = new JTextField(4);
		roll.setEditable(false);
		panel.add(dieLabel);
		panel.add(roll);
		panel.setBorder(new TitledBorder (new EtchedBorder(), "Die"));
		return panel;
	}
	private JPanel createGuessPanel() {
		JPanel panel = new JPanel();
		
		JLabel guessLabel = new JLabel("Guess");
		guess = new JTextField(25);
		guess.setEditable(false);
		panel.add(guessLabel);
		panel.add(guess);
		panel.setBorder(new TitledBorder (new EtchedBorder(), "Guess"));
		return panel;
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();    // Create a JFrame and display the GUI.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Control GUI");
		frame.setSize(1000, 200);
		ControlGUI gui = new ControlGUI();
		frame.add(gui, BorderLayout.CENTER);
		// Now let's view it
		frame.setVisible(true);

	}

}