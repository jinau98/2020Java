package com.jin.u;

import java.util.*;

public class ExVector {
	public static void main(String[] args) {
		
		Vector vec = new Vector();

		//Vector<String> vecStr = new Vector<String>();
		//vecStr.add("123456");

		vec.add(new String("문자"));
		vec.add(182.23);
		vec.add(1234);
		
		for (int i = 0; i < vec.size(); i++) {
			Object obj = vec.get(i);
			System.out.println(obj);
		}
	}
}
