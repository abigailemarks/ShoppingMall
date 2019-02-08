import ls.java.menu.LSMenu;

public class Wegmans extends Store{
	public Wegmans() {
		super("Wegmans");
	}
	public void script(Shopper theShopper) {
		double a=theShopper.balance;
		System.out.println("hi welcome to wegmans!! we sell");
		LSMenu myMenu = new LSMenu("Choose one: ");
		Items redapple= new Items("apple", 1,"wegmans");
		Items banana= new Items("banana", .17,"wegmans");
		Items salad= new Items("salad", 8,"wegmans");
		Items[] Itemlist= {redapple, banana, salad};
		for (int i = 0; i < Itemlist.length; i++) {
			myMenu.addItem(Itemlist[i].toString() +" "+ Itemlist[i].price);
		}
		int answer=myMenu.displayAndChoose();
		theShopper.balance=a-Itemlist[answer-1].price;
		//System.out.println(theShopper.balance);
		System.out.println("this is the new balance "+ theShopper.balance);
		System.out.println("hi");
		System.out.println("You bought a "+Itemlist[answer-1].toString());
		theShopper.PurchaseList.add(Itemlist[answer-1]);
	}
}
