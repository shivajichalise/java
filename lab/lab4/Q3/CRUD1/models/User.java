package models;

public class User {
	private int id;
	private String name;
	private int age;
	private String address;

	/**
	 * Getter Methods
	 */
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * Setter Methods
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
