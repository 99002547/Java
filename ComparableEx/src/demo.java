import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Shilpa","Ballari",101);
		Employee emp2=new Employee("Sahana","Bangalore",102);
		Employee emp3=new Employee("Pooja","Mysore",103);
		Employee emp4=new Employee("Aruna","Mumbai",104);
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		System.out.println("Array list before sorting:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		Collections.sort(employeeList);
		System.out.println("After sorting:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

}
