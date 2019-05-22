//importing the necessary 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
Designing an Interface
Purpose of an Interface
Introducing Functional Programming
Defining a Functional Interface
Implementing Functional Interfaces with Lambdas
Applying the Predicate Interface
Implementing Polymorphism
Distinguishing between an Object and a Reference
Casting Object References
Understanding Design Principles
Encapsulating Data 
Creating JavaBeans 
Applying the Is‐a Relationship 
Applying the Has‐a Relationship 
Composing Objects 
Working with Design Patterns
Applying the Singleton Pattern
Creating Immutable Objects
Using the Builder Pattern
Creating Objects with the Factory Pattern
*/
public class Assignment2 {

	public static void main(String[] args) {

		System.out.println("======JavaBean=====");

		// Instantiating the JavaBean class
		Manager objJB = new Manager();

		objJB.setName("Martin Baloyi");
		objJB.setAge(26);
		objJB.setSalary(70000);
		
		System.out.println("Name of the Employee is as follows :"+objJB.getName());
		System.out.println("Age of the Employee is as follows :"+objJB.getAge());
		System.out.println("Salary of the Employee :"+objJB.getSalary());
		System.out.println("==========================");
		//
		LocalDate date = LocalDate.of(2019, 05, 21);

		Savings savings = new Savings("Andile Gumada", "23445657", (date), ""
				+ "42004", "Savings Account", 10000.00,7000.00);
		System.out.println(savings.toString());
		System.out.println("==========================");
		
		Withdrawal withdrawals = new Withdrawal(withdrawals.getAccountHolder(),withdrawals.getAccountNumber(),
				withdrawals.getDateOfOpened(),withdrawals.getBranchCode(),withdrawals.getAccountType(),withdrawals.calBalance(),5000.00);
		 System.out.println(withdrawals.toString());
//		 Withdrawal with = new Withdrawal("Andile Gumada", "23445657",(date),
//		 "42004"," Account", with.calBalance(),7000.00);
		// System.out.println(with.toString());

		Account singleton = Account.getInstance();
		Account singleton1 = Account.getInstance();
		
		System.out.println(singleton.single);
		System.out.println(singleton1.single);
		
		List<Employee> employee = new ArrayList<>();//
		
		//
		employee.add(new Employee("Thobo Moopa", 28, "Devs"));
		employee.add(new Employee("Andile Gumada", 30, "Tests"));
		employee.add(new Employee("Ncebo Mdluli", 58, "ProjectMans"));
		employee.add(new Employee("Lerato Malatsi", 28, "SeniorDevs"));
		// employee.add(new Employee("Thobo Moopa",28,"Devs"));
		// printEmployee1(employee,50);
		printEmployee2(employee, 50);// print employees who are less than
	}

//	private static void printEmployee1(List<Employee> employee, int i) {
//		for(Employee emp : employee)
//				if(emp.getAge() < 50)
//				System.out.println("The employees details are follows :"+emp);	
//	}
	// Method used to get
	private static void printEmployee2(List<Employee> employee, int age) {

		employee.stream().filter(emp -> emp.getAge() < age)//
				.forEach(emp -> System.out.println(emp));
	}
}
