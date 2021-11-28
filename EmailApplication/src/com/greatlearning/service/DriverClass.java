package com.greatlearning.service;
import com.greatlearning.model.Employee;
import java.util.Scanner;
public class DriverClass {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		String firstName;
		String lastName;
		
		System.out.println("Enter your First name:");
		firstName=in.next();
		System.out.println("Enter your Last name:");
		lastName=in.next();
		Employee employee1=new Employee(firstName,lastName);
		
		String generatedEmail;
		char [] generatedPassword;
		CredentialService cService=new CredentialService();
		int choice;
		
		System.out.println("Please enter the Department from the following:");
		System.out.println("1. Technical Dept\n2. Admin Dept\n3. HR Dept\n4. Legal Dept");
		
		choice=in.nextInt();
		
		if(choice==1) {
			generatedEmail=cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"technical");
			generatedPassword=cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		
		else if(choice==2) {
			generatedEmail=cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"admin");
			generatedPassword=cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		
		else if(choice==3) {
			generatedEmail=cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"hr");
			generatedPassword=cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		
		else if(choice==4) {
			generatedEmail=cService.generateEmailAddress(employee1.getFirstName(),employee1.getLastName(),"legal");
			generatedPassword=cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		
		else {
			System.out.println("Enter a valid choice");
		}
	}
}
