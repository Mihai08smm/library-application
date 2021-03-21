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

public class MihaiEminescu extends JFrame {

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
					MihaiEminescu frame = new MihaiEminescu();
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
	public MihaiEminescu() {
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
		btnNewButton.setBounds(465, 11, 109, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 584, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 49, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titlu:");
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setBounds(10, 99, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Editura:");
		lblNewLabel_3.setBounds(10, 124, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pret:");
		lblNewLabel_4.setBounds(10, 149, 46, 14);
		panel.add(lblNewLabel_4);
		
		id = new JTextField();
		id.setBounds(53, 46, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		titlu = new JTextField();
		titlu.setColumns(10);
		titlu.setBounds(53, 74, 86, 20);
		contentPane.add(titlu);
		
		autor = new JTextField();
		autor.setColumns(10);
		autor.setBounds(53, 99, 86, 20);
		contentPane.add(autor);
		
		editura = new JTextField();
		editura.setColumns(10);
		editura.setBounds(53, 124, 86, 20);
		contentPane.add(editura);
		
		pret = new JTextField();
		pret.setColumns(10);
		pret.setBounds(53, 146, 86, 20);
		contentPane.add(pret);
		
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
		
		String [] column4= {"4","Sarmanul Dionis","Mihai Eminescu","Curtea Veche", "25"};
		model.addRow(column4);
		
		String [] column5= {"5","Geniu Pustiu","Mihai Eminescu","Curtea Veche", "27"};
		model.addRow(column5);
		
		table.setModel(model);
		
		
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
		btnNewButton_1.setBounds(10, 192, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sterge");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i=table.getSelectedRow();
				model.removeRow(i);
			}
		});
		btnNewButton_2.setBounds(50, 249, 89, 23);
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
		btnNewButton_3.setBounds(10, 291, 89, 23);
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 49, 425, 301);
		panel.add(scrollPane);
		
		
		scrollPane.setViewportView(table);
	}

}