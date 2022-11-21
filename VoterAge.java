package exception;

public class VoterAge {
	public static void main(String[] args) throws InValidToVote {
		int age=19;
		if(age<18) {
			throw new InValidToVote("Not a valid age to vote");
		}
		else {
			System.out.println("valid to vote");
		}
	}

}
