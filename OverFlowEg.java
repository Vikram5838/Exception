package exception;

public class OverFlowEg {
	public static void main(String[] args) {
		try {
		OverFlow of=new OverFlow();
		of.add();
	}catch(StackOverflowError e) {
		e.printStackTrace();
	System.out.println("Over Flow");	
	}
		
	}


}
