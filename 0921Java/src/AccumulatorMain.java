class Accumulator{				//파일의 이름과 다른게 좋음
	int total;					
	static int grandTotal;		//static이 붙고 안 붙고에 따라 생성 시점이 다름 static은 클래스가 로딩될 때 생성
	
	//멤버 메서드, 인스턴스 메서드
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//클래식 메서드(static method)
	static int getGrandTotal() {
		return grandTotal;
	}
}
public class AccumulatorMain {
	public static void main(String[] args) {
		System.out.println(Accumulator.getGrandTotal());
		
		Accumulator acc1 = new Accumulator();
		Accumulator acc2 = new Accumulator();
		
		acc1.accumulate(100);
		acc2.accumulate(250);
		
		System.out.println("acc1.total : " + acc1.total);
		System.out.println("acc1.grandTotal : " + Accumulator.grandTotal);
		
		System.out.println("acc2.total : " + acc2.total);
		System.out.println("acc2.grandTotal : " + Accumulator.grandTotal);
	}
}