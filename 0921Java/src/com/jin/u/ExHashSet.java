package com.jin.u;

import java.util.*;

public class ExHashSet {
	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	set.add(new String("김밥풀"));
	set.add("최꾸마");
	set.add(new String("부끄"));
	set.add("이코코");
	
	boolean check = set.add(new String("부끄"));
	System.out.println("중복체크 : " + check);
	
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext()) {
		String name = itr.next();
		System.out.println(name);
	}
	
	
	}
}