package HashSet;

public class Student {

	private String name;
	private char gender;
	private int age;
	private long idNumber;
	private double cgpa;

	public Student(String name, char gender, int age, long idNumber, double cgpa) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.idNumber = idNumber;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", idNumber=" + idNumber + ", cgpa="
				+ cgpa + "]";
	}
}
