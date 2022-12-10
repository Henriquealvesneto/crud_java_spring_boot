package fatorial;

import java.util.Scanner;

public class Fatorial {
		public static void main (String args[]){
			
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o número desejado: ");
		double x = s.nextInt(); 
		double resultado = x;
		
		if (x < 0){
			System.out.println("O número deve ser maior ou igual a zero");
		}else {
		
		while (x > 1){ 

			resultado = resultado *(x-1); 
		  x--; 
			} 
		System.out.println("O resultado do numero fatorial é: " + resultado);
		}
		
	}

}

