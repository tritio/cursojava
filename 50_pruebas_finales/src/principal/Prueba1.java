package principal;

public class Prueba1 {

	public static void main(String[] args) {
		int b = 'f'; // conversión implicita un char es menor que un int
		int a = 3.4f;   // no
		char c = (char)5.7; // conversión explícita, vale para todos excepto para boolean
		int d = 3; byte e = d; // de más a menos no se puede, int es mayor que byte		
		boolean r = false;  int h =(int)r; // boolean no se puede realizar conversión explícita
		String s = "44";
		int x = (int)s; // no se puede convertir de primitivo a objeto ni viceversa. Excepto autoboxing Integer a int, Double a double...
		Integer v = 200; // autoboxing
		int j = v; // ok unboxing
		
		
		
	}

}
