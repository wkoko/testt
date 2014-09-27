package first;

public class Person {

	private Users user;
	
	private String firstname;
	private String surnname;
	private String pesel;
	private String email;
	private List<addresses> addresses;
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurnname() {
		return surnname;
	}
	public void setSurnname(String surnname) {
		this.surnname = surnname;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<addresses> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<addresses> addresses) {
		this.addresses = addresses;
	}
	
	
	
}
