package emailAdministrationApplication;

import java.util.Scanner;

public class Email {
    private String name;
    private String surName;
    private String department;
    final String domain = "aecompany.com";
    public static final String green = "\u001B[32m";
    public static final String blue = "\u001B[34m";



    public Email(String name, String surName){
        this.name = name;
        this.surName = surName;
        getDepartment();
        System.out.println(green+"******* Your mail has been successfully created *******");
        System.out.println(showInformations());

    }

    public void getDepartment(){
        Scanner input = new Scanner(System.in);
        System.out.println("In which department do you work");
        this.department = input.next();
    }

    public String creatNewMail(){
        return name.toLowerCase() + "." + surName.toLowerCase() + "@" + department.toLowerCase() + "." + domain;
    }

    public String createPassword(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz#$%^&*!";
        int passwordLength = 6;
        String password = "";
        for (int i = 0; i < passwordLength; i++){
            int rnd = (int)(Math.random()*alphabet.length());
            password += alphabet.charAt(rnd);
        }
        return password;
    }

    public String showInformations(){
        int mailBoxCapacity = 500;
        return blue + "Your Name: " + name +" " + surName + "\nYour Department: " + department +  "\nYour Mail: " + creatNewMail() + "\nYour Password: " + createPassword() + "\nEmail Capacity: " + mailBoxCapacity;
    }










}
