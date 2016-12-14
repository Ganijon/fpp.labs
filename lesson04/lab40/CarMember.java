package lesson04.lab40;

public class CarMember {

	class Tire {
		
		public Tire(double circumference) {
			this.circumferrence = circumference;
		}
		
		private double circumferrence;
	}
	
	double calculateRadius(double circumferrence) {
		return circumferrence / 2 * Math.PI;
	}
}
