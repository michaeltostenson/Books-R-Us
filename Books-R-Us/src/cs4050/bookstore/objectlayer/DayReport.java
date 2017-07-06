package cs4050.bookstore.objectlayer;


public class DayReport {
	private String date;
	
	private double cashIn;//  mostly symbolic, I might be able to script something that "adds cash" to the store when a held 
	private double cashOut;// book reaches it's final hold date and just assuming the customer "came into the store" and bought it
	
	private double cardIn;// also something scriptable with a few of our buttons. Admin clicking on low inventory could click
	private double cardOut;// on Order to "purchase" books and online purchases will go to cardInTotal obviously 
	
	private double netTotal;
	
	public DayReport(double cashIn, double cashOut, double cardIn, double cardOut, String date){
		this.cashIn = cashIn;
		this.cashOut = cashOut;
		this.cardIn = cardIn;
		this.cardOut = cardOut;
		netTotal = (cashIn + cardIn) - (cashOut + cardOut);
		
		this.date = date;
	}

	public double getCashIn() {
		return cashIn;
	}

	public void setCashIn(double cashIn) {
		this.cashIn = cashIn;
	}

	public double getCashOut() {
		return cashOut;
	}

	public void setCashOut(double cashOut) {
		this.cashOut = cashOut;
	}

	public double getCardIn() {
		return cardIn;
	}

	public void setCardIn(double cardIn) {
		this.cardIn = cardIn;
	}

	public double getCardOut() {
		return cardOut;
	}

	public void setCardOut(double cardOut) {
		this.cardOut = cardOut;
	}

	public double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}
	
	
}