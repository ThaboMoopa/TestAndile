import java.io.Serializable;

/*a JavaBean its a reusable software component
*A bean encapsulates many objects into one object, 
*so we can access this object from multiple places
*
*/
public class Manager implements Serializable{//should be Serializable

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private long salary;
	
	//no arguments constructor
	public Manager() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nName=" + name + "\nAge=" + age + "\nSalary=" + salary;
	}
}
