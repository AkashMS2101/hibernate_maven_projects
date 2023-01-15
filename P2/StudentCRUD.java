package hibernate_eb9_2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCRUD {
	// 1.to insert data
	public void saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		System.out.println("Data stored successfully");
	}

	// 2.to update
	public void updateStudent(int id, String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);
		student.setName(name);

		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();

		System.out.println("Updation successfull");
	}

	// 3.to delete
	public void deleteStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);

		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();

		System.out.println("deleted successfull");
	}

	// 4.to fetch
	public void getStudent(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, id);

		System.out.println("here's your details");
		System.out.println(student);
	}
}
