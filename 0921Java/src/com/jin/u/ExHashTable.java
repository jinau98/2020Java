package com.jin.u;

import java.util.Enumeration;
import java.util.Hashtable;

public class ExHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("김밥풀", "010-1234-2345");
		table.put("최꾸마", "010-2131-2342");
		table.put("이코코", "010-1232-3456");
		System.out.println("최꾸마 : " + table.get("최꾸마"));
		
		Enumeration<String> keyEnum = table.keys();
		
		while(keyEnum.hasMoreElements()) {
			String key = keyEnum.nextElement();
			System.out.println(key + " = " + table.get(key));
		}
	}
}
