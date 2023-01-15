package hibernate_eb9_3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_passwords {
	@Id
	int user_id;
	String user_name;
	String user_email;
	String user_passwords;
	String address;
	String facebook_pw;
	String insta_pw;
	String snapchat_pw;
	String whatsapp_pw;

	@Override
	public String toString() {
		return "User_passwords [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_passwords=" + user_passwords + ", address=" + address + ", facebook_pw=" + facebook_pw
				+ ", insta_pw=" + insta_pw + ", snapchat_pw=" + snapchat_pw + ", whatsapp_pw=" + whatsapp_pw
				+ ", twitter_pw=" + twitter_pw + "]";
	}

	String twitter_pw;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_passwords() {
		return user_passwords;
	}

	public void setUser_passwords(String user_passwords) {
		this.user_passwords = user_passwords;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook_pw() {
		return facebook_pw;
	}

	public void setFacebook_pw(String facebook_pw) {
		this.facebook_pw = facebook_pw;
	}

	public String getInsta_pw() {
		return insta_pw;
	}

	public void setInsta_pw(String insta_pw) {
		this.insta_pw = insta_pw;
	}

	public String getSnapchat_pw() {
		return snapchat_pw;
	}

	public void setSnapchat_pw(String snapchat_pw) {
		this.snapchat_pw = snapchat_pw;
	}

	public String getWhatsapp_pw() {
		return whatsapp_pw;
	}

	public void setWhatsapp_pw(String whatsapp_pw) {
		this.whatsapp_pw = whatsapp_pw;
	}

	public String getTwitter_pw() {
		return twitter_pw;
	}

	public void setTwitter_pw(String twitter_pw) {
		this.twitter_pw = twitter_pw;
	}
}
