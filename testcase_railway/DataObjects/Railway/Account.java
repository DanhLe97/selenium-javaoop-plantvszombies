package Railway;

import Common.Utilities;

public class Account {
	private String email;
	private String password;
	private String confirmPassword;
	private String pid;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPid() {
		return pid;
	}

	public void setpid(String pid) {
		this.pid = pid;
	}

	public Account(String email, String password, String confirmPassword, String pid) {
		this.email = email;
		this.password = password;
		this.confirmPassword = password;
		this.pid = pid;
	}

	public Account() {
		email = Utilities.getRandomString() + "@gmail.com";
		password = Utilities.getRandomString();
		confirmPassword = password;
		pid = Utilities.getRandomString();
	}

}
