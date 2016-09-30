package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainContent extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablePremios;
	private JLabel lblNumPremios;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtNumero3;
	private JTextField txtNumero4;
	private JTextField txtNumero5;
	private JTextField txtEstrela1;
	private JTextField txtEstrela2;

	public static boolean isNotValidNumeric(String str)  
	{  
		double d = -1;
		try {  
			d = Double.parseDouble(str);
		} catch(NumberFormatException nfe) {
			return true;
		}
		if(d >= 0)
			return false;
		else
			return true;
	}
	
	private boolean isNotValidWinnerKey() {
		return (isNotValidNumeric(txtNumero1.getText()) || isNotValidNumeric(txtNumero2.getText()) || isNotValidNumeric(txtNumero3.getText()) || isNotValidNumeric(txtNumero4.getText()) || isNotValidNumeric(txtNumero5.getText()) || isNotValidNumeric(txtEstrela1.getText()) || isNotValidNumeric(txtEstrela2.getText()));
	}
	
	private void verify() {
		if (isNotValidWinnerKey()) {
			// Mensagem de erro
			return;
		}
		
	}

	private void clearAll() {
		txtNumero1.setText("");
		txtNumero2.setText("");
		txtNumero3.setText("");
		txtNumero4.setText("");
		txtNumero5.setText("");
		txtEstrela1.setText("");
		txtEstrela2.setText("");
		// tablePremios - clear table
	}
	
	public MainContent() {
		setLayout(null);
		setBounds(0, 0, 470, 350);
		
		JLabel lblVerificadorEuro = new JLabel("VERIFICADOR EURO");
		lblVerificadorEuro.setFont(new Font("Dialog", Font.BOLD, 18));
		lblVerificadorEuro.setBounds(139, 12, 200, 38);
		add(lblVerificadorEuro);
		
		JLabel lblNumeros = new JLabel("Números");
		lblNumeros.setBounds(12, 73, 70, 15);
		add(lblNumeros);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(12, 100, 30, 20);
		add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JLabel labeltraco1 = new JLabel("-");
		labeltraco1.setBounds(45, 100, 15, 15);
		add(labeltraco1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(54, 100, 30, 20);
		add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel labeltraco2 = new JLabel("-");
		labeltraco2.setBounds(87, 100, 15, 15);
		add(labeltraco2);
		
		txtNumero3 = new JTextField();
		txtNumero3.setBounds(96, 100, 30, 20);
		add(txtNumero3);
		txtNumero3.setColumns(10);
		
		JLabel labeltraco3 = new JLabel("-");
		labeltraco3.setBounds(129, 100, 15, 15);
		add(labeltraco3);
		
		txtNumero4 = new JTextField();
		txtNumero4.setBounds(138, 100, 30, 20);
		add(txtNumero4);
		txtNumero4.setColumns(10);
		
		JLabel labeltraco4 = new JLabel("-");
		labeltraco4.setBounds(171, 100, 15, 15);
		add(labeltraco4);
		
		txtNumero5 = new JTextField();
		txtNumero5.setBounds(180, 100, 30, 20);
		add(txtNumero5);
		txtNumero5.setColumns(10);
		
		JLabel labelmais = new JLabel("+");
		labelmais.setBounds(223, 102, 15, 15);
		add(labelmais);
		
		JLabel lblEstrelas = new JLabel("Estrelas");
		lblEstrelas.setBounds(246, 73, 70, 15);
		add(lblEstrelas);
		
		txtEstrela1 = new JTextField();
		txtEstrela1.setBounds(246, 100, 30, 20);
		add(txtEstrela1);
		txtEstrela1.setColumns(10);
		
		JLabel labeltraco5 = new JLabel("-");
		labeltraco5.setBounds(279, 100, 15, 15);
		add(labeltraco5);
		
		txtEstrela2 = new JTextField();
		txtEstrela2.setBounds(288, 100, 30, 20);
		add(txtEstrela2);
		txtEstrela2.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(353, 68, 105, 52);
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				verify();
			}
		});
		add(btnVerificar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(353, 132, 105, 25);
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearAll();
			}
		});
		add(btnLimpar);
		
		JLabel lblPremios = new JLabel("Prémios");
		lblPremios.setBounds(12, 144, 70, 15);
		add(lblPremios);
		
		lblNumPremios = new JLabel(": 0");
		lblNumPremios.setBounds(73, 144, 70, 15);
		add(lblNumPremios);
		
		tablePremios = new JTable();
		tablePremios.setBounds(12, 171, 446, 167);
		add(tablePremios);
		
		clearAll();
	}

}