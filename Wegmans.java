import ls.java.menu.LSMenu;

public class Wegmans extends Store{
	public Wegmans() {
		super("Wegmans");
	}
	public void script(Shopper theShopper) {
		System.out.println("hi welcome to wegmans!! we sell");
		LSMenu myMenu = new LSMenu("Choose one: ");
		Items redapple= new Items("apple", 1);
		Items banana= new Items("banana", .17);
		Items salad= new Items("salad", 8);
		Items[] Itemlist= {redapple, banana, salad};
		for (int i = 0; i < Itemlist.length; i++) {
			myMenu.addItem(Itemlist[i].toString() +" "+ Itemlist[i].price);
		}
		myMenu.displayAndChoose();
	}
}
