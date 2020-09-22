package com.jin.u;

import java.util.Enumeration;
import java.util.Hashtable;

public class ExHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("¹äÇ®", "010-1234-2345");
		table.put("²Ù¸¶", "010-2131-2342");
		table.put("ÄÚÄÚ", "010-1232-3456");
		System.out.println("¹äÇ® : " + table.get("¹äÇ®"));
		
		Enumeration<String> keyEnum = table.keys();
		
		while(keyEnum.hasMoreElements()) {
			String key = keyEnum.nextElement();
			System.out.println(key + " = " + table.get(key));
		}
	}
}
