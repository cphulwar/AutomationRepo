package com.cp.autotest;

public class StringOperations {

	public static void main(String[] args) {
		String a = "ChetanManishJagdishUmaPhulwar";
		String c = a.toLowerCase();
		a = a.replace("tan", "tan ");
		a = a.replace("J", " J");
		a = a.replace("Uma", " Uma");
		a = a.replace("Phu", " Phu");
		int b = a.length();
		System.out.println(c.lastIndexOf("u"));
		System.out.println(c.codePointAt(24));

		System.out.println(a.endsWith("r"));
		System.out.println(b);
		System.out.println(a);
	}

}
