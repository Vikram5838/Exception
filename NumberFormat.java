package exception;

public class NumberFormat {
	public static void main(String[] args) {
		String val="vikram";
		try {
		int num=Integer.parseInt(val);
		System.out.println(num);
		}catch(NumberFormatException n) {
		//n.printStackTrace();
		System.out.println("Cannot convert String value to Integer");
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
