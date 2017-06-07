package exceptionInterview;

import java.io.FileNotFoundException;
import java.io.IOException;

class SuperClass {
	public void OpenFile() throws FileNotFoundException {
		System.out.println("In Super Class");
		//throw new ArrayIndexOutOfBoundsException(" Start Faliour");
		
	}
}
public class ChildBroderExceptionError extends SuperClass {
	public void OpenFile() throws IOException {
		System.out.println("Sub Class");
		// throw new RuntimeException("Notable to open file");
	}

	public static void main(String[] args) {
		SuperClass cce = new ChildBroderExceptionError();
		try {
			cce.OpenFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
