package net.faikaktas;

public class Emplooye {
	private long id = 1L;
	
	private String first_name = "Faik";
	
	private String last_name = "Aktaş";
	
	public Double salary = 5000D;

	public Emplooye() {
		super();
	}

	public Emplooye(long id, String first_name, String last_name, Double salary) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
