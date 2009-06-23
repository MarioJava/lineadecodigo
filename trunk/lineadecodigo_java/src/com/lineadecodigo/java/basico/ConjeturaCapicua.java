package com.lineadecodigo.java.basico;

/**
 * @file ConjeturaCapicua.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   22.junio.2009
 * @url  http://lineadecodigo.com/java/la-conjetura-capicua-con-java/
 * @description Como aplicar la conjetura capicua con Java. Mediante la suma de n�meros.  
 */

import java.util.Scanner;

public class ConjeturaCapicua {

	/**
	 * @param args
	 */
	

	
	static public long invertirNumero(long numero){
	
		long falta,numeroInvertido,resto;

		falta=numero;	
		numeroInvertido=0;
		resto=0;
		
		// El c�digo que viene a continuaci�n da la vuelta a un numero
		while(falta!=0)
		{
		 resto=falta%10;
		 numeroInvertido=numeroInvertido*10+resto;
		 falta=falta/10;		 		 
		}

		return numeroInvertido;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		long numero = 0;
		
		while (numero<=0) {
			System.out.println("Dame un n�mero:");
			numero = reader.nextLong();
		}
			
		
		
		long numeroInvertido = invertirNumero(numero);
		
		while ((numero != numeroInvertido) && (numero<1000000000)) {					
			numero+=numeroInvertido;
			numeroInvertido = invertirNumero(numero);						
		}
		
		if (numero == numeroInvertido)
			System.out.println("El n�mero capicua encontrado es " + numero);
		else
			System.out.println("No tenemos capacidad de encontrar el capicua");
		

	}

}
