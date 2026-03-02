/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;
import java.util.Scanner;
/**
 *
 * @author Jiane Carlo Pantino
 */
public class LoginPrototype {
    public static void main(String[] args){
    Scanner LoginInfo= new Scanner (System.in);
    
    String correctUsername= "Admin";
    String correctPassword= "12345";
    
    String[] employeeName= {"Juan", "Paulo", "Junior", "Bob", "Mark", "John"};
    String[] employeePassword= {"0000","1111","2222","3333","4444", "5555"};
    
    System.out.println("Username: ");
    String username= LoginInfo.nextLine();
    System.out.println("Password: ");
    String password= LoginInfo.nextLine();
    
   if (username.equals(correctUsername)&& password.equals(correctPassword)){
   System.out.println("Login Successful");
   System.out.println("Welcome Administrator");
   }
   else{
    boolean found= false;
    for(int i=0; i<employeeName.length; i++){
    if (username.equals(employeeName[i])&& password.equals(employeePassword[i])){
    System.out.println("Login Successful");
    System.out.println("Welcome "+ employeeName[i]);
    found= true;
    break;
    }
    }
    if (!found){
    System.out.println("Access Denied");
    }
   }
    }
    
}
