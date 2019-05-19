package com.cp.autotest;

import java.util.Hashtable;

public class HashtableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Jan");
		ht.put(12, "Dec");
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
	}

}
