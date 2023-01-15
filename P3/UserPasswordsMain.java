package hibernate_eb9_3;

import java.util.Scanner;

public class UserPasswordsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
		UserPasswordCRUD1 crud = new UserPasswordCRUD1();
		User_passwords passwords = new User_passwords();
		do {
			System.out.println("enter the option");
			System.out.println("1.sign-in \n2.login \n3.exit");
			int choice1 = scanner.nextInt();
			switch (choice1) {
			case 1: {
				System.out.println("enter the user id");
				int user_id = scanner.nextInt();
				System.out.println("enter the user name");
				String user_name = scanner.next();
				System.out.println("enter the user email id");
				String user_email = scanner.next();
				System.out.println("enter the password");
				String user_password = scanner.next();
				System.out.println("enter the address");
				String user_address = scanner.next();

				passwords.setUser_id(user_id);
				passwords.setUser_name(user_name);
				passwords.setUser_email(user_email);
				passwords.setUser_passwords(user_password);
				passwords.setAddress(user_address);
				passwords.setFacebook_pw("null");
				passwords.setInsta_pw("null");
				passwords.setSnapchat_pw("null");
				passwords.setWhatsapp_pw("null");
				passwords.setTwitter_pw("null");

				crud.saveUserPasswords(passwords);
				break;
			}
			case 2: {
				System.out.println("enter the user name");
				String name = scanner.next();
				System.out.println("enter the user id");
				int id = scanner.nextInt();
				System.out.println("enter the password");
				String password = scanner.next();
				passwords.setUser_name(name);
				passwords.setUser_passwords(password);
				passwords.setUser_id(id);

				boolean loginRes = crud.loginUser(passwords);

				if (loginRes) {
					System.out.println("logged in successfull");

					boolean exitfromlogin = true;
					do {
						System.out.println("enter the choice");
						System.out.println(
								"1.to save the passwords to table \n2.to modify the passwords in table \n3.to veiw your saved passwords \n4.exit");
						int choice2 = scanner.nextInt();
						switch (choice2) {
						case 1: {
							if (crud.checkTable(passwords)) {
								System.out.println("enter new passwords");
								System.out.println("enter the fb pw");
								String facebook_pw = scanner.next();
								System.out.println("enter the ista pw");
								String insta_pw = scanner.next();
								System.out.println("enter the sch pw");
								String snapchat_pw = scanner.next();
								System.out.println("enter the wts pw");
								String whatsapp_pw = scanner.next();
								System.out.println("enter the twt pw");
								String twitter_pw = scanner.next();

								passwords.setUser_id(id);
								passwords.setFacebook_pw(facebook_pw);
								passwords.setSnapchat_pw(snapchat_pw);
								passwords.setInsta_pw(insta_pw);
								passwords.setWhatsapp_pw(whatsapp_pw);
								passwords.setTwitter_pw(twitter_pw);

								crud.saveAllpasswords(passwords);
							} else {
								System.out.println("your already saved some passwords");
							}
							break;
						}
						case 2: {
							if (!crud.checkTable(passwords)) {

								System.out.println("heres your info");
								crud.displaypasswords(passwords);
								System.out.println("enter the option to change");
								int choice3 = scanner.nextInt();
								switch (choice3) {
								case 1: {
									System.out.println("enter new fb password");
									String facebook_pw = scanner.next();

									passwords.setFacebook_pw(facebook_pw);
									crud.updatefbpw(passwords);
									break;
								}
								case 2: {
									System.out.println("enter new insta password");
									String insta_pw = scanner.next();

									passwords.setInsta_pw(insta_pw);
									crud.updateinstpw(passwords);
									break;
								}
								case 3: {
									System.out.println("enter new snpcht password");
									String snapchat_pw = scanner.next();

									passwords.setSnapchat_pw(snapchat_pw);
									crud.updatesnpctpw(passwords);
									break;
								}
								case 4: {
									System.out.println("enter new wtsap password");
									String whatsapp_pw = scanner.next();

									passwords.setWhatsapp_pw(whatsapp_pw);
									crud.updatewhatsapppw(passwords);
									break;
								}
								case 5: {
									System.out.println("enter new twt password");
									String twitter_pw = scanner.next();

									passwords.setTwitter_pw(twitter_pw);
									crud.updatetwtpw(passwords);
									break;
								}
								default:
									System.out.println("Thank you");
									break;
								}
							}

							else {
								System.out.println("first save some passwords");
							}
							break;
						}
						case 3: {
							crud.displaypasswords(passwords);
							break;
						}
						case 4: {
							exitfromlogin = false;
							System.out.println("thank you");
						}
						}
					} while (exitfromlogin);
				} else {
					System.out.println("invalid password");
				}
				break;
			}
			default:
				System.out.println("Thank you");
			}

		} while (exit);
	}
}
