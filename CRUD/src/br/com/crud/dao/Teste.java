package br.com.crud.dao;

import java.util.Date;
import br.com.crud.model.Contato;

	public class Teste {
		public static void main(String args[]) {
			ContatoDAO contatoDAO = new ContatoDAO();
			
			Contato contato = new Contato();
			contato.setNome("Marcelle");
			contato.setIdade(30);
			contato.setDataCadastro(new Date());
			
			contatoDAO.save(contato);
			
			Contato contato1 = new Contato();
			contato1.setId(1);
			contato1.setNome("NOME NOVO");
			contato1.setIdade(32);
			contato1.setDataCadastro(new Date());
			
			contatoDAO.update(contato1);
			
			contatoDAO.removeById(1);
			
			for(Contato c : contatoDAO.getContatos()) {
				System.out.println("NOME: " + c.getNome());
			}
		}

}

