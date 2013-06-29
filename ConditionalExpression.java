public class ConditionalExpression {
	public static void main(String[] args) {
		int number1 = (int)Math.random() * 100;
		int number2 = (int)Math.random() * 100;
		
		// boolean-expression ? expression1 : expression2;
		int max = (number1 > number2) ? number1 : number2;
		System.out.println("Between " + number1 + " and " + number2 + 
				". The greatest is: " + max);
	}
}