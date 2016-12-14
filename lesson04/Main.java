package lesson04;

public class Main {

	public static void main(String...args){
		
		Member m = new Member();
		
		Member.Pair mp = m.new Pair();

		mp.first = 6;
		mp.second = 7;
		
		m.printHello();
		
 		Static.Pair pair = new Static.Pair();
	}
}
