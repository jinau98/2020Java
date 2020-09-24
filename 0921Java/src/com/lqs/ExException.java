package com.lqs;
import java.io.IOException;

public class ExException {
	public static void main(String[] args) {
		try {
			System.out.println(args[0] + "반가워!");
			System.out.println(args[1] + "반가워!");
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
	
		int num=15;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				int x = (int)(Math.random() * 10);
				
				result = num/x;
				System.out.println((i+1) + "회 : " + result);
			} catch (ArithmeticException e) {
				System.out.println("제수는 0이 될 수 없습니다.");
				i--;
			}
		}
		try {
			int x=System.in.read();
			System.out.println(x);
			
		} catch (IOException e) {
			
		}
		
		System.out.println("-------프로그램 정상종료--------");
	}
}
