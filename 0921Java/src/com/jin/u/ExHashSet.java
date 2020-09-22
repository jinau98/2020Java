package com.jin.u;

import java.util.*;

public class ExHashSet {
	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	set.add(new String("±è¹äÇ®"));
	set.add("ÃÖ²Ù¸¶");
	set.add(new String("ºÎ²ô"));
	set.add("ÀÌÄÚÄÚ");
	
	boolean check = set.add(new String("ºÎ²ô"));
	System.out.println("Áßº¹Ã¼Å© : " + check);
	
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext()) {
		String name = itr.next();
		System.out.println(name);
	}
	
	
	}
}
