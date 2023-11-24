package labs;

public class Student {
	private static int iD = 1000;
	private String name;
	private String userId;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String[] courses;
	private double debt;
	Student(String name, String SSN){
		this.name = name;
		this.ssn = SSN;
		iD++;
		setEmailID();
		setUserId();
	}
	private void setEmailID(){
		this.email = name.toLowerCase()+ "."+ iD + "@jasonuniversity.com";
		
	}
	private void setUserId() {
		int random = (int)(Math.random() * 10000);
		this.userId = iD + "" + random + ssn.substring(5); 
	}
	public void enroll(String[] courses) {
		this.courses = courses;
	}
	public void pay(double amount) {
		this.debt = this.debt - amount;
	}
	public double checkBalance() {
		return debt;
	}
	public String toString() {
		return "[Name: " + name + "\nEmail: " + email + "\nPhone: " + phone + "\nCity: "+city+ "\nState: "+state;
		
	}
	public String[] showCourses() {
		return courses;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
