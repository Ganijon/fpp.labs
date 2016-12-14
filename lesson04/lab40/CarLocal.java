package lesson04.lab40;

public class CarLocal {

	double calculateRadius(double circumferrence) {
		return circumferrence / 2 * Math.PI;
	}
	
	static void main() {
		
		class Tire {
		
			public  Tire(double c) {
				circumferrence = c;
			}
			
			double circumferrence;
		}	
		
		Tire clt = new Tire(18);
	}
}