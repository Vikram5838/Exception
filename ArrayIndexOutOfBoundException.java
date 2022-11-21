package exception;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		int[] nums= {5,4,3,6};
		try {
		System.out.println(nums[1]);
		}catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("Array psotion is Incorrect");
		}
	}

}
//