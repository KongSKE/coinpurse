package coinpurse;

/**
 * A main class to create objects and connect objects together. The user
 * interface needs a reference to coin purse.
 * 
 * @author Varit Assavavisidchai
 */
public class Main {
	
	/**
	 * Configure and start the application.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

//		Purse purse = new Purse(3);
//
//		System.out.println(purse.getBalance());
//		System.out.println(purse.count());
//		System.out.println(purse.isFull());
//		System.out.println(purse.insert(new Coin(5)));
//		System.out.println(purse.insert(new Coin(10)));
//		System.out.println(purse.insert(new Coin(0)));
//		System.out.println(purse.insert(new Coin(1)));
//		System.out.println(purse.insert(new Coin(5)));
//		System.out.println(purse.count());
//		System.out.println(purse.isFull());
//		System.out.println(purse.getBalance());
//		System.out.println(purse.toString());
//		System.out.println(purse.withdraw(12));
//		System.out.println(purse.withdraw(11));
		int capacity = 10;
		Purse purse = new Purse(capacity);
		ConsoleDialog consoleDialog = new ConsoleDialog(purse);
		consoleDialog.run();
	}

}
