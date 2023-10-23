package EstructurasDeControl;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingrese un numero: "); 
        int dato = scanner.nextInt();

                int numero = 6;
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    System.out.println("El número " + numero + " es impar.");

                }
	}

}
