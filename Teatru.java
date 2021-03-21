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

public class Teatru extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField titlu;
	private JTextField autor;
	private JTextField editura;
	private JTextField pret;
	private JTable table;
	DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teatru frame = new Teatru();
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
	public Teatru() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
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
		btnNewButton.setBounds(463, 11, 111, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(0, 0, 584, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 65, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titlu:");
		lblNewLabel_1.setBounds(10, 87, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setBounds(10, 112, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Editura:");
		lblNewLabel_3.setBounds(10, 137, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pret:");
		lblNewLabel_4.setBounds(10, 162, 46, 14);
		panel.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(162, 65, 412, 285);
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
				pret.setText(model.getValueAt(i, 4).toString());
			}
		});
		
		model= new DefaultTableModel();
		String [] column= {"ID","Titlu","Autor","Editura", "Pret"};
		model.setColumnIdentifiers(column);
		scrollPane.setViewportView(table);
		
		String [] column1= {"1","O scrisoare pierduta","Ion Luca Caragiale","Curtea Veche", "28"};
		model.addRow(column1);
		
		String [] column2= {"2","Napasta","Ion luca Cragiale","Curtea Veche", "27"};
		model.addRow(column2);
		
		String [] column3= {"3","Iona","Marin Sorescu","Cartea Romaneasca", "30"};
		model.addRow(column3);
		
		String [] column4= {"4","Matca","Marin Sorescu","Cartea Romaneasca", "28"};
		model.addRow(column4);
		
		String [] column5= {"5","O noapte furtunoasa","Ion Luca Caragiale","Corint", "21"};
		model.addRow(column5);
		
		String [] column6= {"6","Profu'"," Boris Ioan","Vrede", "54"};
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
				
				pret.setText("");
				titlu.setText("");
				autor.setText("");
				editura.setText("");
				id.setText("");
				}
			}
		});
		btnNewButton_1.setBounds(10, 201, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sterge");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btnNewButton_2.setBounds(66, 254, 89, 23);
		panel.add(btnNewButton_2);
		
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
		btnNewButton_3.setBounds(10, 307, 89, 23);
		panel.add(btnNewButton_3);
		
		titlu = new JTextField();
		titlu.setBounds(66, 84, 86, 20);
		panel.add(titlu);
		titlu.setColumns(10);
		
		autor = new JTextField();
		autor.setBounds(66, 109, 86, 20);
		panel.add(autor);
		autor.setColumns(10);
		
		editura = new JTextField();
		editura.setBounds(66, 134, 86, 20);
		panel.add(editura);
		editura.setColumns(10);
		
		pret = new JTextField();
		pret.setBounds(66, 159, 86, 20);
		panel.add(pret);
		pret.setColumns(10);
		
		id = new JTextField();
		id.setBounds(66, 62, 86, 20);
		panel.add(id);
		id.setColumns(10);
		
	}
	}
		