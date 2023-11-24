package labs;

public class labs2 {

	public static void main(String[] args) {
		
		Student stu1 = new Student("Janelle", "368969628");
		stu1.setCity("Montreal");
		stu1.setPhone("5141234567");
		stu1.setState("Quebec");
		Student stu2 = new Student("Sylvain", "468431854");
		Student stu3 = new Student("Robert", "978465695");
		
		
		System.out.println(stu1.toString());;
	}

}
