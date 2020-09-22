package com.jin.u;

import java.util.*;

public class ExVector {
	public static void main(String[] args) {

		Vector vec = new Vector();

		Vector<String> vecStr = new Vector<String>();
		vecStr.add("123456");

		vec.add(new String("гоюл"));
		vec.add(182.23);

		for (int i = 0; i < vec.size(); i++) {
			Object obj = vec.get(i);
			System.out.println(obj);
		}
	}
}
