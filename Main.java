import java.util.*;
public class Main {
	public static void main(String[] args) {
	ITCompany worker1 = new ITCompany();
	scanInfo(worker1);
	System.out.println("Nice to meet you " + worker1.name);


}
	public static void scanInfo(ITCompany worker) {
	Scanner scn = new Scanner(System.in);    
    	System.out.println("Enter your Name ");
    		worker.name = scn.nextLine();

    	System.out.println("Please enter your age, " + worker.name);
    		worker.age = scn.nextInt();

    	System.out.println("How much experience do you have?");
    		worker.experience = scn.nextLine();

    		scn.nextLine();

    	System.out.println("What is your speciality" + worker.name + "?");
    		worker.speciality = scn.nextLine();

    	System.out.println("How much you earn?");
    		worker.setSalary(scn.nextDouble());

    	System.out.println("What equipment do you have?");
    		worker.equipment = scn.nextLine();

    		scn.nextLine();

    	System.out.println("How long you have been working with us?");
    		worker.workingTime = scn.nextLine();

    	System.out.println("When does you contract expire?");
    		worker.contractUntill = scn.nextLine();
 	
	}

}
