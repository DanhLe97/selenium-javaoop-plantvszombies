package Railway;

public enum TabMenu {

	HOME_PAGE("Home"),
	LOGIN_PAGE("Login"),
	REGISTER_PAGE("Register"),
	BOOKTICKET_PAGE("Book ticket"),
	CONTACT_PAGE("Contact"),
	TIMETABLE_PAGE("Timetable"),
	CHANGEPASSWORD_PAGE("Change password"),
	LOGOUT_PAGE("Log out"),
	MYTICKET_PAGE("My ticket");
	
	
	private String value;
	
	TabMenu(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
