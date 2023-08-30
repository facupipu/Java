import java.util.Scanner;

public class cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numeroA = 0;
		int numeroB = 0;
		int result = 0;
		char operacion = ' ';
		
		System.out.println("Ingrese su operacion, utilizando dos numeros y alguno de los siguientes operadores: +, -, /, * ");
		numeroA = scanner.nextInt();
		operacion = scanner.next().charAt(0);
		numeroB = scanner.nextInt();
		
		if(operacion == '+') {result = numeroA + numeroB;}
		else if(operacion == '-') {result = numeroA - numeroB;}
		else if(operacion == '*') {result = numeroA * numeroB;}
		else if(operacion == '/') {result = numeroA / numeroB;}
		
		System.out.println(numeroA + " " + operacion + " " + numeroB + " = " + result);
		
		scanner.close();
	}

}