package exception;

public class Flipkart {
	public static void main(String[] args) throws ProductNotFoundException {
		int price=10000;
		try {
		if(price<=10000) {
			throw new ProductNotFoundException("Less Than 10000 product not available");
		}
		else {
			System.out.println("Product List");
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("Invalid Data");
	}
		
	}
}
