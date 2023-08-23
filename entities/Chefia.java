package entities;

public class Chefia extends Funcionario {
	
	@Override
	//
	public double salarioLiquido() {
		return salario + (salario*0.05);
	}

}