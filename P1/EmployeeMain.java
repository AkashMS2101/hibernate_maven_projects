package hibernate_eb9_1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit=true;
		Employee employee = new Employee();
		EmployeeCRUD crud = new EmployeeCRUD();
		do {
		System.out.println("Enter the choice");
		System.out.println("1.to enter the details \n2.to update the details \n3.to delete the details \n4.to view the details \n5.to exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			System.out.println("enter the name");
			String name = scanner.next();
			System.out.println("enter the phone number");
			long phone = scanner.nextLong();
			System.out.println("enter the address");
			String address = scanner.next();
			System.out.println("enter the pincode");
			String pincode = scanner.next();
			
			employee.setId(id);
			employee.setName(name);
			employee.setAddress(address);
			employee.setPincode(pincode);
			employee.setPhone(phone);
			
			crud.saveEmployee(employee);
			break;
		}
		case 2:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			System.out.println("enter the name");
			String name = scanner.next();
			
			employee.setId(id);
			employee.setName(name);
			
			crud.updateEmployee(id, name);
			break;
		}
		case 3:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			crud.deleteEmployee(id);
			break;
		}
		case 4:{
			System.out.println("enter the id");
			int id=scanner.nextInt();
			crud.getEmployee(id);
			break;
		}
		case 5:{
			exit=false;
		}
		}
		}while(exit);
	}
}
