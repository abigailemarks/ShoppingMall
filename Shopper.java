import ls.java.menu.LSMenu;

public class Shopper {

	String name;
	double balance;
	public Shopper(String name, double balance) {
		this.name=name;
		this.balance=balance;
	}

	public void visit( Mall theMall) {
		System.out.println("Welcome to the Natick Collection.  Your debit card balance is $6000. ");
		System.out.println("Please choose one of the following stores."); 
		System.out.println("You can also type B to see your balance,");	
		System.out.println("or L to list the items you have purchased");
		
		LSMenu myMenu = new LSMenu("Choose one: ");  
		for(int i =0; i<NatickCollection.StoreList.length;i++) {
			myMenu.addItem(NatickCollection.StoreList[i].toString());

		}
		myMenu.displayAndChoose();
	}
}


