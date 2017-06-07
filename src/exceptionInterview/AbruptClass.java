package exceptionInterview;

public class AbruptClass {
    public static void main(String a[]) throws ArithmeticException{
        for(int i=3;i>=0;i--){
            System.out.println(10/i);
        }
        System.out.println("This line does not gonna print");
    }
}
