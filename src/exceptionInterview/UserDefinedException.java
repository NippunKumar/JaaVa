package exceptionInterview;

import java.util.Scanner;

class NotEnoughMoneyException extends ArithmeticException {
	@Override
	public String toString() {
		return "You don't have enough money to do the transaction";
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		int balance = 3000; // Initializ the balance
		Scanner enterMoney = new Scanner(System.in); 
		System.out.println("Enter the Amount");

		int withdrawlMoney = enterMoney.nextInt(); // taking input from the user

		try {

			if (withdrawlMoney > balance) {
				throw new NotEnoughMoneyException();
			} else {
				System.out.println("Transaction Successful");
			}
		} catch (NotEnoughMoneyException ex) {
			// NotEnoughMoneyException will be caught here
			System.out.println(ex);
		}
	}
}
