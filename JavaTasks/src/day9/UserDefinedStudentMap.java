package day9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedStudentMap {

	public static void main(String[] args) {

		Student s1=new Student(31,"Ayyappan",8989898989l,"Mannargudi","16/07/1995","ayyappansg1@gmail.com",'m');
		Student s2=new Student(32,"Vinoth",896541681681l,"Mannargudi","16/07/1995","afdgg@gmail.com",'m');
		Student s3=new Student(33,"kumarasean",95959595l,"Mannargudi","16/07/1995","gfgfbb@gmail.com",'m');
		Student s4=new Student(34,"Pavan",89232135132l,"Mannargudi","16/07/1995","yjthdh@gmail.com",'m');
		Student s5=new Student(35,"Balaji",8985135153l,"Mannargudi","16/07/1995","iluyi@gmail.com",'m');
		Student s6=new Student(36,"Bahavan",82135131321l,"Mannargudi","16/07/1995","hyjtyjtyj@gmail.com",'m');
		Student s7=new Student(37,"Sekar",898912442l,"Mannargudi","16/07/1995","hkhjlkil@gmail.com",'m');
		Student s8=new Student(38,"paalpandi",842498989l,"Mannargudi","16/07/1995","lmfjh@gmail.com",'m');
		Student s9=new Student(39,"Rajan",89424989l,"Mannargudi","16/07/1995","whwtjhyj@gmail.com",'m');
		Student s10=new Student(40,"guna",844241898989l,"Mannargudi","16/07/1995","htjhtyk@gmail.com",'m');

		Map<Integer,Student> s=new LinkedHashMap<Integer,Student>();
		s.put(1,s1);
		s.put(2,s2);
		s.put(3,s3);
		s.put(4,s4);
		s.put(5,s5);
		s.put(6,s6);
		s.put(7,s7);
		s.put(8,s8);
		s.put(9,s9);
		s.put(10,s10);
		Set<Entry<Integer, Student>> entrySet = s.entrySet();
		
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println("No"+entry.getKey()+" Student Informations");
			System.out.println("Id Is "+entry.getValue().getId());
			System.out.println("Name is "+entry.getValue().getName());
			System.out.println("Phone number is "+entry.getValue().getPhone());
			System.out.println("Address is "+entry.getValue().getAddress());
			System.out.println("Dob is "+entry.getValue().getDob());
			System.out.println("Email is "+entry.getValue().getEmail());
			System.out.println("Gender is "+entry.getValue().getGender());
			System.out.println("-------------------------------------");
		}
		
		}
}
