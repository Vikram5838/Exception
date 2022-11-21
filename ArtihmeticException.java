package exception;

public class ArtihmeticException {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		
		try {
		int num3=num1/num2;
		}catch(ArithmeticException ee){
			ee.printStackTrace();
			//System.out.println(ee);
		System.out.println("Can't divide any number by zero");
		}
	}

}
