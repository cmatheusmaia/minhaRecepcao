package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setTitle("Nova Recep\u00E7\u00E3o - Ferramenta de gest\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telaLogin.class.getResource("/img/novaRecepcao_Redonda.png")));
		lblNewLabel.setBounds(41, 108, 300, 83);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DESENVOLVIMENTO REALIZADO POR MATHEUS MAIA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(SystemColor.control);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(62, 442, 276, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Arial", Font.PLAIN, 11));
		lblUsurio.setBounds(89, 244, 58, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha.setBounds(89, 271, 58, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(145, 241, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 268, 149, 20);
		contentPane.add(passwordField);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEntrar.setBounds(88, 299, 101, 23);
		contentPane.add(btnEntrar);
		
		JButton btnFechar = new JButton("FECHAR");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gerenciamento.gerLogin.sair(null);
			}
		});
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFechar.setBounds(191, 299, 103, 23);
		contentPane.add(btnFechar);
		
		JLabel lblBemVindoaAo = new JLabel("Bem vindo(a)");
		lblBemVindoaAo.setForeground(Color.WHITE);
		lblBemVindoaAo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBemVindoaAo.setBounds(84, 205, 252, 19);
		contentPane.add(lblBemVindoaAo);
		
		JLabel lblInsiraSeusDados = new JLabel("insira seus dados para ter acesso ao sistema");
		lblInsiraSeusDados.setForeground(Color.WHITE);
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInsiraSeusDados.setBounds(86, 221, 218, 19);
		contentPane.add(lblInsiraSeusDados);
	}
}
