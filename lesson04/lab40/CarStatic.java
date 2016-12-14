package lesson04.lab40;

public class CarStatic {

	static class Tire {
		
		public Tire(double circumference) {
			this.circumferrence = circumference;
		}
		
		private double circumferrence;
	}
	
	double calculateRadius(double circumferrence) {
		return circumferrence / 2 * Math.PI;
	}
	
	static void main(String... args) {
		
		CarStatic car = new CarStatic();
		double radius = car.calculateRadius(17);
		
	}

}

