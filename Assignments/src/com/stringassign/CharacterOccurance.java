package com.stringassign;

public class CharacterOccurance {
	public static void main(String[] args) {
		String s = "Java Programming";
		int totalCount = s.length();
		int totalCountaftera = s.replace("a", "").length();
		int count = totalCount - totalCountaftera;
		System.out.println(count);
	}

}
