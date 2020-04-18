package replits;

import java.util.Scanner;

public class A85_ShoppingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "", item = "", countinue = "";
		double price = 0, totalPrice = 0;
		int count = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter Item" + i + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			shoppingListReport += "Item" + i + ": " + item + " Price: " + price + ", ";
			System.out.println("Add one more item?");
			countinue = scan.next();
			
			if (countinue.equals("no"))
				break;
		}
		
		int z = shoppingListReport.length();
		System.out.println(shoppingListReport.substring(0, z - 2));
		System.out.println("Total price: " + totalPrice);

	}

}
