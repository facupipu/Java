import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		boolean primo;
		do {
			System.out.print("Ingrese un primo mayor a 100: ");
			numero = scanner.nextInt();
			
			primo = true;
			for(int i = 2; i <= numero/2; i++) {
				if(numero % i == 0) {
					primo = false;
					break;
				}
			}
			
			if(numero > 100 && primo) {
				System.out.println("El numero ingresado es valido!");
			}
			else {
				System.out.println("El numero ingresado no es valido, intente otro");
			}
		} while (numero <= 100 || !primo);
		
		scanner.close();
	}

}