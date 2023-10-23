package EstructurasDeControl;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introuce una nota");
		int nota = 5;
		Scanner sc = new Scanner(System.in);
		nota = sc.nextInt();
		
		switch (nota) {
		case 1:
			System.out.println("tu nota es " + "muy mala pisha");
			break;
		case 2:
			System.out.println("tu nota es "  + "es malisima");
			break;
		case 3:
			System.out.println("tu nota es " +  "debes mejorar");
			break;
		case 4:
			System.out.println("tu nota es " +  "progresando");
			break;
		case 5:
			System.out.println("tu nota es " + "te salvas");
			break;
		case 6:
			System.out.println("tu nota es " + "esta bien");
			break;
		case 7:
			System.out.println("tu nota es " +  "que bien");
			break;
		case 8:
			System.out.println("tu nota es "  + "muy bien");
			break;
		case 9:
			System.out.println("tu nota es "  + "genial");
			break;
		case 10:System.out.println("tu nota es " + "eres un manikaaa");
		break;
			default: System.out.println("aonde vas loco si solo hay hasta 10");

		}
	}
}
