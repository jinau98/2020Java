package com.jin.u;

import java.util.*;

public class ExHashSet {
	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	set.add(new String("���Ǯ"));
	set.add("�ֲٸ�");
	set.add(new String("�β�"));
	set.add("������");
	
	boolean check = set.add(new String("�β�"));
	System.out.println("�ߺ�üũ : " + check);
	
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext()) {
		String name = itr.next();
		System.out.println(name);
	}
	
	
	}
}
