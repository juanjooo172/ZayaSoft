import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		/*MODULO1 M = new MODULO1();
		M.imprimeN(10);
		MODULO2 M2 = new MODULO2();
		System.out.println("La Suma : "+M2.suma(5, 7));
		System.out.println("La resta : "+M2.resta(7, 5));
		System.out.println("La Multiplucacion : "+M2.multiplica(5, 7));
		System.out.println("La Division : "+M2.divide(10, 5));*/
		MODULO2 M2 = new MODULO2();
		Scanner numero= new Scanner(System.in);
		int opcion = numero.nextInt();
		
		
		System.out.println("primer numero");
		int x =numero.nextInt();
		
		System.out.println("segundo numero");
		int y =numero.nextInt();
		
		switch(opcion)
	    {
	        case 1:
	            System.out.println(M2.suma(x, y));
	            break;
	        case 2:
	        	System.out.println(M2.resta(x, y));
	            break;
	        case 3:
	        	System.out.println(M2.multiplica(x, y));
	            break;
	        case 4:
	        	System.out.println(M2.divide(x, y));
	           break;
	}
		

}
}
