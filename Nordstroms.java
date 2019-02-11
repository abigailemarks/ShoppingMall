import ls.java.menu.LSMenu;

public class Nordstroms extends Store {
	public Nordstroms() {
		super("Nordstroms");
	}

	public void script(Shopper theShopper) {
		boolean shopping = true;

		System.out.println("hi welcome to nordstroms!! we sell");
		System.out.println("You can also type B to see your balance,");
		System.out.println("or L to list the items you have purchased");
		System.out.println("or E to exit the store");
		while (shopping == true) {
			double a = theShopper.balance;
			LSMenu myMenu = new LSMenu("Choose one: ");
			Items red = new Items("shoes", 67, "nordstrom");
			Items blue = new Items("jeans", 500, "nordstrom");
			Items head = new Items("headband", 15, "nordstrom");
			Items[] Itemlist = { head, red, blue };
			for (int i = 0; i < Itemlist.length; i++) {
				myMenu.addItem(Itemlist[i].toString() + " " + Itemlist[i].price);
			}
			myMenu.addItem("B");
			myMenu.addItem("L");
			myMenu.addItem("E");
			int answer = myMenu.displayAndChoose();
			if (answer == (Itemlist.length + 1)) {
				System.out.println("this is your balance" + theShopper.balance);
			} else if (answer == (Itemlist.length + 2)) {
				System.out.println("this is your purchases" + theShopper.PurchaseList);
			} else if (answer == (Itemlist.length + 3)) {
				System.out.println("thanks for shopping have a nice day");
				shopping = false;
			} else {
				theShopper.balance = a - Itemlist[answer - 1].price;
				System.out.println("this is the new balance " + theShopper.balance);
				System.out.println("You bought a " + Itemlist[answer - 1].toString());
				theShopper.PurchaseList.add(Itemlist[answer - 1]);
			}
		}
	}
}
