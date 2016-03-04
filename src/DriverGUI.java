import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;

public class DriverGUI {

	private JFrame frame;
	private SongList listOfSongs = new SongList();
	private boolean isAdd = true;
	private boolean isRemove = false;
	private boolean isEdit = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverGUI window = new DriverGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DriverGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea artistText = new JTextArea();
		artistText.setBounds(136, 65, 122, 22);
		frame.getContentPane().add(artistText);
		
		JTextArea nameText = new JTextArea();
		nameText.setBounds(136, 98, 122, 22);
		frame.getContentPane().add(nameText);
		
		JTextArea lengthText = new JTextArea();
		lengthText.setBounds(136, 131, 122, 22);
		frame.getContentPane().add(lengthText);
		
		JTextArea genreText = new JTextArea();
		genreText.setBounds(136, 164, 122, 22);
		frame.getContentPane().add(genreText);
		
		JTextArea ratingText = new JTextArea();
		ratingText.setBounds(136, 199, 122, 22);
		frame.getContentPane().add(ratingText);
		
		JLabel artistLabel = new JLabel("Artist:");
		artistLabel.setForeground(Color.WHITE);
		artistLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		artistLabel.setBounds(10, 70, 116, 14);
		frame.getContentPane().add(artistLabel);
		
		JLabel nameLabel = new JLabel("Song Name:");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setBounds(10, 103, 116, 14);
		frame.getContentPane().add(nameLabel);
		
		JLabel lengthLabel = new JLabel("Length (seconds):");
		lengthLabel.setForeground(Color.WHITE);
		lengthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lengthLabel.setBounds(10, 136, 116, 14);
		frame.getContentPane().add(lengthLabel);
		
		JLabel genreLabel = new JLabel("Genre:");
		genreLabel.setForeground(Color.WHITE);
		genreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		genreLabel.setBounds(10, 169, 116, 14);
		frame.getContentPane().add(genreLabel);
		
		JLabel ratingLabel = new JLabel("Rating (1-5):");
		ratingLabel.setForeground(Color.WHITE);
		ratingLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ratingLabel.setBounds(10, 204, 116, 14);
		frame.getContentPane().add(ratingLabel);
		
		
		JLabel addLabel = new JLabel("Add Mode");
		addLabel.setForeground(Color.WHITE);
		addLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addLabel.setBounds(136, 45, 122, 14);
		frame.getContentPane().add(addLabel);
		
		JLabel removeLabel = new JLabel("Remove Mode");
		removeLabel.setForeground(Color.WHITE);
		removeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		removeLabel.setBounds(136, 45, 122, 14);
		frame.getContentPane().add(removeLabel);
		removeLabel.setVisible(false);
		
		JLabel editLabel = new JLabel("Edit Mode");
		editLabel.setForeground(Color.WHITE);
		editLabel.setHorizontalAlignment(SwingConstants.CENTER);
		editLabel.setBounds(136, 45, 122, 14);
		frame.getContentPane().add(editLabel);
		editLabel.setVisible(false);
		
		JButton addButton = new JButton("Add Song");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				genreLabel.setVisible(true);
				genreText.setVisible(true);
				ratingLabel.setVisible(true);
				ratingText.setVisible(true);
				lengthLabel.setVisible(true);
				lengthText.setVisible(true);
				removeLabel.setVisible(false);
				editLabel.setVisible(false);
				addLabel.setVisible(true);
				isAdd = true;
				isRemove = false;
				isEdit = false;
			}
		});
		addButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(addButton);
		
		JButton removeButton = new JButton("Remove Song");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				genreLabel.setVisible(false);
				genreText.setVisible(false);
				ratingLabel.setVisible(false);
				ratingText.setVisible(false);
				lengthLabel.setVisible(false);
				lengthText.setVisible(false);
				removeLabel.setVisible(true);
				addLabel.setVisible(false);
				editLabel.setVisible(false);
				isAdd = false;
				isRemove = true;
				isEdit = false;
			}
		});
		removeButton.setBounds(136, 11, 122, 23);
		frame.getContentPane().add(removeButton);
		
		JButton infoButton = new JButton("Submit");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isAdd) {
					listOfSongs.addSong(artistText.getText(), nameText.getText(), genreText.getText(), Integer.parseInt(lengthText.getText()), Integer.parseInt(ratingText.getText()));
				}
				else if (isRemove) {
					listOfSongs.removeSong(artistText.getText(), nameText.getText());
				}
			}
		});
		infoButton.setBounds(10, 258, 102, 23);
		frame.getContentPane().add(infoButton);
		
		JButton btnEditSong = new JButton("Edit Song");
		btnEditSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addLabel.setVisible(false);
				removeLabel.setVisible(false);
				editLabel.setVisible(true);
			}
		});
		btnEditSong.setBounds(292, 11, 89, 23);
		frame.getContentPane().add(btnEditSong);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(268, 45, 2, 255);
		frame.getContentPane().add(separator);
		
		JLabel bg = new JLabel("New label");
		bg.setIcon(new ImageIcon(".\\unnamed.jpg"));
		bg.setBounds(0, 0, 584, 311);
		frame.getContentPane().add(bg);
	}
}