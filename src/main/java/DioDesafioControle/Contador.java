package DioDesafioControle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contador {

	
	private static void validaParametro(int param1, int param2) throws ParametrosInvalidosException {
		
		if(param1 > param2) {
			
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		}
	}

	public static void main(String[] args) {
		
		List<Integer> teste = solicitaParametros();
		
		
		int inicio = teste.get(0), fim = teste.get(1);
		
		try{
			
			validaParametro(inicio, fim);
		
			for(int i = inicio; i < fim; i++) {
				System.out.println("Imprimindo o número " + (i+1));	
			}
		
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			System.out.println(e.getMessage() + " ->>>> Primeiro parametro informado: " + inicio);
		};
	}
	
	
	private static List<Integer> solicitaParametros() {
		
		
		System.out.println("Informe os parametros 1 e 2 que representam os números inteiros para iniciarmos o controle de fluxo:");
		
		Scanner read = new Scanner(System.in);
		
		List<Integer> parameters = new ArrayList<>();
		
		System.out.println("Informe o parametro 1");
		
		parameters.add(read.nextInt());

		System.out.println("Informe o parametro 2");

		parameters.add(read.nextInt());
		
		read.close();
		
		return parameters;
			
	}

	
}
