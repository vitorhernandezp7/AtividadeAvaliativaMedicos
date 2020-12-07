package controller;

import dao.MedicoDao;
import model.Medicos;

public class MedicoController {

	public int cadastrar(int crm, String nome, String cpf, int telefone, String especialidade) {
		
		Medicos m = new Medicos(crm, nome, cpf, telefone, especialidade);
		MedicoDao mDao = new MedicoDao();
		return (mDao.create(m));
	}
	
	//criar um objeto de medico
	//metodo cadastrar
	
}
