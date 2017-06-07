package learning2;

public class Fibo {
	public static void Fibonaci(int n) {
		int first = 0;
		int second = 1;
		int temp;
		System.out.print(first + ", " + second + ", ");
		for (int i = 0; i < n; i++) {
			temp = first + second;
			first = second;
			second = temp;

			System.out.print(temp + ", ");
		}
	}

	public static void recursionFeb(int x){
		if(){

		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Fibonaci(7);
	}
}
