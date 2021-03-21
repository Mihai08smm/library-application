package Proiect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Poezii extends JFrame {

	private JPanel contentPane;
	private JTextField titlu;
	private JTextField autor;
	private JTextField editura;
	private JTable table;
	private JTextField id;
	DefaultTableModel model;
	private JTextField pret;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poezii frame = new Poezii();
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
	public Poezii() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Biblioteca");
		btnNewButton.setBounds(514, 11, 110, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Biblioteca obj= new Biblioteca();
				obj.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Titlu:");
		lblNewLabel.setBounds(22, 66, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor:");
		lblNewLabel_1.setBounds(22, 91, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Editura:");
		lblNewLabel_2.setBounds(22, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		titlu = new JTextField();
		titlu.setBounds(69, 63, 110, 20);
		contentPane.add(titlu);
		titlu.setColumns(10);
		
		autor = new JTextField();
		autor.setBounds(67, 91, 112, 20);
		contentPane.add(autor);
		autor.setColumns(10);
		
		editura = new JTextField();
		editura.setBounds(69, 116, 110, 20);
		contentPane.add(editura);
		editura.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(199, 66, 425, 284);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				titlu.setText(model.getValueAt(i, 1).toString());
				autor.setText(model.getValueAt(i, 2).toString());
				editura.setText(model.getValueAt(i, 3).toString());
				pret.setText(model.getValueAt(i, 4).toString());
			}
		});
		model= new DefaultTableModel();
		String [] column= {"ID","Titlu","Autor","Editura", "Pret"};
		model.setColumnIdentifiers(column);
		
		String [] column1= {"1","Poesii","Mihai Eminescu","Cartea Romaneasca", "33"};
		model.addRow(column1);
		
		String [] column2= {"2","Periodice","Mihai Eminescu","Cartea Romaneasca", "35"};
		model.addRow(column2);
		
		String [] column3= {"3","Postum","Mihai Eminescu","Corint", "25"};
		model.addRow(column3);
		
		String [] column4= {"4","La Lilieci","Marin Sorescu","Curtea Veche", "28"};
		model.addRow(column4);
		
		String [] column5= {"5","Singur pintre poeti","Marin Sorescu","Cartea Romaneasca", "18"};
		model.addRow(column5);
		
		String [] column6= {"6","Poezii","Ion Barbu","Haiducul", "30"};
		model.addRow(column6);
		
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Adauga");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(id.getText().equals("")|| titlu.getText().equals("")|| autor.getText().equals("")||editura.getText().equals("")||pret.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Te rog, introdu informatiile complete!");
				}
				else
				{
				column[0]=id.getText();
				column[1]=titlu.getText();
				column[2]=autor.getText();
				column[3]=editura.getText();
				column[4]=pret.getText();
				model.addRow(column);
				
				id.setText("");
				titlu.setText("");
				autor.setText("");
				editura.setText("");
				pret.setText("");
				}
				
			}
		});
		btnNewButton_1.setBounds(10, 179, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sterge");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btnNewButton_2.setBounds(100, 241, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Editeaza");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.setValueAt(id.getText(),i, 0);
				model.setValueAt(titlu.getText(),i, 1);
				model.setValueAt(autor.getText(),i, 2);
				model.setValueAt(editura.getText(),i, 3);
				model.setValueAt(pret.getText(),i, 4);
			}
		});
		btnNewButton_3.setBounds(10, 302, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setBounds(22, 41, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(67, 38, 112, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pret:");
		lblNewLabel_4.setBounds(22, 147, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		pret = new JTextField();
		pret.setBounds(69, 144, 110, 20);
		contentPane.add(pret);
		pret.setColumns(10);
	}
}
