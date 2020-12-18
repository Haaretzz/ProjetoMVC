package br.com.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.bean.*;

public class PessoaDAO {

	public static List<PessoaBean> lista = null;
	
	public PessoaDAO(){
		
		if(lista==null) {
			lista = new ArrayList<PessoaBean>();
			PessoaBean pessoaBean= new PessoaBean("Joao", "SP3030644", "LP2A4");
			lista.add(pessoaBean);
		}
	}
	
	public boolean insert(PessoaBean pessoaBean) throws Exception{
			
		lista.add(pessoaBean);
		return true;
	}

}
