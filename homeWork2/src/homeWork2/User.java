package homeWork2;
//base 
public class User {
	private int �d;
	private String name;
	private String lastName;
	private String email;
	private String password;
	
	public User() {
		
	}
	public User(int �d,String name,String lastName,String email,String password) {
		this();
		this.�d=�d;
		this.name=name;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}
	
	public int getId() {
		return �d;
	}

	public void setId(int id) {
		�d = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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

	
}
