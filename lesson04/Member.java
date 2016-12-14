package lesson04;

public class Member {

	private String name = "Joe";
	private Pair pair;
	
	{
		pair = new Pair();
		pair.first = 4;
		pair.second = 5;
		System.out.println(pair);
	}
	
	public void printHello(){
		System.out.println("Hello " + name);
	}
	
	public class Pair {
		static final int number = 5;
		int first;
		int second;
		

		public Pair(){
			printHello();
		}
		public String toString(){
			return "(" + first + "," + second +")";
		}
	}
	
	
	
	public static void main(String...args){
		new Member();
		//Pair pair = new Pair();
	}
	
}
