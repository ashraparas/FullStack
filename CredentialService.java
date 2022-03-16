package com.glearning.pg.service;

import com.glearning.pg.model.Employee;
import java.util.Random;

public final class CredentialService {

    //generate email address
    //generate password
    //display password
    public final static String generateEmailAddress(String firstName, String lastName, String dept){
        return firstName+"_"+lastName+"_"+dept+"company.com";
    }

    public final static String generatePassword(int length){
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_=+-/.?<>)";

        String seed = capitalLetters + smallLetters + numbers + specialCharacters;
        Random random = new Random();

        if(length <  10){
            throw new IllegalArgumentException(" Password length should be more than 8 characters long");
        }
        char[] password = new char[length];
        for (int index = 0; index < length; index++) {
            int randomNumber = random.nextInt(seed.length());
            char c = seed.charAt(randomNumber);
            password[index] = c;
        }
        return String.copyValueOf(password);
    }

    public static void showCredentials(Employee employee){
        System.out.println("============="+employee.getFirstName() + " "+ employee.getLastName()+"===========");
        System.out.println("First name "+ employee.getFirstName());
        System.out.println("Last name "+ employee.getLastName());
        System.out.println("Email address "+ employee.getEmailAddress());
        System.out.println("Password "+ employee.getPassword());
        System.out.println("============="+employee.getFirstName() + " "+ employee.getLastName()+"===========");
    }
}
