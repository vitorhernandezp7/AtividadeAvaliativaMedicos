package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	private final static String url="jdbc:sqlserver://localhost:1433;databaseName=bdMedicos";
	private final static String userName="sa";
	private final static String password="gdfasjketral1";
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados"+e.getMessage());
		}
		return null;
	}
	
	public static void CloseConnection(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "erro ao finalizar a conexao com o banco de dados");
			}
		}
	}
	
	public static void CloseConnection(Connection con, PreparedStatement stmt) {
		CloseConnection(con);
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao finalizar a conexão", "Erro", 2);
			}
		}
	}
	
}
