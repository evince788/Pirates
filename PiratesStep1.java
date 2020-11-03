// Import the GUI libraries
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PiratesStep1 {
	/**
	 * MAIN METHOD
	 * This main method starts the GUI and runs the createMainWindow() method.
	 * This method should not be changed.
	 */
	public static void main (String [] args) {
		javax.swing.SwingUtilities.invokeLater (new Runnable () {
			public void run () {
				createMainWindow ();
			}
		});
	}


	/**
	 * STATIC VARIABLES AND CONSTANTS
	 * Declare the objects and variables that you want to access across
	 * multiple methods.
	 */
	


	/**
	 * CREATE MAIN WINDOW
	 * This method is called by the main method to set up the main GUI window.
	 */
	private static void createMainWindow () {
		// Create and set up the window.
		JFrame frame = new JFrame ("Pirates");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setResizable (false);

		// The panel that will hold the components in the frame.
		JPanel contentPane = new JPanel ();
		contentPane.setPreferredSize(new Dimension(775, 450));
		contentPane.setLayout(new BorderLayout());

		// Create the right action panel
		JPanel rightPanel = new JPanel();
		
		contentPane.add(rightPanel, BorderLayout.EAST);
		
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
		
		JLabel scoreTitleLabel = new JLabel("Score");
		scoreTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(scoreTitleLabel);
		
		
		JLabel scoreLabel = new JLabel("0");
		scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(scoreLabel);
		
		
		JLabel actionsTitleLabel = new JLabel("Actions");
		actionsTitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(actionsTitleLabel);
		
		JButton newGameButton = new JButton("New Game");
		newGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(newGameButton);
		
		JButton musicToggleButton = new JButton("Music Off");
		musicToggleButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(musicToggleButton);
		
		JButton exitGameButton = new JButton("Exit Game");
		exitGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(exitGameButton);
		
		JLayeredPane gamePanel = new JLayeredPane();
		
		JLabel mapImage = new JLabel(new ImageIcon("resources/world-map-animals.jpg"));
		mapImage.setSize(new Dimension(775, 400));
		gamePanel.add(mapImage);
		
		JLabel shipImage = createScaledImage("resources/pirate-ship.png", 40, 40);
		shipImage.setSize(new Dimension(40, 40));
		gamePanel.add(shipImage, Integer.valueOf(1));
		
		contentPane.add(gamePanel);
		
		
		
		
		

		// Add the panel to the frame
		frame.setContentPane(contentPane);

		//size the window.
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	/**
	 * HELPER METHODS
	 * Methods that you create to manage repetitive tasks.
	 */

	/** Creates an image label scaled to the given size. */
	private static JLabel createScaledImage (String filename, int width, int height) {
		Image originalImage = new ImageIcon(filename).getImage();
		Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new JLabel(new ImageIcon(scaledImage));
	}


	/**
	 * EVENT LISTENERS
	 * Subclasses that handle events (button clicks, mouse clicks and moves,
	 * key presses, timer expirations)
	 */
	
}