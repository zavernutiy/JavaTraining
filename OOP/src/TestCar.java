//importing package with Car and JamesBondCar classes
import com.practicalJava.lesson3.oop.Car;
import com.practicalJava.lesson3.oop.JamesBondCar;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing 2 instances of the class Car
		Car car1 = new Car();
		Car car2 = new Car();
		JamesBondCar jbCar = new JamesBondCar();
		
		//Setting the color of 2 Car objects
		car1.setColor("blue");
		car2.setColor("red");
		jbCar.submerge();
		
		//Printing the message about painting the cars 
		System.out.println("The cars have been painted");

	}

}
