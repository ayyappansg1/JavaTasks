package day8;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedStudentSet {

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

		Set<Student> s=new LinkedHashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		s.add(s8);
		s.add(s9);
		s.add(s10);
		
		for (Student student : s) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPhone());
			System.out.println(student.getAddress());
			System.out.println(student.getDob());
			System.out.println(student.getEmail());
			System.out.println(student.getGender());
		}
		
		}
}
