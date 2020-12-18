package br.com.bo;

import br.com.bean.*;
import br.com.dao.*;

public class PessoaBO {
	
	public String inserePessoa(String nome, String matricula, String disciplina) {
		
		try {
			PessoaBean pessoaBean = new PessoaBean(nome, matricula, disciplina);
			PessoaDAO pessoaDao = new PessoaDAO();
			
			if(pessoaDao.insert(pessoaBean) == true) {
				return "Saida.jsp";
			}
			else {
				return "Entrada.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Entrada.jsp";
		}
		
	}
	
}
