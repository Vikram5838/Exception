package exception;

public class StringIndexoutOfBoundException {
	public static void main(String[] args) {
		String name="vikram";
		try {
		char n=name.charAt(7);
		System.out.println(n);
		}catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
			System.out.println("Invalid index Position");
		}
		System.out.println("Thank You......");
	}

}
