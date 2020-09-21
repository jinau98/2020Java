
public class Person {
	//¸â¹ö ÇÊµå(¸â¹ö º¯¼ö)
	String name;
	int age;
	char gender;
	String phone;
	
	Person(){}			//default constructor
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Person(String name, int age, char gender, String phone){
		this(name, age);
		
		this.gender = gender;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0||age>120) {
			age =0;
		}
		this.age=age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
