package com.yamaha.assignment3.Question2;

public class Invoice implements Payable {
	private String partNum;
	private String partDescription;
	private int quantity;
	private int pricePerItem;
	public Invoice(String partNum, String partDescription, int quantity, int pricePerItem) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(int pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [partNum=").append(partNum).append(", partDescription=").append(partDescription)
				.append(", quantity=").append(quantity).append(", pricePerItem=").append(pricePerItem).append("]");
		return builder.toString();
	}
	
	@Override
	public int salary() {
		return (pricePerItem * quantity);
	}
}