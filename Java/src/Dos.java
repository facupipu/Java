// escrinir por consola los numeros del 50 al 100 e informar si es un numero primo, si no, escribir sus divisores.

public class Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] divisores;
		for(int i = 50; i <= 100; i++) {
			divisores = new int[i/2];
			int dindex = 0;
			boolean primo = true;
			for(int j = 2; j<= i/2; j++) {	
				if(i%j == 0) {
					primo = false;
					divisores[dindex] = j;
					dindex ++;
					break;
				}
			}
			if(primo == true) {
				System.out.println(i + " es primo");				
			}
			else {
				for(int k = 0; k <= dindex; k++) {
					System.out.println(divisores[dindex] + " es divisor");
				}
			}

		}
	}

}
