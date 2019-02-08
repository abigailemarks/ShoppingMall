import ls.java.menu.LSMenu;

public class Nordstroms extends Store {
	public Nordstroms() {
		super("Nordstroms");
	}
	public void script(Shopper theShopper) {
		double a= theShopper.balance;
		
		System.out.println("hi welcome to nordstroms!! we sell");
		LSMenu myMenu = new LSMenu("Choose one: ");
		Items red= new Items("shoes", 67,"nordstrom");
		Items blue= new Items("jeans", 500,"nordstrom");
		Items head= new Items("headband", 15,"nordstrom");
		Items[] Itemlist= {head, red, blue};
		for (int i = 0; i < Itemlist.length; i++) {
			myMenu.addItem(Itemlist[i].toString()+" " + Itemlist[i].price);
		}
		int answer= myMenu.displayAndChoose();
		System.out.println();
	}
}
