package com.glearning.pg.client;

import com.glearning.pg.model.Employee;
import com.glearning.pg.service.CredentialService;
import java.util.Scanner;

//Email Administrator Application
//scenario: task of creating email accounts for new hires.

public class ProfileGeneratorClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your option ");
        System.out.println("Admin = 0 ");
        System.out.println("HR = 1 ");
        System.out.println("Technical = 2 ");
        System.out.println("Legal = 3 ");

        int option  = scanner.nextInt();

        System.out.println("Enter your firstName");
        String firstName = scanner.next();

        System.out.println("Enter your lastName");
        String lastName = scanner.next();
        Employee employee = new Employee(firstName, lastName);
        switch (option){
            case 0:
                employee.setDept("Admin");
                break;
            case 1:
                employee.setDept("HR");
                break;
            case 2:
                employee.setDept("Technical");
                break;
            case 3:
                employee.setDept("Legal");
                break;
        }
        //Call the credential service
        String emailAddress = CredentialService.generateEmailAddress(firstName, lastName, employee.getDept());
        employee.setEmailAddress(emailAddress);
        System.out.println("Please enter the password length");
        int length = scanner.nextInt(10);
        String password = CredentialService.generatePassword(length);
        employee.setPassword(password);

        CredentialService.showCredentials(employee);

        //finally close
        scanner.close();

    }
}
