package HashSet;

public class CollegeStudent extends Student{
	
   
	private int year;
	private String major;
	
	  
    public CollegeStudent(String name,int age, char gender,long idNumber, double cgpa, int year, String major){
      super(name, gender,age, idNumber, cgpa);
      this.year =year;
      this.major = major;
    }
    
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "CollegeStudent [year=" + year + ", major=" + major + "]";
	}
}