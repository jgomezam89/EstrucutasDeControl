package EstructurasDeControl;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce una edad");
		int edad = 0;
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		 if(edad >= 0 && edad<=15) {
			 System.out.println("es joven");
		 }
		 else if (edad >=16 && edad <=18) {
			 System.out.println("es adolescente");
		 }
		 else  {
			 System.out.println("es adulto");
		 }

	}

}
