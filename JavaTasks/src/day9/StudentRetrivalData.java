package day9;

import java.util.ArrayList;
import java.util.List;

public class StudentRetrivalData {

	public static void main(String[] args) {


		Student2List std1=new Student2List(20, "Ayyappan", 8903276015l, "mannargudi", "16/07/1995", "ayyappan@gmail.com", 'm');
		Student2List std2=new Student2List(21, "Deepak", 9595959595l, "chennai", "16/07/1994",  "deepak@gmail.com",'m');
		Student2List std3=new Student2List(22, "jegan", 959595959l, "chennai", "16/07/1994", "jegan@gmail.com", 'm');
		Student2List std4=new Student2List(23, "karthi", 8959595959l, "pudukottai", "16/07/1995", "karthi@gmail.com", 'm');
		Student2List std5=new Student2List(24, "viswanathan", 9159318181l, "ekkal", "16/07/1994","visu@gmail.com", 'm');
		Student2List std6=new Student2List(25, "ezhilselvan", 968835565l, "ammapettai", "16/07/1995", "ezhilmania@gmail.com",'m');
		Student2List std7=new Student2List(26, "gokul", 9159318181l, "mannargudi", "16/07/1995", "gokul@gmail.com", 'm');
		Student2List std8=new Student2List(27, "naren", 8903276015l, "mannargudi", "16/07/1994", "naren@gmail.com", 'm');
		Student2List std9=new Student2List(28, "vengat", 8903276015l, "koradacheri", "16/07/1995", "vengat@gmail.com",'m');
		Student2List std10=new Student2List(29, "gunase", 8903276015l, "mannargudi", "16/07/1995", "gunase@gmail.com", 'm');

		List<Student2List> studentlist=new ArrayList<Student2List>();
		studentlist.add(std1);
		studentlist.add(std2);
		studentlist.add(std3);
		studentlist.add(std4);
		studentlist.add(std5);
		studentlist.add(std6);
		studentlist.add(std7);
		studentlist.add(std8);
		studentlist.add(std9);
		studentlist.add(std10);
		
		//Address of particular student
		for (Student2List student : studentlist) {
			if(student.getName().equalsIgnoreCase("KARTHI")) {
				System.out.println("Student address is "+student.getAddress());
			}
		}
	}
}

