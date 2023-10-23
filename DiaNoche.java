package EstructurasDeControl;
	
		import java.util.Scanner;

		public class DiaNoche {
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
				System.out.println("introzca una hora: ");
				int hora = 0;
				Scanner sc = new Scanner (System.in);
				hora = sc.nextInt();
				
				if (hora ==21 || hora==22 || hora==23 || hora==0 || hora==1 || hora==2 || hora==3 || hora==4 || hora==5 || hora==6)	{
					System.out.println("es de noche");	
				}
				else if (hora==7 || hora==8 || hora==9 || hora==10 || hora ==11) {
					System.out.println("es por la mañana");			
				}
				else if (hora==12 || hora==13 || hora==14 || hora==15 || hora==16) {
					System.out.println("es mediodia");
				}
				else {
					System.out.println("es por la tarde");
				}
			}
		}

				
