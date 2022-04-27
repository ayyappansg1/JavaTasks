package day9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedEmployeeMap {

	public static void main(String[] args) {

		Employee e1=new Employee(31,"Ayyappan",8989898989l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e2=new Employee(32,"Vinoth",896541681681l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e3=new Employee(33,"kumaraeean",95959595l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e4=new Employee(34,"Pavan",89232135132l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e5=new Employee(35,"Balaji",8985135153l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e6=new Employee(36,"Bahavan",82135131321l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e7=new Employee(37,"eekar",898912442l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e8=new Employee(38,"paalpandi",842498989l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e9=new Employee(39,"Rajan",89424989l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);
		Employee e10=new Employee(40,"guna",844241898989l,"Mannargudi","16/07/1995","16/07/2022","ayyappaneg1@gmail.com","male",15000.22f);

		Map<Integer,Employee> e=new LinkedHashMap<Integer,Employee>();
		e.put(1,e1);
		e.put(2,e2);
		e.put(3,e3);
		e.put(4,e4);
		e.put(5,e5);
		e.put(6,e6);
		e.put(7,e7);
		e.put(8,e8);
		e.put(9,e9);
		e.put(10,e10);
		Set<Entry<Integer, Employee>> entrySet = e.entrySet();
		
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println("No"+entry.getKey()+" Employee Informations");
			System.out.println("Id Is "+entry.getValue().getId());
			System.out.println("Name is "+entry.getValue().getName());
			System.out.println("Phone number is "+entry.getValue().getPhone());
			System.out.println("Address is "+entry.getValue().getAddress());
			System.out.println("Dob is "+entry.getValue().getDob());
			System.out.println("DOJ is "+entry.getValue().getDoj());
			System.out.println("Email is "+entry.getValue().getEmail());
			System.out.println("Gender is "+entry.getValue().getGender());
			System.out.println("Salary is "+entry.getValue().getSalary());
			System.out.println("-------------------------------------");
		}
		
		}
}
