package Collection;


import java.util.ArrayList;
import java.util.List;

class Students{
	int rollno;
	String name;
    Long phone_number;
    String email;

    public Students(int rollno, String name, Long phone_number, String email) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
}
 // Override toString() for easy printing of object data
    @Override
    public String toString() {
        return "RollNo: " + rollno + ", Name: " + name + 
               ", Phone: " + phone_number + ", Email: " + email;
    }
    

public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
public class Example_Collection {

	public static void main(String[] args) {
		Students s1  = new Students(111, "ABC", 9999999999L, "s1@123gmail.com,");
		Students s2  = new Students(112, "ABC1", 9999999998L, "s2@123gmail.com,");
		Students s3  = new Students(113, "ABC2", 9999999997L, "s3@123gmail.com,");
		
		List<Students> sl = new ArrayList<>();
		
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		System.out.println("Studenty details:- ");
		
		for(Students s: sl) {
			System.out.println(s);
		}


	}

}
