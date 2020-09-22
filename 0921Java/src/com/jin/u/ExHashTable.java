package com.jin.u;

import java.util.Enumeration;
import java.util.Hashtable;

public class ExHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("��Ǯ", "010-1234-2345");
		table.put("�ٸ�", "010-2131-2342");
		table.put("����", "010-1232-3456");
		System.out.println("��Ǯ : " + table.get("��Ǯ"));
		
		Enumeration<String> keyEnum = table.keys();
		
		while(keyEnum.hasMoreElements()) {
			String key = keyEnum.nextElement();
			System.out.println(key + " = " + table.get(key));
		}
	}
}
