package com.jin.u;

import java.util.*;

public class ExHashMap {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("id", "bobpul");
		map.put("name", "김밥풀");
		System.out.println("name = " + map.get("name"));
		map.put("age", 5);
		map.put("phone", "010-1234-2345");
		map.put("name", "최꾸마");
		
		System.out.println("id = " + map.get("id"));
		System.out.println("name = " + map.get("name"));
		System.out.println("age = " + map.get("age"));
		System.out.println("phone = " + map.get("phone"));
		
		System.out.println("---맵에 대한 순차 접근---");
		Set<String> keySet = map.keySet();
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " = " + map.get(key));
		}
		
		if(map.containsKey("name")) {
			System.out.println("name 키 존재");
		}else {
			System.out.println("name 키 안 존재");
		}
		
	}
}
