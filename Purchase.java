import java.util.ArrayList;

public class Purchase extends Shopper {

	public Purchase(String name, double balance, ArrayList<Items> PurchaseList) {
		super(name, balance, PurchaseList);
	}


	public  void addPurchase(Items item) {
		PurchaseList.add(item);
		System.out.println("you bought a " + item.toString());
	}

	public void displayPurchases() {
		System.out.println(PurchaseList);
	}
}
