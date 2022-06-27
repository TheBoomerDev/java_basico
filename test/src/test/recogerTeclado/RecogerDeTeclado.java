package test.recogerTeclado;

import java.util.Scanner;

public class RecogerDeTeclado {

	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter length ");
	    int length = console.nextInt();
	    
	    System.out.println("VAlor: "+length);
	}

}
