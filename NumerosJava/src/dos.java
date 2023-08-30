public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisores = 0;
		for(int i = 50; i <= 100; i++) {
			divisores = 0;
			boolean primo = true;
			for(int j = 1; j<= i; j++) {	
				if(i % j == 0) {
					divisores += 1;
					if(divisores >= 2 && j < i){
						if(primo)System.out.print( i +" no es primo, divisores: " + j);
						else
							System.out.print( ", "+j );
						primo = false;
											
					}
					
				}
			}
		if(primo) System.out.println(i + " es primo");
		else System.out.println();
		}
	}

}
