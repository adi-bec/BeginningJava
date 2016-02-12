
public class MathTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1=2.34;
		double num2=1.56;
		p("Max: " + Math.max(num1, num2));
		p("Min: " + Math.min(num1, num2));
		p("Sqrt: " + Math.sqrt(num1));
		p("Power" + Math.pow(num1, num2));
		
	}

	
	static void p(String l) {
		System.out.println(l);
	}

}
