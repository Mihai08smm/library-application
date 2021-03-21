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

public class Literatura extends JFrame {

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
					Literatura frame = new Literatura();
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
	public Literatura() {
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
		btnNewButton.setBounds(466, 11, 108, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 584, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 65, 72, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titlu:");
		lblNewLabel_1.setBounds(10, 93, 72, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setBounds(10, 118, 72, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Editura:");
		lblNewLabel_2_1.setBounds(10, 143, 72, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Pret:");
		lblNewLabel_2_2.setBounds(10, 168, 72, 14);
		panel.add(lblNewLabel_2_2);
		
		id = new JTextField();
		id.setBounds(63, 62, 101, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		titlu = new JTextField();
		titlu.setColumns(10);
		titlu.setBounds(63, 90, 101, 20);
		contentPane.add(titlu);
		
		autor = new JTextField();
		autor.setColumns(10);
		autor.setBounds(63, 118, 101, 20);
		contentPane.add(autor);
		
		editura = new JTextField();
		editura.setColumns(10);
		editura.setBounds(63, 143, 101, 20);
		contentPane.add(editura);
		
		pret = new JTextField();
		pret.setColumns(10);
		pret.setBounds(63, 168, 101, 20);
		contentPane.add(pret);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 65, 400, 285);
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
		
		String [] column1= {"1","Sarmanul Dionis","Mihai Eminescu","Curtea Veche", "25"};
		model.addRow(column1);
		
		String [] column2= {"2","Geniu Pustiu","Mihai Eminescu","Curtea Veche", "27"};
		model.addRow(column2);
		
		String [] column3= {"3","Trei dinti din fata","Marin Sorescu","Corint", "29"};
		model.addRow(column3);
		
		String [] column4= {"4","Mara","Ioan Slavici","Cartea Romaneasca", "28"};
		model.addRow(column4);
		
		String [] column5= {"5","Moara cu noroc","Ioan Slavici","Cartea Romaneasca", "18"};
		model.addRow(column5);
		
		String [] column6= {"6","Amintiri din copilarie","Ion Creanga","Corint", "26"};
		model.addRow(column6);
		
		String [] column7= {"7","Basme","Ion Creanga","Cartea Romaneasca", "25"};
		model.addRow(column7);
		
		String [] column8= {"8","Basme","Petre Ispirescu","Doispe", "25.99"};
		model.addRow(column8);
		
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
			
		btnNewButton_1.setBounds(10, 199, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sterge");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				model.removeRow(i);
				
			}
		});
		btnNewButton_2.setBounds(75, 252, 89, 23);
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
	}
}
