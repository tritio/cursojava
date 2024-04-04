package principal;

import java.util.HashSet;

class MyNumber {
	private Double num;

	public MyNumber(Double num) {
		super();
		this.num = num;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}
	
}

public class PruebaConjunto2 {

	public static void main(String[] args) {
		HashSet<MyNumber> numeros = new HashSet<MyNumber>();
		numeros.add(new MyNumber(25.7));
		numeros.add(new MyNumber(35.7));
		numeros.add(new MyNumber(45.7));
		
		for(MyNumber n: numeros) {
			n.setNum(n.getNum() + 1);
			System.out.println(n.getNum());
		}
		
		for(MyNumber n: numeros) {
			System.out.println(n.getNum());
		}
	}

}
