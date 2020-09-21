class Accumulator{				//������ �̸��� �ٸ��� ����
	int total;					
	static int grandTotal;		//static�� �ٰ� �� �ٰ� ���� ���� ������ �ٸ� static�� Ŭ������ �ε��� �� ����
	
	//��� �޼���, �ν��Ͻ� �޼���
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	//Ŭ���� �޼���(static method)
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
