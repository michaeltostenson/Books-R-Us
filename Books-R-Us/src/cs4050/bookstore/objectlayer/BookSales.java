package cs4050.bookstore.objectlayer;

import java.util.Date;

public class BookSales {
	
	private int book_id;
	private String date;
	private int numSold;
	
	public BookSales(int bookid, int numSold, String date){
		this.book_id = bookid;
		this.numSold = numSold;
		this.date = date;
	}
	
	public int getBookId(){
		return book_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumSold() {
		return numSold;
	}
	public void setNumSold(int numSold) {
		this.numSold = numSold;
	}
	
}