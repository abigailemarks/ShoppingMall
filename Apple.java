import ls.java.menu.LSMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Apple extends Store {
	public Apple() {
		super("Apple");
	}

	public void script(Shopper theShopper) {
		boolean shopping = true;
		ArrayList<Items> ReturnList = new ArrayList<Items>();

		System.out.println("hi welcome to apple buy a bunch of stuff !!");
		System.out.println("You can also type B to see your balance,");
		System.out.println("or L to list the items you have purchased");
		System.out.println("or E to exit the store");
		while (shopping == true) {
			LSMenu myMenu = new LSMenu("Choose one: ");
			Items ipod = new Items("ipod", 100, "Apple", true);
			Items ipad = new Items("ipad", 500, "Apple", true);
			Items iphone = new Items("iphone", 800, "Apple", true);
			Items[] Itemlist = { ipod, ipad, iphone };
			for (int i = 0; i < Itemlist.length; i++) {
				myMenu.addItem(Itemlist[i].toString() + " " + Itemlist[i].price);
			}
			myMenu.addItem("B");
			myMenu.addItem("L");
			myMenu.addItem("E");
			myMenu.addItem("return");
			int answer = myMenu.displayAndChoose();
			if (answer == (Itemlist.length + 1)) {
				System.out.println("this is your balance" + theShopper.balance);
			} else if (answer == (Itemlist.length + 2)) {
				System.out.println("this is your purchases" + theShopper.PurchaseList);
			} else if (answer == (Itemlist.length + 3)) {
				System.out.println("thanks for shopping have a nice day");
				shopping = false;
			} else if (answer == (Itemlist.length + 4)) {
				LSMenu returnMenu = new LSMenu("Choose one to return: ");
				for (int j = 0; j < ReturnList.size(); j++) {
					{
						returnMenu.addItem(ReturnList.get(j).toString() +" "+ ReturnList.get(j).price);
					}
				}
				int returnAnswer = returnMenu.displayAndChoose();
				System.out.println("you returned a(n)" + ReturnList.get(returnAnswer-1).toString());
				theShopper.balance = theShopper.balance + ReturnList.get(returnAnswer - 1).price;
				
				for(int k=0;k<theShopper.PurchaseList.size(); k++) {
					if (theShopper.PurchaseList.get(k)==ReturnList.get(returnAnswer - 1)) {
						theShopper.PurchaseList.remove(k);
						break;
					}
					
				}
				ReturnList.remove(returnAnswer - 1);
				
			}

			else {
				theShopper.balance = theShopper.balance - Itemlist[answer - 1].price;
				// System.out.println(theShopper.balance);
				System.out.println("this is the new balance " + theShopper.balance);
				System.out.println("hi");
				System.out.println("You bought a " + Itemlist[answer - 1].toString());
				theShopper.PurchaseList.add(Itemlist[answer - 1]);
				if (Itemlist[answer - 1].returnable == true) {
					ReturnList.add(Itemlist[answer - 1]);
				}
			}
		}
	}
}