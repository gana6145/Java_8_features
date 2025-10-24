package streamapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EmployeeStreamDriver {

	public static void main(String[] args) {
		Employee e1=new Employee("Ganesh", 22, 19000.24);
		Employee e5=new Employee("Ganesh", 22, 22000.24);
		Employee e2=new Employee("Saurabh", 22, 23000.24);
		Employee e3=new Employee("Pratik", 22, 23000.24);
		Employee e4=new Employee("Om", 22, 23000.24);
		List<Employee> Emp=new ArrayList<>();
		
		Emp.add(e1);
		Emp.add(e2);
		Emp.add(e3);
		Emp.add(e4);
		HashSet<Employee> h1=new HashSet<>(Emp);
		
		h1.stream().filter(emp->emp.sallary>20000).forEach(emp->System.out.println(emp));
		
		

	}

}

class Employee{
	String name;
	int age;
	double sallary;
	public Employee(String name,int age,Double sallary) {
	
		this.name=name;
		this.age=age;
		this.sallary=sallary;
	}
	
	@Override
	public String toString() {
		
		return "[ Name: " +name + " Age:" +age + " Sallary:" +sallary + "]";
	}
}
