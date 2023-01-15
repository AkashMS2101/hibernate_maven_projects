package hibernate_eb9_2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit=true;
		do {
		System.out.println("Enter the choice");
		System.out.println("1.to enter the details \n2.to update the details \n3.to delete the details \n4.to view the details \n5.to exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:{
			System.out.println("enter the student id");
			int id=scanner.nextInt();
			System.out.println("enter the name");
			String name = scanner.next();
			System.out.println("enter the father's name");
			String fatherName = scanner.next();
			System.out.println("enter the mother's name");
			String motherName = scanner.next();
			System.out.println("enter the student's address");
			String address = scanner.next();
			System.out.println("enter the marks");
			int marks = scanner.nextInt();
			System.out.println("enter the percentage");
			double percentage = scanner.nextDouble();
			
			StudentCRUD crud = new StudentCRUD();
			Student student = new Student();
			student.setAddress(address);
			student.setFatherName(fatherName);
			student.setId(id);
			student.setMotherName(motherName);
			student.setName(name);
			student.setPercentage(percentage);
			student.setTotalMarks(marks);
			
			crud.saveStudent(student);
			break;
		}
		case 2:{
			System.out.println("enter the student id");
			int id = scanner.nextInt();
			System.out.println("enter the student's new name");
			String name = scanner.next();
			StudentCRUD crud = new StudentCRUD();
			crud.updateStudent(id, name);
			break;
		}
		case 3:{
			System.out.println("enter the id to delete");
			int id =scanner.nextInt();
			StudentCRUD crud = new StudentCRUD();
			crud.deleteStudent(id);
			break;
		}
		case 4:{
			System.out.println("enter the id to get the data");
			int id = scanner.nextInt();
			StudentCRUD crud = new StudentCRUD();
			crud.getStudent(id);
			break;
		}
			
			case 5:{
				exit = false;
			}
		default:
			System.out.println("thank you");
		}
		}while(exit);
	}
}
