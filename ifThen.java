package EstructurasDeControl;

import java.util.Scanner;

public class ifThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduzca un numero");
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
	
		
		if (num % 2 ==0) {
			System.out.println("el numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}

	}
	
}

