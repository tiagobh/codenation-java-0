package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		List<Integer> numeros = new ArrayList<>();
		int i = 1;
		int j = 0;
		int f = 0;
		for(int k = 0; f < 350; k++){
			if(j <= 0) {
				numeros.add(j);
			}
			f = i + j;
			i = j;
			j = f;

			if(f <= 350){
                numeros.add(f);
            }

		}
		return numeros;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}
