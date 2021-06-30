package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCompany frame = new AdminCompany();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminCompany() {
		setTitle("Clothing Rental Bussiness (ADMIN)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1023, 577); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(139, 0, 0)));
		panel.setBounds(0, 0, 1009, 518);
		contentPane.add(panel);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Rental");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCompany frame = new AdminCompany();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem employeeInfo = new JMenuItem("Employee Information");
		mnEmployee.add(employeeInfo);
		employeeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	
		JMenu mnClothInfo = new JMenu("Cloth Info ");
		menuBar.add(mnClothInfo);
		
		JMenuItem mntmNewMenuItem_7_1 = new JMenuItem("Update");
		mntmNewMenuItem_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				ClothUpdate frame = new ClothUpdate();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		mnClothInfo.add(mntmNewMenuItem_7_1);
		
				JMenu mnNewMenu = new JMenu("AdminCompany");
				menuBar.add(mnNewMenu);
				
				JMenuItem mntmNewMenuLogout = new JMenuItem("Log out");
				mntmNewMenuLogout.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try { // 2.2 Exception Handling
							ClothingRental frame = new ClothingRental();
							if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out",
									"Company System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							frame.setModalExclusionType(null);
							frame.setVisible(true);
								dispose();
							}
						}catch (Exception e1) {
								e1.printStackTrace();
							}	
					}
				});
				mnNewMenu.add(mntmNewMenuLogout);
							
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(670, 218, 329, 191);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\kualalumpurpic.jfif"));

		JLabel lblLocation_1 = new JLabel("We are open at only Kuala Lumpur City!");
		lblLocation_1.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblLocation_1.setBackground(Color.LIGHT_GRAY);
		lblLocation_1.setBounds(687, 98, 312, 33);
		panel.add(lblLocation_1);

		JLabel lblOperatingHour = new JLabel("We are open at 10a.m~9p.m everyday!");
		lblOperatingHour.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblOperatingHour.setBounds(697, 131, 312, 33);
		panel.add(lblOperatingHour);

		JLabel lblContact = new JLabel("Please contact us at 011-56815181 (Manager)\r\n");
		lblContact.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblContact.setBounds(687, 161, 322, 33);
		panel.add(lblContact);

		JLabel lblName = new JLabel("Clothing Rental Bussiness");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Script MT Bold", Font.BOLD, 20));
		lblName.setBounds(718, 48, 249, 61);
		panel.add(lblName);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBackground(new Color(250, 235, 215));
		lblNewLabel.setIcon(
				new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothigpic.jfif"));
		lblNewLabel.setBounds(10, 10, 660, 498);
		panel.add(lblNewLabel);

	}
} //end of AdminCompany class
