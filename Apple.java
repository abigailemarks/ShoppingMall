import ls.java.menu.LSMenu;
import java.util.Scanner;

public class Apple extends Store {
	public Apple() {
		super("Apple");
	}

	public void script( Shopper theShopper) {
		
		double a= theShopper.balance;
		System.out.println("hi welcome to apple!!");
		System.out.println("hi welcome to apple buy a bunch of stuff !!");
		System.out.println("You can also type B to see your balance,");
		System.out.println("or L to list the items you have purchased");
		System.out.println("or E to exit the store");

		System.out.println("hi welcome to nordstroms!! we sell");
		LSMenu myMenu = new LSMenu("Choose one: ");
		Items ipod = new Items("ipod", 100);
		Items ipad = new Items("ipad", 500);
		Items iphone = new Items("iphone", 800);
		Items[] Itemlist = { ipod, ipad, iphone };
		for (int i = 0; i < Itemlist.length; i++) {
			myMenu.addItem(Itemlist[i].toString() + " "+ Itemlist[i].price);
		}
		int answer=myMenu.displayAndChoose();
		theShopper.balance=a-Itemlist[answer-1].price;
		System.out.println("this is the new balance "+ theShopper.balance);
		Purchase(theShopper) =new Purchase();
		Purchase.addPurchase(Itemlist[answer-1]);
	}
}