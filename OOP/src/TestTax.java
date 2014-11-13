//import com.practicalJava.lesson3.oop.Tax;
import com.practicalJava.lesson3.oop.NJTax;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NJTax t = new NJTax();
		
		t.setGrossIncome(Double.parseDouble(args[0]));
		t.setState(args[1]);
		t.setDependents(Integer.parseInt(args[2]));
		
		double yourTax = t.calcTax();
		
		System.out.println("Your tax is: " + yourTax);

	}

}
