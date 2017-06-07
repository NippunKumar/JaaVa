package exceptionInterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Painting.jpg"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} 

		catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
