package com.jin.u;

import java.util.*;

public class ExArrayList {

	public static void main(String[] args) {
		List<String> listUpcasting = new ArrayList<String>();

		// 제너릭 <T>
		//
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<>();

		String name = "이름";
		list.add("이름1");
		list.add(name);
		list.add("이름2");
		list.add("이름3");
		// list.add(1); //이거 오류

		String str = "이름";

		if (list.contains(str)) {
			System.out.println(str + "이 존재합니다.");
		} else {
			System.out.println(str + "이 존재하지 않습니다.");
		}

		list.add("이름이름");

		System.out.println("삭제전");
		if (list != null && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				String pname = list.get(i);
				System.out.println(i + "번째 요소 : " + pname);
			}
		}
		list.remove("name"); // 첫번째 요소 삭제

		System.out.println("삭제후");
		if (list != null && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				String pname = list.get(i);
				System.out.println(i + "번째 요소 : " + pname);
			}
		}
		
		List<String> arrL = new ArrayList<String>();
		arrL.add("Test");
		System.out.println(arrL.get(0));

	}

}