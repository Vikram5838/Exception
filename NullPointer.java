package exception;

public class NullPointer {
	public static void main(String[] args) {
		try {
		String val=null;
		val.length();
		}catch(NullPointerException n) {
			n.printStackTrace();
		System.out.println("Invalid String");
		}
	}

}
