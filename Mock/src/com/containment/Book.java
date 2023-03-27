package com.containment;

public class Book {
	private int bId;
	private String bName;
	private float price;
	Author author;

	public int getBid() {
		return bId;
	}

	public void setBid(int bId) {
		this.bId = bId;
	}

	public String getBname() {
		return bName;
	}

	public void setBname(String bName) {
		this.bName = bName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "Book details:- BookId- " + bId + ", Book name- " + bName + ", Price-" + price;
	}

}
