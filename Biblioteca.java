package Proiect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Biblioteca extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteca frame = new Biblioteca();
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
	public Biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Gestionare carti");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Gestionare obj= new Gestionare();
				obj.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_5.setBounds(293, 48, 161, 23);
		contentPane.add(btnNewButton_5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 0, 454, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Genul cartii");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Poezie");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Poezii obj= new Poezii();
				obj.main(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Teatru");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Teatru obj=new Teatru();
				obj.main(null);
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Proza");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Literatura obj= new Literatura();
				obj.main(null);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Autori");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Ioan Slavici");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IoanSlavici obj = new IoanSlavici();
				obj.main(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Ion Creanga");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IonCreanga obj = new IonCreanga();
				obj.main(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Ion Luca Caragiale");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IonLucaCaragiale obj = new IonLucaCaragiale();
				obj.main(null);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Marin Sorescu");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MarinSorescu obj = new MarinSorescu();
				obj.main(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Mihai Eminescu");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MihaiEminescu obj = new MihaiEminescu();
				obj.main(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Alti Autori");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltiAutori obj = new AltiAutori();
				obj.main(null);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_2 = new JMenu("Editura");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Cartea Romaneasca");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CarteaRomaneasca obj = new CarteaRomaneasca();
				obj.main(null);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Corint");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Corint obj = new Corint();
				obj.main(null);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Curtea Veche");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CurteaVeche obj = new CurteaVeche();
				obj.main(null);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Alte Edituri");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlteEdituri obj = new AlteEdituri();
				obj.main(null);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_12);
		
		JTextPane txtpnCitatulZileide = new JTextPane();
		txtpnCitatulZileide.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpnCitatulZileide.setText("Citatul zilei:\r\n\u201EDe aproape dou\u0103 mii de ani ni se predic\u0103 s\u0103 ne iubim, iar noi ne sf\u00E2\u0219iem.\u201D \u2014 Mihai Eminescu");
		txtpnCitatulZileide.setBounds(10, 293, 464, 101);
		contentPane.add(txtpnCitatulZileide);
		
		JLabel lblNewLabel = new JLabel("Bine ai venit, bibliotecarule!\r\n");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(34, 96, 407, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sa ai o zi frumoasa!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(33, 177, 335, 70);
		contentPane.add(lblNewLabel_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
