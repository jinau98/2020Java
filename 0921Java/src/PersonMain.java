
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name="승관";
		p1.age=23;
		p1.gender='M';
		
		System.out.println("p1 name : " + p1.name);
		System.out.println("p1 age : " + p1.age);
		System.out.println("p1 gender : " + p1.gender);
		System.out.println("p1 phone : " + p1.phone);
		System.out.println();
		
		Person p2 = new Person();
		p2.name = "승희";
		
		System.out.println("p2 name : " + p2.name);
		System.out.println("p2 age : " + p2.age);
		System.out.println("p2 gender : " + p2.gender);
		System.out.println("p2 phone : " + p2.phone);
		System.out.println();
		
		Person p3 = new Person();
		
		p3.setName("아린");
		p3.setAge(20);
		p3.setGender('F');
		p3.setPhone("010-1234-2345");
		System.out.println("name : "+ p3.getName());
		System.out.println("age : " + p3.getAge());
		System.out.println("gender : " + p3.getGender());
		System.out.println("phone : " + p3.getPhone());
		System.out.println();
		
		Person p4 = new Person("이석민", 24, 'M', "010-1997-0218");
		
		System.out.println("name : "+ p4.getName());
		System.out.println("age : " + p4.getAge());
		System.out.println("gender : " + p4.getGender());
		System.out.println("phone : " + p4.getPhone());
	}

}
