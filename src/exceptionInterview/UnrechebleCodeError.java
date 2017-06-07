package exceptionInterview;

public class UnrechebleCodeError {
	public static void main (String ...arg){
		try{
			float x = Float.valueOf("aa");
			System.out.println(x);
		}
		catch(Exception e){
			e.getMessage();
		}
		catch (NullPointerException e) {  // this is an example of unreachable code 
									      //NullPointerException. It is already handled by the catch block for Exception
			e.getMessage();
			System.out.println("x is not initialised ");
			
		}
		finally{
			System.out.println("chuck de futtia");
		}
	}
}
