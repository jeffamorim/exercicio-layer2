package repository;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public class ContaRepository {
	
	private List<Conta> lista = new ArrayList<Conta>();
	
	public void setConta(Conta conta) {
		lista.add(conta);
	}
}
