package exceptionInterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutResource {
	public static void main(String[] args) {

		BufferedReader br = null;
		int i=0;
		String line;
		  int active = Thread.activeCount();
	        System.out.println("currently active threads: " + active);
	        Thread all[] = new Thread[active];
	        Thread.enumerate(all);

	        for (int j = 0; j < active; j++) {
	           System.out.println(j + ": " + all[j]);
	        }
		try {
			
			while(i<10000){
			br = new BufferedReader(new FileReader("testing.txt"));
			i++;
		}
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
/*			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}*/
		}
		
		

		System.out.println("currently active threads: " + active);
       
        Thread.enumerate(all);

        for (int j = 0; j < active; j++) {
           System.out.println(j + ": " + all[j]);
        }}

}
