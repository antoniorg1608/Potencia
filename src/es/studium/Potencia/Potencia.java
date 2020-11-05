package es.studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int base,exp,resultado,i;
		resultado=1;
		System.out.println("Dame un numero para la base ");
		base = teclado.nextInt();
		System.out.println("Dame un numero para el exponente ");
		exp = teclado.nextInt();
		teclado.close();
		
		for (i=1; i<=exp; i++)
		{
			resultado=resultado*base;
		}
		
	System.out.print("El número "+ base +" elevado a "+ exp +" es "+ resultado);
	}
}

