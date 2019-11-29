package ui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TakeoffFrame {

	private JFrame frame;
	private JPanel flightListPanel;
	private JPanel panel_1;
	private JButton btnExecuteTakeoff;
	private JRadioButton rdbtnFlightTo;
	private JRadioButton rdbtnFlightTo_1;
	private JRadioButton rdbtnFlightTo_2;
	/**
	 * Create the application.
	 */
	public TakeoffFrame() {
		initialize();
	}
	
	
	/**
	 * Launch the application.
	 */
	public void createFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TakeoffFrame window = new TakeoffFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0));
		
		flightListPanel = new JPanel();
		flightListPanel.setLayout(new GridLayout(0, 1));
		
		JScrollPane scrollPane_1 = new JScrollPane(flightListPanel);
		
		rdbtnFlightTo_2 = new JRadioButton("Flight 033 to MNA");
		flightListPanel.add(rdbtnFlightTo_2);
		
		rdbtnFlightTo_1 = new JRadioButton("Flight 143 to LAX");
		flightListPanel.add(rdbtnFlightTo_1);
		
		rdbtnFlightTo = new JRadioButton("Flight 123 to JFK");
		flightListPanel.add(rdbtnFlightTo);
		panel.add(scrollPane_1);
		panel.add(scrollPane_1);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton btnCheckWeather = new JButton("Check Weather");
		
		btnExecuteTakeoff = new JButton("Execute Take-Off");
		btnExecuteTakeoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(80, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnCheckWeather, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnExecuteTakeoff, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(35))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(86)
					.addComponent(btnCheckWeather)
					.addGap(18)
					.addComponent(btnExecuteTakeoff)
					.addContainerGap(115, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		
		
	}
	
	
//	//Instantiates a list of radio buttons pulling from the Takeoff class to get specific instances of flight as tickable boxes
//	public void initRadioButtons() {
//		//these will collect the prerequisites from the takeoff class including the weather conditions and the estimated time or arrival
//		//
////		FlightIterator fi = new FlightIterator(); //need to install class
////		List<Flight> flist = new ArrayList<>();  //need to install class
//
//		
//		List<JRadioButton> list = new ArrayList<>();
//		ButtonGroup bg = new ButtonGroup();
//		
//		//needs flight class and iterator to work
////		for(FlightIterator fi: flights) {
////			JRadioButton jrb = new JRadioButton("" + flights.name());
////			list.add(jrb);
////			bg.add(jrb);
////			flightListPanel.add(jrb);
////		}
////		
//		
//		//working when provided with input, but has no flight input
//		btnExecuteTakeoff.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				String flightNames = "";
//				
//				for (JRadioButton jrb : list) {
//                    if (jrb.isSelected()) {
//                    	flightNames += jrb.getText();
//                        JOptionPane.showMessageDialog(frame, flightNames + " has taken off");
//                    }
//                }
//			}
//		});
//	}
}
