package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class daoLogin {
	public static void Login (String login, String senha){

		Connection controleAcesso = null;
		Statement consulta = null;
		ResultSet tabela = null;
		
		boolean acesso;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			controleAcesso = DriverManager.getConnection("jdbc:mysql://localhost/novarecpcao","root","101191");
			consulta = (Statement) controleAcesso.createStatement();
			tabela = consulta.executeQuery("select login, senha from usuario where login='"+login+"'and senha='"+senha+"'");
			if (tabela.next()){
				JOptionPane.showMessageDialog(null, "Acesso autorizado");
				acesso=true;
			}else{
				JOptionPane.showMessageDialog(null, "Usuário e senha inválido");
				acesso=false;
			}
		}catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados, tente novamente");
			acesso=false;
		}
	}
}
