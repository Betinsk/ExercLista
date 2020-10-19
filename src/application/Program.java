package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee();
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i =1;i<=N;i++) {
			System.out.println("Employee#"+ i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
		 employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println();
		
		System.out.print("Enter the employeee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee test = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(test == null) {
			System.out.println("This id does not exist!");
		}
		else {
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		test.netSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
