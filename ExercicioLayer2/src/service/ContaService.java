package service;

import model.Conta;
import repository.ContaRepository;

public class ContaService {
	
	
	public void setConta(Conta conta){
		ContaRepository repository = new ContaRepository();
		
		repository.setConta(conta);
	}
}
