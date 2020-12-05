package controller;

import dao.MedicoDao;
import model.Medicos;

public class MedicoController {

	public int cadastrar(int crm, String nome, String cpf, int telefone) {
		
		Medicos m = new Medicos(crm, nome, cpf, telefone);
		MedicoDao mDao = new MedicoDao();
		return (mDao.create(m));
	}
	
	//criar um objeto de medico
	//metodo cadastrar
	
}
