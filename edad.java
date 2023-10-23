package EstructurasDeControl;

import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("introduce tu edad, por favor ");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		
		if (edad>= 0 && edad<=18) {
			System.out.println("es joven");
		}else if (edad >18 && edad<=30) {
			System.out.println("es adulto");
		}else {
			System.out.println("es pureta");
		}
		
	}

}
