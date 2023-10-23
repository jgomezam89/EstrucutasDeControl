package EstructurasDeControl;

import java.util.Scanner;

public class cinebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce un numero");
		Scanner sc = new Scanner(System.in);
		int totalepisodios = sc.nextInt();
		
		
		
		if (totalepisodios ==1) {
			System.out.println("es una pelicula");
		} else if (totalepisodios<=5){
			System.out.println("es una miniserie");
		} else {
			System.out.println("es una serie");
		}
		

	}

}
