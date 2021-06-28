package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDiscount;
	private JTextField textFieldDis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBounds(0, 0, 1047, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnConform = new JButton("Confirm");
		btnConform.setBackground(new Color(250, 235, 215));
		btnConform.setFont(new Font("STZhongsong", Font.PLAIN, 20));
		btnConform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//2.2 Exception handling
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldDiscount.getText(),	
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Discount Update confirmed", "Advertisement",
								JOptionPane.OK_OPTION);
					}
				}
				textFieldDis.setText(textFieldDiscount.getText());
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		btnConform.setBounds(374, 221, 119, 44);
		panel.add(btnConform);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setFont(new Font("STXinwei", Font.PLAIN, 20));
		lblDiscount.setBounds(340, 153, 101, 33);
		panel.add(lblDiscount);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setBackground(new Color(230, 230, 250));
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDiscount.setBounds(451, 151, 67, 38);
		panel.add(textFieldDiscount);
		textFieldDiscount.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login L = new Login();
				L.setModalExclusionType(null);
				L.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnExit.setBounds(384, 275, 99, 55);
		panel.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1047, 26);
		panel.add(menuBar);
		
		JMenu mnProfile = new JMenu("Profile");
		mnProfile.setForeground(Color.BLACK);
		mnProfile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProfile);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCompany ACB = new AdminCompany();
				ACB.setModalExclusionType(null);
				ACB.setVisible(true);
				dispose();
			}
		});
		mntmProfile.setForeground(Color.BLACK);
		mntmProfile.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnProfile.add(mntmProfile);
		
		JMenu mnAdvertise = new JMenu("Advertisement");
		mnAdvertise.setForeground(Color.BLACK);
		mnAdvertise.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdvertise);
		
		JMenuItem mntmAdvertise = new JMenuItem("Advertisement");
		mntmAdvertise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement A = new Advertisement();
				A.setModalExclusionType(null);
				A.setVisible(true);
				dispose();
			}
		});
		mntmAdvertise.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdvertise.add(mntmAdvertise);
		
		JMenu mnVehicle = new JMenu("Clothing Info");
		mnVehicle.setForeground(Color.BLACK);
		mnVehicle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnVehicle);
		
		JMenuItem mntmVehicle = new JMenuItem("Vehicle Info");
		mntmVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminInfo AVI = new AdminInfo();
				AVI.setModalExclusionType(null);
				AVI.setVisible(true);
				dispose();
			}
		});
		mntmVehicle.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnVehicle.add(mntmVehicle);
		
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setForeground(Color.BLACK);
		mnEmployee.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnEmployee);
		
		JMenuItem mntnEmployee = new JMenuItem("Employee");
		mntnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee E = new Employee();
				E.setModalExclusionType(null);
				E.setVisible(true);
				dispose();
			}
		});
		mntnEmployee.setForeground(Color.BLACK);
		mntnEmployee.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnEmployee.add(mntnEmployee);
		
		JMenu mnFinance = new JMenu("Finance");
		mnFinance.setForeground(Color.BLACK);
		mnFinance.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFinance);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance F = new Finance();
				F.setModalExclusionType(null);
				F.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFinance.add(mntmFinance);
		JTable t = AdminCompany.getTable();
		String n="";

				for(int i = 0; i<t.getRowCount(); i++) { 
				n= String.valueOf(t.getValueAt(i, 0));}
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(0, 387, 1047, 255);
		contentPane.add(panel_1);
		
		JButton btnForMoreInformation = new JButton(" https://www.instagram.com/rental_clothing_world/");
		btnForMoreInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				//2.2 Exception Handling
				try {
					browser.browse(new URI("https://www.instagram.com/rental_clothing_world/"));
				}
				
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnForMoreInformation.setBackground(new Color(230, 230, 250));
		btnForMoreInformation.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnForMoreInformation.setBounds(0, 230, 1047, 25);
		panel_1.add(btnForMoreInformation);
		
		JLabel lblLowestPriceRm = new JLabel("Have a good choice!");
		lblLowestPriceRm.setForeground(new Color(0, 0, 0));
		lblLowestPriceRm.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblLowestPriceRm.setBounds(376, 195, 358, 25);
		panel_1.add(lblLowestPriceRm);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 240, 230));
		panel_2.setBounds(0, 338, 1047, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Discount for 5 cloths! (%)");
		lblNewLabel_1.setBounds(317, 13, 392, 25);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		
		textFieldDis = new JTextField();
		textFieldDis.setBackground(new Color(230, 230, 250));
		textFieldDis.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		textFieldDis.setBounds(244, 6, 50, 38);
		panel_2.add(textFieldDis);
		textFieldDis.setColumns(10);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		Advertisement.table = table;
	}
}
