package EstructurasDeControl;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 50;
		int b = 50;
		int c = 10;
		
		
		if (a<b && b<c ) {
			System.out.println("el mayor es c." );
		} else if(a<b && b>c) {
			
			System.out.println("el mayor es b ");
		}else {
			System.out.println("el mayor es a ");
		}
		

	}

}
