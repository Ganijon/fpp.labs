package lesson04;

public class Local {

	private String name = "Joe";
	
	public void printPair(int x, int y) {
		
		class Pair {
			int first;
			int second;
		
			public Pair() {
				printHello();
			}
		
			public String toString() {
				return "(" + first + "," + second +")";
			}
		}
		
		Pair p = new Pair();
		p.first = x;
		p.second = y;
		
		System.out.println(p);
	}
	
	private void printHello() {
		System.out.println("Hello " + name);
	}
	
	public static void main(String...args){
		new Local().printPair(11, 12);
	}
}
