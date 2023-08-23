package entities;

public class Funcionario {
	private String cargo;
	private String nome;
	protected double salario;
	private int idade;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salario;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double salarioLiquido() {
		 return salario;
	}
	
	public void ObterDados() {
	
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Idade: " + idade);
		System.out.printf("Salario: %.2f " , salario);
		System.out.println();
		System.out.printf("Bonificações: %.2f " , (salarioLiquido()- salario));
		System.out.println();
		System.out.printf("Total a receber: %.2f" , salarioLiquido());
		
	}

}