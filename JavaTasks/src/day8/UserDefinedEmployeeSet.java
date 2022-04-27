package day8;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedEmployeeSet {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("First employee ");
		System.out.println("Enter Employee Id");
		int firstid = s.nextInt();
		System.out.println("Enter Employee name");
		String firstname = s.next();
		System.out.println("Enter Employee Phone");
		long firstphone = s.nextLong();
		System.out.println("Enter Employee address");
		String firstaddress = s.next();
		System.out.println("Enter Employee DOB");
		String firstdob = s.next();
		System.out.println("Enter Employee DOJ");
		String firstdoj = s.next();
		System.out.println("Enter Employee Email");
		String firstEmail = s.next();
		System.out.println("Enter Employee Gender");
		String firstgender = s.next();
		System.out.println("Enter Employee salary");
		Float firstsalary = s.nextFloat();
		System.out.println("-----------------------------");
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Second employee ");
		System.out.println("Enter Employee Id");
		int Secondid = s1.nextInt();
		System.out.println("Enter Employee name");
		String Secondname = s1.next();
		System.out.println("Enter Employee Phone");
		long Secondphone = s1.nextLong();
		System.out.println("Enter Employee address");
		String Secondaddress = s1.next();
		System.out.println("Enter Employee DOB");
		String Seconddob = s1.next();
		System.out.println("Enter Employee DOJ");
		String Seconddoj = s1.next();
		System.out.println("Enter Employee Email");
		String SecondEmail = s1.next();
		System.out.println("Enter Employee Gender");
		String Secondgender = s1.next();
		System.out.println("Enter Employee salary");
		Float Secondsalary = s1.nextFloat();
		System.out.println("-----------------------------");

		Scanner s2=new Scanner(System.in);
		System.out.println("third employee ");
		System.out.println("Enter Employee Id");
		int thirdid = s2.nextInt();
		System.out.println("Enter Employee name");
		String thirdname = s2.next();
		System.out.println("Enter Employee Phone");
		long thirdphone = s2.nextLong();
		System.out.println("Enter Employee address");
		String thirdaddress = s2.next();
		System.out.println("Enter Employee DOB");
		String thirddob = s2.next();
		System.out.println("Enter Employee DOJ");
		String thirddoj = s2.next();
		System.out.println("Enter Employee Email");
		String thirdEmail = s2.next();
		System.out.println("Enter Employee Gender");
		String thirdgender = s2.next();
		System.out.println("Enter Employee salary");
		Float thirdsalary = s2.nextFloat();
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Fourth employee ");
		System.out.println("Enter Employee Id");
		int Fourthid = s3.nextInt();
		System.out.println("Enter Employee name");
		String Fourthname = s3.next();
		System.out.println("Enter Employee Phone");
		long Fourthphone = s3.nextLong();
		System.out.println("Enter Employee address");
		String Fourthaddress = s3.next();
		System.out.println("Enter Employee DOB");
		String Fourthdob = s3.next();
		System.out.println("Enter Employee DOJ");
		String Fourthdoj = s3.next();
		System.out.println("Enter Employee Email");
		String FourthEmail = s3.next();
		System.out.println("Enter Employee Gender");
		String Fourthgender = s3.next();
		System.out.println("Enter Employee salary");
		Float Fourthsalary = s3.nextFloat();
		
		Scanner s4=new Scanner(System.in);
		System.out.println("Fifth employee ");
		System.out.println("Enter Employee Id");
		int Fifthid = s4.nextInt();
		System.out.println("Enter Employee name");
		String Fifthname = s4.next();
		System.out.println("Enter Employee Phone");
		long Fifthphone = s4.nextLong();
		System.out.println("Enter Employee address");
		String Fifthaddress = s4.next();
		System.out.println("Enter Employee DOB");
		String Fifthdob = s4.next();
		System.out.println("Enter Employee DOJ");
		String Fifthdoj = s4.next();
		System.out.println("Enter Employee Email");
		String FifthEmail = s4.next();
		System.out.println("Enter Employee Gender");
		String Fifthgender = s4.next();
		System.out.println("Enter Employee salary");
		Float Fifthsalary = s4.nextFloat();
		
		Scanner s5=new Scanner(System.in);
		System.out.println("sixth employee ");
		System.out.println("Enter Employee Id");
		int sixthid = s5.nextInt();
		System.out.println("Enter Employee name");
		String sixthname = s5.next();
		System.out.println("Enter Employee Phone");
		long sixthphone = s5.nextLong();
		System.out.println("Enter Employee address");
		String sixthaddress = s5.next();
		System.out.println("Enter Employee DOB");
		String sixthdob = s5.next();
		System.out.println("Enter Employee DOJ");
		String sixthdoj = s5.next();
		System.out.println("Enter Employee Email");
		String sixthEmail = s5.next();
		System.out.println("Enter Employee Gender");
		String sixthgender = s5.next();
		System.out.println("Enter Employee salary");
		Float sixthsalary = s5.nextFloat();
		
		System.out.println("--------------------------");
		Scanner s6=new Scanner(System.in);
		System.out.println("Seventh employee ");
		System.out.println("Enter Employee Id");
		int Seventhid = s6.nextInt();
		System.out.println("Enter Employee name");
		String Seventhname = s6.next();
		System.out.println("Enter Employee Phone");
		long Seventhphone = s6.nextLong();
		System.out.println("Enter Employee address");
		String Seventhaddress = s6.next();
		System.out.println("Enter Employee DOB");
		String Seventhdob = s6.next();
		System.out.println("Enter Employee DOJ");
		String Seventhdoj = s6.next();
		System.out.println("Enter Employee Email");
		String SeventhEmail = s6.next();
		System.out.println("Enter Employee Gender");
		String Seventhgender = s6.next();
		System.out.println("Enter Employee salary");
		Float Seventhsalary = s6.nextFloat();
		
		System.out.println("--------------------------");
		Scanner s7=new Scanner(System.in);
		System.out.println("eightth employee ");
		System.out.println("Enter Employee Id");
		int eightthid = s7.nextInt();
		System.out.println("Enter Employee name");
		String eightthname = s7.next();
		System.out.println("Enter Employee Phone");
		long eightthphone = s7.nextLong();
		System.out.println("Enter Employee address");
		String eightthaddress = s7.next();
		System.out.println("Enter Employee DOB");
		String eightthdob = s7.next();
		System.out.println("Enter Employee DOJ");
		String eightthdoj = s7.next();
		System.out.println("Enter Employee Email");
		String eightthEmail = s7.next();
		System.out.println("Enter Employee Gender");
		String eightthgender = s7.next();
		System.out.println("Enter Employee salary");
		Float eightthsalary = s7.nextFloat();
		
		System.out.println("---------------");
		Scanner s8=new Scanner(System.in);
		
		System.out.println("nineth employee ");
		System.out.println("Enter Employee Id");
		int ninethid = s8.nextInt();
		System.out.println("Enter Employee name");
		String ninethname = s8.next();
		System.out.println("Enter Employee Phone");
		long ninethphone = s8.nextLong();
		System.out.println("Enter Employee address");
		String ninethaddress = s8.next();
		System.out.println("Enter Employee DOB");
		String ninethdob = s8.next();
		System.out.println("Enter Employee DOJ");
		String ninethdoj = s8.next();
		System.out.println("Enter Employee Email");
		String ninethEmail = s8.next();
		System.out.println("Enter Employee Gender");
		String ninethgender = s8.next();
		System.out.println("Enter Employee salary");
		Float ninethsalary = s8.nextFloat();
		
		System.out.println("--------------------");
		Scanner s9=new Scanner(System.in);
		
		System.out.println("tenth employee ");
		System.out.println("Enter Employee Id");
		int tenthid = s9.nextInt();
		System.out.println("Enter Employee name");
		String tenthname = s9.next();
		System.out.println("Enter Employee Phone");
		long tenthphone = s9.nextLong();
		System.out.println("Enter Employee address");
		String tenthaddress = s9.next();
		System.out.println("Enter Employee DOB");
		String tenthdob = s9.next();
		System.out.println("Enter Employee DOJ");
		String tenthdoj = s9.next();
		System.out.println("Enter Employee Email");
		String tenthEmail = s9.next();
		System.out.println("Enter Employee Gender");
		String tenthgender = s9.next();
		System.out.println("Enter Employee salary");
		Float tenthsalary = s9.nextFloat();
		
		Employee e1=new Employee(firstid,firstname,firstphone,firstaddress,firstdob,firstdoj,firstEmail,firstgender,firstsalary);
		Employee e2=new Employee(Secondid,Secondname,Secondphone,Secondaddress,Seconddob,Seconddoj,SecondEmail,Secondgender,Secondsalary);
		Employee e3=new Employee(thirdid,thirdname,thirdphone,thirdaddress,thirddob,thirddoj,thirdEmail,thirdgender,firstsalary);
		Employee e4=new Employee(Fourthid,Fourthname,Fourthphone,Fourthaddress,Fourthdob,Fourthdoj,FourthEmail,Fourthgender,Fourthsalary);
		Employee e5=new Employee(Fifthid,Fifthname,Fifthphone,Fifthaddress,Fifthdob,Fifthdoj,FifthEmail,Fifthgender,Fifthsalary);
		Employee e6=new Employee(sixthid,sixthname,sixthphone,sixthaddress,sixthdob,sixthdoj,sixthEmail,sixthgender,sixthsalary);
		Employee e7=new Employee(Seventhid,Seventhname,Seventhphone,Seventhaddress,Seventhdob,Seventhdoj,SeventhEmail,Seventhgender,Seventhsalary);
		Employee e8=new Employee(eightthid,eightthname,eightthphone,eightthaddress,eightthdob,eightthdoj,eightthEmail,eightthgender,eightthsalary);
		Employee e9=new Employee(ninethid,ninethname,ninethphone,ninethaddress,ninethdob,ninethdoj,ninethEmail,ninethgender,ninethsalary);
		Employee e10=new Employee(tenthid,tenthname,tenthphone,tenthaddress,tenthdob,tenthdoj,tenthEmail,tenthgender,tenthsalary);
		
		Set<Employee> lists=new LinkedHashSet<Employee>();
		lists.add(e1);
		lists.add(e2);
		lists.add(e3);
		lists.add(e4);
		lists.add(e5);
		lists.add(e6);
		lists.add(e7);
		lists.add(e8);
		lists.add(e9);
		lists.add(e10);

		for (Employee employee : lists) {
			
			System.out.println("---------------");
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getPhone());
			System.out.println(employee.getAddress());
			System.out.println(employee.getDob());
			System.out.println(employee.getDoj());
			System.out.println(employee.getEmail());
			System.out.println(employee.getGender());
			System.out.println(employee.getSalary());
			System.out.println("--------------------");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
