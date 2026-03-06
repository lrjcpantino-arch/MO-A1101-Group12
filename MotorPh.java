/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Jiane Carlo Pantino
 */
public class MotorPh {
    public static void main(String[] args) {
        
        Scanner mphd= new Scanner(System.in);
        
        String empDetails = "resources/MPHD Employee Details.csv";
        
        System.out.println("------------WELCOME TO MOTORPH PAYROLL SYSTEM------------");
        
        
        System.out.println("Enter Employee ID");
        String inputId= mphd.nextLine();
        
        System.out.println("Enter Password");
        String inputPassword= mphd.nextLine();
        
        boolean loginSuccess = false;
        boolean isAdmin = false;
        String employeeName = "";
        
        String adminId= "13579";
        String adminPassword= "12345";
        
        if (inputId.equals(adminId)&& inputPassword.equals(adminPassword)) {
        loginSuccess= true;
                isAdmin= true;
        }
        if(!loginSuccess) {
        try (BufferedReader br = new BufferedReader(new FileReader(empDetails))){
        br.readLine();
        
        String line;
        while ((line = br.readLine())!= null){
        if(line.trim().isEmpty()) continue;
        String[] data = line.split(",");
        String empNo = data[0];
        String lastName = data[1];
        String password = data[2];
        
        if (inputId.equals(empNo)&& inputPassword.equals(password)){
        loginSuccess = true;
        employeeName = lastName;
        break;
        }
        }
        
        } catch(Exception e){
        System.out.println("Error reading employee file.");
        return;
        }
        }
        if (loginSuccess){
        if (isAdmin){
        System.out.println("Login Successful");
        System.out.println("Welcome Administrator");
        }
        else{
        System.out.println("Login Successful");
        System.out.println("Welcome"+ employeeName);
        System.out.println("Employee Access Granted");
        }
        }
        else{
        System.out.println("Login Failed");
        }
       
        
        
    }
}
