package com.jin.u;

import java.util.*;

public class ExArrayList {

	public static void main(String[] args) {
		List<String> listUpcasting = new ArrayList<String>();

		// ���ʸ� <T>
		//
		ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<>();

		String name = "�̸�";
		list.add("�̸�1");
		list.add(name);
		list.add("�̸�2");
		list.add("�̸�3");
		// list.add(1); //�̰� ����

		String str = "�̸�";

		if (list.contains(str)) {
			System.out.println(str + "�� �����մϴ�.");
		} else {
			System.out.println(str + "�� �������� �ʽ��ϴ�.");
		}

		list.add("�̸��̸�");

		System.out.println("������");
		if (list != null && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				String pname = list.get(i);
				System.out.println(i + "��° ��� : " + pname);
			}
		}
		list.remove("name"); // ù��° ��� ����

		System.out.println("������");
		if (list != null && !list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				String pname = list.get(i);
				System.out.println(i + "��° ��� : " + pname);
			}
		}
		
		List<String> arrL = new ArrayList<String>();
		arrL.add("Test");
		System.out.println(arrL.get(0));

	}

}