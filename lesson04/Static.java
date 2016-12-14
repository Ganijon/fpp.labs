package lesson04;

public class Static {

	private String name = "Joe";
	private Pair pair = new Pair();
	
	{
		pair.first = 4;
		pair.second = 5;
		System.out.println(pair);
	}
	
	public void printHello(){
		System.out.println("Hello " + name);
	}
	
	static class Pair{
		int first;
		int second;
		
		public Pair(){
			//printHello();
		}
		public String toString(){
			return "(" + first + "," + second +")";
		}
	}
	
	
	
	public static void main(String...args){
		new Static().printHello();
	}
}
