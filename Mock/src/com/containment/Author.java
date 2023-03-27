package com.containment;

public class Author {
	private int aid;
	private String aname;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return aname;
	}

	public void setName(String aname) {
		this.aname = aname;
	}

	public String toString() {
		return "Author id= " + aid + ", Author name- " + aname;
	}

}
