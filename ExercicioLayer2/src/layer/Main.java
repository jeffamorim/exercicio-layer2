package layer;

import model.Conta;
import service.ContaService;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ContaService contaservice = new ContaService();
		Conta conta = new Conta();
		
		
		System.out.println("Digite seu cpf: ");
		conta.cpf = (leitor.next());
		
		System.out.println("Digite seu Nome: ");
		conta.nome = (leitor.next());
		
		System.out.println("Digite sua agencia: ");
		conta.agencia = (leitor.next());
		
		System.out.println("Digite o numero da sua conta: ");
		conta.contabancaria = (leitor.next());
		
		
		System.out.println("O numero do cpf �: "+conta.cpf);
		
		System.out.println("O nome do cliente �: "+conta.nome);
		
		System.out.println("O numero da agencia �: "+conta.agencia);
		
		System.out.println("o numero da conta �: "+conta.contabancaria);
		
		
		
		leitor.close();
	}

}
