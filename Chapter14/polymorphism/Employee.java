package polymorphism;

public class Employee extends Human {
	private String department;
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	@Override
	public String getProfile() {
		String profile = "年齢" + this.age + "です。";
		profile += "サラリーマンで部署は" + this.department + "です。";
		return profile;
	}
}
