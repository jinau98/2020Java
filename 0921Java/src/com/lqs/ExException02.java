package com.lqs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExException02 {
	public static void main(String[] args) {
		System.out.println("수 입력(1~5) : ");
		try {
			int x = System.in.read() - 48;

			switch (x) {
			case 1:
				String str = null;
				str.length();
			case 2:
				int xx = 12 / 0;
			case 3:
				throw new FileNotFoundException("파일을 찾을 수 없습니다");
			case 4:
				throw new ClassNotFoundException("해당 클래스가 존재하지 않슺니다.");
			case 5:
				throw new RuntimeException("프로그램 실행 중 에러 발생.");
			case 6:
				throw new BizRuntimeException("비즈니스 로직상에 에러 발생.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("FINALLY");
		}
	}
}