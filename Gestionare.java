package Proiect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Gestionare extends JFrame {

	private JPanel contentPane;
	DefaultTableModel model;
	private JTable table;
	private JTextField id;
	private JTextField titlu;
	private JTextField autor;
	private JTextField editura;
	private JTextField imprumutat;
	private JTextField datecontact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestionare frame = new Gestionare();
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
	public Gestionare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Biblioteca");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Biblioteca obj= new Biblioteca();
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(562, 11, 109, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 681, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 46, 651, 275);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				titlu.setText(model.getValueAt(i, 1).toString());
				autor.setText(model.getValueAt(i, 2).toString());
				editura.setText(model.getValueAt(i, 3).toString());
				imprumutat.setText(model.getValueAt(i, 4).toString());
				datecontact.setText(model.getValueAt(i, 5).toString());
			}
		});
		
		
		
		model= new DefaultTableModel();
		String [] column= {"ID","Titlu","Autor","Editura", "Imprumutat", "Date_Contact"};
		model.setColumnIdentifiers(column);
		
		String [] column1= {"1","Poesii","Mihai Eminescu","Cartea Romaneasca", "DA", "Popescu Ana, 0771437987, Str. Bnau Maracine, nr 35, Craiova, Dolj",};
		model.addRow(column1);
		
		String [] column2= {"2","Periodice","Mihai Eminescu","Cartea Romaneasca", "NU"};
		model.addRow(column2);
		
		String [] column3= {"3","Postum","Mihai Eminescu","Corint", "NU"};
		model.addRow(column3);
		
		String [] column4= {"4","La Lilieci","Marin Sorescu","Curtea Veche", "NU"};
		model.addRow(column4);
		
		String [] column5= {"5","Singur pintre poeti","Marin Sorescu","Cartea Romaneasca", "DA", "Ioan Dobre, 0772345232, str. Olteniei, bl. D5, ap 12, Craiova, Dolj"};
		model.addRow(column5);
		
		String [] column6= {"6","Poezii","Ion Barbu","Haiducul", "NU"};
		model.addRow(column6);
		
		String [] column7= {"7","Sarmanul Dionis","Mihai Eminescu","Curtea Veche", "NU"};
		model.addRow(column7);
		
		String [] column8= {"8","Geniu Pustiu","Mihai Eminescu","Curtea Veche", "NU"};
		model.addRow(column8);
		
		String [] column9= {"9","Trei dinti din fata","Marin Sorescu","Corint", "NU"};
		model.addRow(column9);
		
		String [] column10= {"10","Mara","Ioan Slavici","Cartea Romaneasca", "NU"};
		model.addRow(column10);
		
		String [] column11= {"11","Moara cu noroc","Ioan Slavici","Cartea Romaneasca", "NU"};
		model.addRow(column11);
		
		String [] column26= {"12","Amintiri din copilarie","Ion Creanga","Corint", "NU"};
		model.addRow(column26);
		
		String [] column27= {"13","Basme","Ion Creanga","Cartea Romaneasca", "NU"};
		model.addRow(column27);
		
		String [] column28= {"14","Basme","Petre Ispirescu","Doispe", "NU"};
		model.addRow(column28);
		
		String [] column21= {"15","O scrisoare pierduta","Ion Luca Caragiale","Curtea Veche", "NU"};
		model.addRow(column21);
		
		String [] column22= {"16","Napasta","Ion luca Cragiale","Curtea Veche", "NU"};
		model.addRow(column22);
		
		String [] column23= {"17","Iona","Marin Sorescu","Cartea Romaneasca", "NU"};
		model.addRow(column23);
		
		String [] column24= {"18","Matca","Marin Sorescu","Cartea Romaneasca", "NU"};
		model.addRow(column24);
		
		String [] column25= {"19","O noapte furtunoasa","Ion Luca Caragiale","Corint", "NU"};
		model.addRow(column25);
		
		String [] column36= {"20","Profu'","Boris Ioan","Vrede", "NU"};
		model.addRow(column36);
		
		table.setModel(model);
		
		
		JButton btnNewButton_1 = new JButton("Adauga");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(id.getText().equals("")|| titlu.getText().equals("")|| autor.getText().equals("")||editura.getText().equals("")||imprumutat.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Te rog, introdu informatiile complete!");
				}
				else
				{
				column[0]=id.getText();
				column[1]=titlu.getText();
				column[2]=autor.getText();
				column[3]=editura.getText();
				column[4]=imprumutat.getText();
				column[5]=datecontact.getText();
				model.addRow(column);
				
				id.setText("");
				titlu.setText("");
				autor.setText("");
				editura.setText("");
				imprumutat.setText("");
				datecontact.setText("");
				}
				
			}
		});
		
		btnNewButton_1.setBounds(382, 323, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sterge");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btnNewButton_2.setBounds(557, 323, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Editeaza");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.setValueAt(id.getText(),i, 0);
				model.setValueAt(titlu.getText(),i, 1);
				model.setValueAt(autor.getText(),i, 2);
				model.setValueAt(editura.getText(),i, 3);
				model.setValueAt(imprumutat.getText(),i, 4);
				model.setValueAt(datecontact.getText(),i, 5);
			}
		});
		btnNewButton_3.setBounds(470, 371, 89, 23);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(20, 327, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblTitlu = new JLabel("Titlu:");
		lblTitlu.setBounds(20, 352, 46, 14);
		panel.add(lblTitlu);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(20, 375, 46, 14);
		panel.add(lblAutor);
		
		id = new JTextField();
		id.setBounds(68, 324, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		titlu = new JTextField();
		titlu.setBounds(68, 349, 86, 20);
		contentPane.add(titlu);
		titlu.setColumns(10);
		
		autor= new JTextField();
		autor.setBounds(68, 372, 86, 20);
		contentPane.add(autor);
		autor.setColumns(10);
		
		JLabel lblEditura = new JLabel("Editura:");
		lblEditura.setBounds(185, 327, 46, 14);
		panel.add(lblEditura);
		
		JLabel lblImprumutat = new JLabel("Imprumutat:");
		lblImprumutat.setBounds(185, 352, 73, 14);
		panel.add(lblImprumutat);
		
		JLabel lblDateContact = new JLabel("Date contact:");
		lblDateContact.setBounds(185, 375, 73, 14);
		panel.add(lblDateContact);
		
		editura = new JTextField();
		editura.setBounds(255, 324, 86, 20);
		contentPane.add(editura);
		editura.setColumns(10);
		
		imprumutat = new JTextField();
		imprumutat.setColumns(10);
		imprumutat.setBounds(255, 349, 86, 20);
		contentPane.add(imprumutat);
		
		datecontact = new JTextField();
		datecontact.setColumns(10);
		datecontact.setBounds(255, 372, 86, 20);
		contentPane.add(datecontact);
		
		
		scrollPane.setViewportView(table);
	}
}
