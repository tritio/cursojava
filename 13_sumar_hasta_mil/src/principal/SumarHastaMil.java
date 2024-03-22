package principal;

public class SumarHastaMil {

	public static void main(String[] args) {
		//¿hasta que número tengo que sumar, empezando por 1,
		//para llegar hasta 1000?
		int num = 0;
		int suma = 0;
		do {
			num++;
			suma+=num;
		}while(suma<1000);
		System.out.println("para llegar a 1000 he tenido que sumar hasta " + num);
		
	
	 /* for(num=0; suma<1000;num++) { suma+=num; }
	 * System.out.println("para llegar a 1000 he tenido que sumar hasta " + num);
	 */

	}

}
