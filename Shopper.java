import java.util.ArrayList;
import java.util.Scanner;

import ls.java.menu.LSMenu;

public class Shopper {

	String name;
	double balance;
	ArrayList<Items> PurchaseList = new ArrayList<Items>();
	boolean visiting = true;

	public Shopper(String name, double balance, ArrayList<Items> PurchaseList) {
		this.name = name;
		this.balance = balance;
		this.PurchaseList = PurchaseList;
	}

	public void visit(Mall theMall) {

		System.out.println("Welcome to " + theMall.mallname + " Your debit card balance is " + balance);
		System.out.println("Please choose one of the following stores.");
		System.out.println("You can also type B to see your balance,");
		ArrayList<Store> StoreList = new ArrayList<Store>();
		StoreList = theMall.makestores();
		while (visiting == true) {
			
			LSMenu myMenu = new LSMenu("Choose one: ");

			for (int i = 0; i < StoreList.size(); i++) {
				myMenu.addItem(StoreList.get(i).toString());
			}
			myMenu.addItem("B");
			myMenu.addItem("L");
			myMenu.addItem("E");
			int answer = myMenu.displayAndChoose();
			if(answer==StoreList.size()+1) {
				System.out.println("this is your balance" + this.balance);
			}
			else if (answer == (StoreList.size()+ 2)) {
				System.out.println("this is your purchases" + this.PurchaseList);
			}
			else if (answer == (StoreList.size() + 3)) {
				System.out.println("thanks for shopping have a nice day");
				visiting = false;
			} 
			else {
			StoreList.get(answer - 1).script(this);}
		}

		/*
		 * public class Purchase{ ArrayList<Items> PurchaseList=new ArrayList<Items>();
		 * public Purchase(Shopper theShopper) {
		 * 
		 * theShopper.PurchaseList=PurchaseList; }
		 * 
		 * 
		 * public void addPurchase(Items item, ArrayList<Items> PurchaseList) {
		 * PurchaseList.add(item); System.out.println("you bought a " +
		 * item.toString()); }
		 * 
		 * public void displayPurchases(ArrayList<Items> PurchaseList) {
		 * System.out.println(PurchaseList); }
		 */

	}

}
