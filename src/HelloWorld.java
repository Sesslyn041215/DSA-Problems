
class Student {
    
	String name;
	int id;
	String email;
	String academy;
	static int count = 0;
	
	Student() {
		Student.count = count + 1;
	}

	public String getName() {
	    return name;
	}
	
	public int getId() {
	    return id;
	}
	
	public String getEmail() {
	    return email;
	}
	
	public void setName(String newName) {
	    name = newName;
	}
	
	public void setId(int newId) {
	    id = newId;
	}
	
	public void setEmail(String newEmail) {
	    email = newEmail;
	}

}


public class HelloWorld {
    public static void main(String[] args) {
        
        Student st1 = new Student();
        System.out.println(Student.count);
        Student st2 = new Student();
        System.out.println(Student.count);
        Student st3 = new Student();
        System.out.println(Student.count);
        Student st4 = new Student();
        System.out.println(Student.count);        
        
    }
}
