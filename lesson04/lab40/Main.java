package lesson04.lab40;

// Outer class is a member of a package
public class Main {

	static void main () {

		// local inner class declaration
		class Tire {
		
			public  Tire(double c) {
				circumferrence = c;
			}
			
			double circumferrence;
		}	
		
		// local inner class usage
		// has a limited scope
		Tire clt = new Tire(18);
		
		
		// Member inner class usage
		// requires "outerInstance.inner()"
		CarMember.Tire cmt = new CarMember().new Tire(14);
				
		// Static inner class usage 
		// requires "new outerClass.inner()"
		CarStatic.Tire cst = new CarStatic.Tire(15);
		
		
		
	}
}
