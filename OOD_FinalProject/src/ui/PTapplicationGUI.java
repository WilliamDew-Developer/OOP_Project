package ui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;

import gates.GateManipulator;
import gates.RunwayManipulator;
import scheduler.Loader;
import scheduler.PersistentTime;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTapplicationGUI {

	//declare ui elements
	private JFrame frmPlaneAndTrain;
	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel welcomePanel;
	private JPanel loginPanel;
	private JPanel actionPanel;
	private JPanel panel_1;
	private JButton btnLanding;
	private JButton btnShowActiveGates;
	private JButton button_2;
	private JButton btnTakeoffDeparture;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	
	//declare manipulator
	private static GateManipulator gm;
	private static RunwayManipulator rm;
	private static Loader ld;
	private static PersistentTime pt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		pt = PersistentTime.getInstance();
		gm = new GateManipulator();
		rm = new RunwayManipulator();
		ld = new Loader();
		
		//load assets
		gm.addingGates();
		rm.addingRunways();
		ld.loadFlights();
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PTapplicationGUI window = new PTapplicationGUI();
					window.frmPlaneAndTrain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PTapplicationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initComponents();
		createEvents();
	}

	/**
	 * initialize components
	 */
	private void initComponents() {
		frmPlaneAndTrain = new JFrame();
		frmPlaneAndTrain.setTitle("Plane and Train Controller");
		frmPlaneAndTrain.setBounds(100, 100, 440, 300);
		frmPlaneAndTrain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmPlaneAndTrain.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		frmPlaneAndTrain.getContentPane().add(panel, "panel");
		panel.setLayout(new CardLayout(0, 0));
		

		panel_1 = new JPanel();
		panel.add(panel_1, "panel_1");
		panel_1.setLayout(new CardLayout(0, 0));
		

		welcomePanel = new JPanel();
		panel_1.add(welcomePanel, "welcomePanel");
		
		JLabel label_6 = new JLabel("Welcome to Air Traffic Controller");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_6 = new JButton("LOGIN");
		
		GroupLayout gl_welcomePanel = new GroupLayout(welcomePanel);
		gl_welcomePanel.setHorizontalGroup(
			gl_welcomePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
				.addGroup(gl_welcomePanel.createSequentialGroup()
					.addGroup(gl_welcomePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_welcomePanel.createSequentialGroup()
							.addGap(108)
							.addComponent(label_6))
						.addGroup(gl_welcomePanel.createSequentialGroup()
							.addGap(170)
							.addComponent(button_6)))
					.addContainerGap(110, Short.MAX_VALUE))
		);
		gl_welcomePanel.setVerticalGroup(
			gl_welcomePanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 261, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_welcomePanel.createSequentialGroup()
					.addContainerGap(89, Short.MAX_VALUE)
					.addComponent(label_6)
					.addGap(18)
					.addComponent(button_6)
					.addGap(116))
		);
		welcomePanel.setLayout(gl_welcomePanel);
		
		
		loginPanel = new JPanel();
		panel_1.add(loginPanel, "loginPanel");
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_4 = new JButton("Cancel");
		
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setLocation(new Point(6, 0));
		
		button_5 = new JButton("Login");

		button_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_5 = new JLabel("Enter Employee Credentials");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_loginPanel = new GroupLayout(loginPanel);
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 424, Short.MAX_VALUE)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_loginPanel.createSequentialGroup()
									.addGap(88)
									.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_loginPanel.createSequentialGroup()
											.addComponent(label_3)
											.addGap(18))
										.addGroup(gl_loginPanel.createSequentialGroup()
											.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED))))
								.addGroup(gl_loginPanel.createSequentialGroup()
									.addContainerGap()
									.addComponent(button_4)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addComponent(passwordField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_loginPanel.createSequentialGroup()
									.addComponent(button_5)
									.addGap(32))))
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGap(119)
							.addComponent(label_5)))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 261, Short.MAX_VALUE)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(63)
					.addComponent(label_5)
					.addGap(18)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4)))
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addComponent(label_3)
							.addGap(35)))
					.addGap(28)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_5)
						.addComponent(button_4))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		loginPanel.setLayout(gl_loginPanel);
		
		actionPanel = new JPanel();
		panel_1.add(actionPanel, "actionPanel");
		
		btnLanding = new JButton("Landing");
		
		btnShowActiveGates = new JButton("Show Active Gates");
		
		button_2 = new JButton("Exit Program");
		
		btnTakeoffDeparture = new JButton("Takeoff & Departure");

		
		JLabel label = new JLabel("Current Weather:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_1 = new JLabel("74 F");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_2 = new JLabel("What Would You Like To Do?");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		GroupLayout gl_actionPanel = new GroupLayout(actionPanel);
		gl_actionPanel.setHorizontalGroup(
			gl_actionPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
				.addGroup(gl_actionPanel.createSequentialGroup()
					.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_actionPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnLanding, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_actionPanel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnShowActiveGates, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(button_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnTakeoffDeparture, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(53)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addGap(75)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_actionPanel.setVerticalGroup(
			gl_actionPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 261, Short.MAX_VALUE)
				.addGroup(gl_actionPanel.createSequentialGroup()
					.addGap(33)
					.addComponent(label_2)
					.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_actionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(label_1)))
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addGap(36)
							.addComponent(btnTakeoffDeparture)))
					.addGap(18)
					.addComponent(btnLanding)
					.addGap(18)
					.addComponent(btnShowActiveGates)
					.addGap(18)
					.addComponent(button_2)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		actionPanel.setLayout(gl_actionPanel);
	}

	/**
	 * create button responses
	 */
	private void createEvents() {
		CardLayout c = (CardLayout) panel_1.getLayout();
		
		//cancel button in login panel
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.show(panel_1, "welcomePanel");
			}
		});
		
		//login button on welcome page
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.show(panel_1, "loginPanel");
			}
		});
		
		//login button on loginPanel
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.show(panel_1, "actionPanel");
			}
		});
		
		//exit button on actionPanel
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		//Takeoff & Departure Button
		btnTakeoffDeparture.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TakeoffFrame init = new TakeoffFrame();
				init.createFrame();
			}
		});
		
		//Show active gates button
		btnShowActiveGates.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Gates 1-25 are open!");
			}
		});
	}
}
