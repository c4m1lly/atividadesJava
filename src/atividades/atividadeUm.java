package atividades;

import java.util.Scanner;

public class atividadeUm {

	public static void main(String[] args) {

		float salario;
		float abono;
		float novoSalario;
		
		Scanner ler= new Scanner(System.in);
		
	    System.out.println ("Digite o salário atual: ");
	    salario = ler.nextFloat();
	    
	    System.out.println ("Digite o abono: ");
	    abono = ler.nextFloat();
	    
	   float salarioComabono = salario + abono ;
	    
	    System.out.println ("O novo salário é: " +  salarioComabono);
	    abono = ler.nextFloat();


	}

}
