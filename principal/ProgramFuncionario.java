package principal;
import java.util.Scanner;
import entities.Funcionario;
import entities.Chefia;

public class ProgramFuncionario {

	public static void main(String[] args) {
		
		Scanner lendo = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		Funcionario chefia = new Chefia();
		
		
		System.out.println("funcionario : ");
	
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(lendo.next());
		
		System.out.println("Digite o cargo do funcionario: ");
		funcionario.setCargo(lendo.next());
		
		System.out.println("Digite a idade do funcionario: ");
		funcionario.setIdade(lendo.nextInt());
		
		System.out.println("Digite o salariodo funcionario:");
		funcionario.setSalarioBruto(lendo.nextDouble());
	
		
		System.out.println("Funcionario 'Chefia': ");
		
		System.out.println("Digite o nome do funcionario: ");
		chefia.setNome(lendo.next());
		
		
		chefia.setCargo("Chefia");
		
		System.out.println("Digite a idade do funcionario: ");
		chefia.setIdade(lendo.nextInt());
		
		System.out.println("Digite o salario do funcionario:");
		chefia.setSalarioBruto(lendo.nextDouble());
		
		funcionario.ObterDados();
		chefia.ObterDados();
		
		lendo.close();
	}

}