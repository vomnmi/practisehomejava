class ITCompany extends Worker {
	String equipment;
	String workingTime;
	String contractUntill;


	public ITCompany() {
		equipment = "Unidentified";
		workingTime = "Unknown";
		contractUntill = "Unknown"; 

	}

	@Override
	public void printInfo() {
		System.out.println("Worker name: " + name + " | " + " Age: " + age);
		System.out.println(" Experience: " + experience + " Years | " + " Speciality: " + speciality);
		System.out.println(" Salary: " + getSalary() + " AMD | " + " Equipment: " + equipment);
		System.out.println(" Working time: " + workingTime + " | " + " Contract untill: " + contractUntill);


	}
}