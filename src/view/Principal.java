package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) 
	{
		int vet[] = new int [1000];
		
		for(int i = 0; i < vet.length; i++)
		{
			vet[i] = (int)(Math.random() * 100) + 1; //numeros aleatorio de 100 |-- 300
			
		}
		
		for(int i = 0; i < 3; i++)
		{
			Thread t = new ThreadVetor(vet);
			t.start();
		}
	}

}
