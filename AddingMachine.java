package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history = "0";
	
	public AddingMachine() {
		total = 0;
	}
	
	public int getTotal() {
		return this.total;
	}
	
	public void add(int value) {
		total = total + value;
		history += " + " + value;
	}
	
	public void subtract(int value) {
		total = total - value;
		history += " - " + value;
	}
	
	public String toString() {
		return history;
	}
	
	public void clear() {
		
	}
}
