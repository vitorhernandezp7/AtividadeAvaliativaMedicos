package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MedicoController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroMedicos extends JFrame {
	
	private JLabel lblCrm;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEspecialidade;
	private JTextField txtCrm;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JComboBox comboBox;

	public TelaCadastroMedicos() {
		setTitle("Cadastro de M\u00E9dicos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 428);
		getContentPane().setLayout(null);
		
		lblCrm = new JLabel("CRM");
		lblCrm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrm.setBounds(30, 32, 46, 14);
		getContentPane().add(lblCrm);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(30, 95, 46, 14);
		getContentPane().add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(30, 150, 46, 14);
		getContentPane().add(lblCpf);
		
		lblEspecialidade = new JLabel("ESPECIALIDADE");
		lblEspecialidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecialidade.setBounds(30, 213, 99, 14);
		getContentPane().add(lblEspecialidade);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(30, 269, 78, 14);
		getContentPane().add(lblTelefone);
		
		txtCrm = new JTextField();
		txtCrm.setBounds(30, 57, 197, 20);
		getContentPane().add(txtCrm);
		txtCrm.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(30, 120, 197, 20);
		getContentPane().add(txtNome);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(30, 175, 197, 20);
		getContentPane().add(txtCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(30, 294, 197, 20);
		getContentPane().add(txtTelefone);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cardiologista", "Cl\u00EDnico geral", "Dermatologista", "Endocrinologista", "Neurologista"}));
		comboBox.setBounds(30, 238, 197, 22);
		getContentPane().add(comboBox);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.setBounds(30, 339, 89, 23);
		getContentPane().add(btnLimpar);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String crm = txtCrm.getText();
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String telefone = txtTelefone.getText();
				if(crm.equals("")||nome.equals("")||cpf.equals("")||telefone.equals("")) {
					JOptionPane.showMessageDialog(null, "Voce deve preencher todos os campos", "Atençao", 2);
				}
				else {
					MedicoController mcontrol = new MedicoController();
					if(mcontrol.cadastrar(Integer.parseInt(crm), nome, cpf, Integer.parseInt(telefone))==1) {
						JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso", "Atenção", 1);
						limpar();
					}
					else {
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar medicos");
					}
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnviar.setBounds(138, 339, 89, 23);
		getContentPane().add(btnEnviar);
		
	}
	
	public void limpar() {
		txtCrm.setText("");
		txtNome.setText("");
		txtCpf.setText("");
		txtTelefone.setText("");
		
		System.out.println("");
		System.out.println("");
	}
}
