package testes;

import java.util.Scanner;

public class TestaVetores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tamanho = Integer.valueOf(args[0]);
		
		//Criação de vetores
		float[] valores = new float[tamanho];
		
		float[]totais = new float[12];
		
		String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};


		System.out.println("Tamanho do vetor: " + valores.length);
		int mes = 0;
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = ler.nextFloat();
			mes = ler.nextInt();
			totais[mes - 1] += valores[i];
		}
		
		float total = 0;
		for (float valor : valores) {
			//System.out.println(valor);
			total += valor;
			
		}
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("%s = R$%.2f\n",
					meses[i], 
					totais[i]
					);
		}
		
		System.out.println("a soma de todos os vetores é: " + total);
	}
}
