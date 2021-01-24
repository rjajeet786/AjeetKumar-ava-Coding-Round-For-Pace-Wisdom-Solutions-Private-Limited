package com.springRest.springRest.model;

public class Employee {

	long Id;
	String FirstName;
	String LastName;
	String EmailId;
	int Age;
	String Gender;
	String Address;

	public Employee(long Id, String FirstName, String LastName, String EmailId, int Age, String Gender,
			String Address) {
		super();
		this.Id = Id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.EmailId = EmailId;
		this.Age = Age;
		this.Gender = Gender;
		this.Address = Address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [Id:- " + Id + ", FirstName:- " + FirstName + ", LastName:- " + LastName + ", EmailId:- "
				+ EmailId + ", Age:- " + Age + ", Gender:- " + Gender + ", Address:- " + Address + "]";
	}

}
