package day9;

public class Student2List {
	
	private int id;
	private String name;
	private long phone;
	private String address;
	private String dob;
	private String doj;
	private String email;
	private char gender;
	
	public Student2List(int id, String name, long phone, String address, String dob, String email, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
