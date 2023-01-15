package hibernate_eb9_3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserPasswordCRUD1 {
	// 1.signup / insert into db
	public void saveUserPasswords(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(passwords);
		entityTransaction.commit();

		System.out.println("Data stored successfully");
	}

	// 2.login
	public boolean loginUser(User_passwords passwords1) {
		boolean res = false;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User_passwords passwords = entityManager.find(User_passwords.class, passwords1.getUser_id());
		entityTransaction.begin();
		if (passwords.getUser_passwords().equals(passwords1.getUser_passwords())) {
			res = true;
		}
		entityTransaction.commit();
		return res;
	}

	// 3.to check the table
	public boolean checkTable(User_passwords passwords1) {
		boolean res = false;
		;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User_passwords passwords = entityManager.find(User_passwords.class, passwords1.getUser_id());
		entityTransaction.begin();

		if (passwords.getFacebook_pw().equals("null")) {
			res = true;
		}
		entityTransaction.commit();

		return res;
	}

	// 4.to save all passwords
	public void saveAllpasswords(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}

	// 5.to get all data
	public void displaypasswords(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User_passwords passwords1 = entityManager.find(User_passwords.class, passwords.getUser_id());
		System.out.println(passwords1);
	}

	// 5.to update fb password
	public void updatefbpw(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}

	// 6.to update insta password
	public void updateinstpw(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}

	// 7.to update fb password
	public void updatesnpctpw(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}

	// 8.to update fb password
	public void updatewhatsapppw(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}

	// 9.to update fb password
	public void updatetwtpw(User_passwords passwords) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(passwords);
		entityTransaction.commit();
		System.out.println("Passwords are saved");
	}
}
