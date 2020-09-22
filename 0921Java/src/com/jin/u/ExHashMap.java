package com.jin.u;

import java.util.*;

public class ExHashMap {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "bobpul");
		map.put("name", "���Ǯ");
		System.out.println("name = " + map.get("name"));
		map.put("age", 5);
		map.put("phone", "010-1234-2345");
		map.put("name", "�ֲٸ�");
		
		System.out.println("id = " + map.get("id"));
		System.out.println("name = " + map.get("name"));
		System.out.println("age = " + map.get("age"));
		System.out.println("phone = " + map.get("phone"));
		
		System.out.println("---�ʿ� ���� ���� ����---");
		Set<String> keySet = map.keySet();
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " = " + map.get(key));
		}
		
		if(map.containsKey("name")) {
			System.out.println("name Ű ����");
		}else {
			System.out.println("name Ű �� ����");
		}
		
	}
}
