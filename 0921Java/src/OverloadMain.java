class Calculator{
	int plus(int x, int y) {
		return x+y;
	}
	
	int plus(int x, int y, int z) {
		return x+y+z;
	}
	float plus(float x, float y) {
		return x+y;
	}
	
	int minus(int x, int y) {
		return x-y;
	}
	
	int multiple(int x, int y) {
		return x*y;
	}
	int divide(int x, int y) {
		return x/y;
	}
}

public class OverloadMain {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		Calculator calc = new Calculator();
		int c = calc.plus(a, b);
		System.out.println("c : " + c);
		
		float x = 3.14f;
		float y = 1.25f;
		float z = calc.plus(x, y);
		System.out.println("z : " + z);
	}
}
