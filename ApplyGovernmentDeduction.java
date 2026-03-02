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
public class ApplyGovernmentDeduction{
    public static void main(String[] args){
    Scanner SalaryInput = new Scanner(System.in);
    System.out.println("What is your gross salary?");
    
    double grossSalary = SalaryInput.nextDouble();
                
    double[] grossSalaryLimits = {3249, 3250, 3750, 4250, 4750, 5250, 5750, 6250, 6750, 7250, 7750, 8250, 8750, 9250, 9750, 10250, 10750, 11250, 11750, 12250, 12750, 13250, 13750, 14250, 14750, 15250, 15750, 16250, 16750, 17250, 17750, 18250, 18750, 19250, 19750, 20250, 20750, 21250, 21750, 22250, 22750, 23250, 23750, 24250, 24750};
    double[] ratesSSS = {135.00, 157.50, 180.00, 202.50, 225.00, 247.50, 270.00, 292.50, 315.00, 337.50, 360.00, 382.50, 405.00, 427.50, 450.00, 472.50, 495.00, 517.50, 540.00, 562.50, 585.00,607.50, 630.00, 652.50, 675.00, 697.50, 720.00, 742.50, 765.00, 787.50, 810.00, 832.50, 855.00, 877.50, 900.00, 922.50, 945.00, 967.50, 990.00, 1012.50, 1035.00, 1057.50, 1080.00, 1102.50, 1125.00};
    double sssDeduction = 0;
    
    for (int i = 0; i < grossSalaryLimits.length; i++){
    if (grossSalary <= grossSalaryLimits[i]){
        sssDeduction = ratesSSS[i];
    break;
    }
    }
    if (grossSalary>grossSalaryLimits[grossSalaryLimits.length - 1]){
    sssDeduction= ratesSSS[ratesSSS.length -1];
    
    
    }
double philHealthRates;
    double philHealthTax= 0.03;
    double philHealthTaxDeduction= (grossSalary*philHealthTax);
   
    
double pagIbigRates;
    if(grossSalary>=1000 && grossSalary<=1500){
    pagIbigRates= 0.03;
    }
    else if(grossSalary>=1500){
    pagIbigRates= 0.04;
    }
    else {
    pagIbigRates=0;
    }
    double pagIbigTaxDeduction= (grossSalary*pagIbigRates);
    
    
    double witholdingTaxRates= 0;
    if (grossSalary<=20832){
    witholdingTaxRates= 0;
    }
    else if (grossSalary<33333){
    witholdingTaxRates= (grossSalary-20833)*0.20;
    }
    else if (grossSalary<66667){
    witholdingTaxRates= 2500+(grossSalary-33333)*0.25;
    }
    else if (grossSalary<166667){
    witholdingTaxRates=10833+(grossSalary-66667)*0.30;
    }
    else if (grossSalary<666667){
    witholdingTaxRates= 40833.33+(grossSalary-166667)*0.32;
    }
    else{
    witholdingTaxRates= 200833.33+(grossSalary-666667)*0.35;
    }
    
    double overallTaxDeduction= (sssDeduction+ philHealthTaxDeduction+ pagIbigTaxDeduction+ witholdingTaxRates);
    double finalSalary= (grossSalary- overallTaxDeduction);
    
    System.out.println("Your Total Salary Including Tax is:"+ finalSalary);
    System.out.println("SSS Deduction: "+ sssDeduction);
    System.out.println("PhilHealth Deduction: "+ philHealthTaxDeduction);
    System.out.println("Pag-Ibig Deduction: "+ pagIbigTaxDeduction);
    System.out.println("Witholding Tax Deduction: "+witholdingTaxRates);
    
    SalaryInput.close();
}
    
    
    }
    
 

      
    
  
