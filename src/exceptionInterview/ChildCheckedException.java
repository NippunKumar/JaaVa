package exceptionInterview;

import java.io.IOException;

class BaseClass{
	void Walk(){
		System.out.println("Walking...");
	}
}

public class ChildCheckedException extends BaseClass {
	void Walk() throws IOException{      // IOException is checked 
		System.out.println("Walking Fast...");
		
	}
	public static void main(String[] args) {
		ChildCheckedException cce = new ChildCheckedException();
		try {
			cce.Walk();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
