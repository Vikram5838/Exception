package exception;

public class NestedCatch {
	public static void main(String[] args) {
		try {
		String[] vals= {"vikram","Raj","vinoth"};
		System.out.println(vals[1]);
		System.out.println(vals[1].charAt(20));
		int num=Integer.parseInt(vals[1]);
		System.out.println(num);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println(s);
			
		}
		catch(NumberFormatException n) {
			System.out.println(n);
		}
		/*catch(Exception e) {
			System.out.println(e);
		}*/
	}

}
