package Day3;

public class exceptionhandling {

	public static void main(String[] args) {
	 String s=null;
		
		try {
			System.out.println(s.length());
			System.out.println("exception handle");
		}
		catch(Exception e) {
			System.out.println("exception was handled");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program Finished......");
		}
		}

	}


