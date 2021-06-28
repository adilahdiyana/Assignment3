package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAdd;
	private JTextField textFieldPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 100, 0));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 682, 477);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(41, 60, 578, 96);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Rental Clothing");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 30));
		lblNewLabel.setBounds(199, 31, 341, 37);
		panel_1.add(lblNewLabel);
		JTable t = AdminCompany.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(210, 105, 30)));
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(12, 194, 632, 265);
		panel.add(panel_2);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblAddress.setBounds(12, 13, 255, 49);
		panel_2.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone Number");
		lblPhone.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblPhone.setBounds(12, 77, 255, 49);
		panel_2.add(lblPhone);
		
		JLabel lblCompanyWebsite = new JLabel("Website");
		lblCompanyWebsite.setFont(new Font("STXinwei", Font.BOLD, 20));
		lblCompanyWebsite.setBounds(12, 139, 255, 49);
		panel_2.add(lblCompanyWebsite);
		
		JButton btnNewButton = new JButton(" https://www.instagram.com/rental_clothing_world/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				//2.2 Exception Handling
				try {
					browser.browse(new URI(" https://www.instagram.com/rental_clothing_world/"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(320, 154, 255, 25);
		panel_2.add(btnNewButton);
		
		textFieldAdd = new JTextField();
		textFieldAdd.setBackground(new Color(230, 230, 250));
		JTable t1 = AdminCompany.getTable();
		String a="";

				for(int i = 0; i<t1.getRowCount(); i++) { 
				a= String.valueOf(t1.getValueAt(i, 1));}
				textFieldAdd.setText(a);
		textFieldAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAdd.setBounds(320, 16, 255, 49);
		panel_2.add(textFieldAdd);
		textFieldAdd.setColumns(10);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBackground(new Color(230, 230, 250));
		JTable t2 = AdminCompany.getTable();
		String p="";

				for(int i = 0; i<t2.getRowCount(); i++) { 
				p= String.valueOf(t.getValueAt(i, 2));}
				textFieldPhone.setText(p);
		textFieldPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(320, 77, 255, 49);
		panel_2.add(textFieldPhone);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.setBackground(new Color(250, 235, 215));
		btnExit_1.setBounds(396, 196, 101, 59);
		panel_2.add(btnExit_1);
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit_1.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1064, 36);
		panel.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Profile");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Profile");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground CB = new CompanyBackground();
				CB.setModalExclusionType(null);
				CB.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Clothing Info");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Clothing Info");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerClothType CVT = new customerClothType();
				CVT.setModalExclusionType(null);
				CVT.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnAdvertisement = new JMenu("Advertisement");
		mnAdvertisement.setForeground(Color.BLACK);
		mnAdvertisement.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertisement);
		
		JMenuItem mntmAdvertisement = new JMenuItem("Advertisement");
		mntmAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerAdvertisement CA = new CustomerAdvertisement();
				CA.setModalExclusionType(null);
				CA.setVisible(true);
				dispose();
			}
		});
		mntmAdvertisement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertisement.add(mntmAdvertisement);
		
		JMenu mnRegistration = new JMenu("Registration");
		mnRegistration.setForeground(Color.BLACK);
		mnRegistration.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmRegistration = new JMenuItem("Registration");
		mntmRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration CR = new CustomerRegistration();
				CR.setModalExclusionType(null);
				CR.setVisible(true);
				dispose();
			}
		});
		mntmRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnRegistration.add(mntmRegistration);
	}
