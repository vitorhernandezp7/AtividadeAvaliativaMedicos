package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.Medicos;

public class MedicoDao {

	public int create(Medicos m) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sqlInsert = "INSERT INTO medicos(crm, nome, cpf, telefone,especialidade) VALUES (?,?,?,?,?)";
		
		con = ConnectionFactory.getConnection();
		try {
			stmt = con.prepareStatement(sqlInsert);
			stmt.setInt(1, m.getCrm());
			stmt.setString(2, m.getNome());
			stmt.setString(3,  m.getCpf());
			stmt.setInt(4, m.getTelefone());
			stmt.setString(5, m.getEspecialidade());
			stmt.execute();
			return 1;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro na inserção dos medicos", "Erro", 2);
			return 0; 
		}
		finally{
			ConnectionFactory.CloseConnection(con, stmt);
		}
	}
}
