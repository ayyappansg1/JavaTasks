package day9;

public class Employee {
	
	private int id;
	private String name;
	private long phone;
	private String address;
	private String dob;
	private String doj;
	private String email;
	private String gender;
	private float salary;
	public Employee(int id, String name, long phone, String address, String dob, String doj, String email, String gender,
			float salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.dob = dob;
		this.doj = doj;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	

}
