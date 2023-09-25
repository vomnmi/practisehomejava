class Worker {
	String name;
	int age;
	String experience;
	String speciality;
	private double salary;


	public Worker() {
		name = "Arman Gharabaghtsyan";
		age = 23;
		experience = "3 years";
		speciality = "Java Developer";
		salary = getSalary();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printInfo() {
		System.out.println("Worker name: " + name + "Age: " + age + "Experience: " + experience 
			+ "Speciality: " + speciality + "Salary: " + salary + "AMD ");
	}

}