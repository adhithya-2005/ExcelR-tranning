import java.util.Scanner;

public class Demo021 {


    public static double calculateTax(double taxableIncome) {
        double tax = 0;

       
        if (taxableIncome <= 500000) {
            tax = 0.10 * taxableIncome; 
        } else if (taxableIncome <= 1000000) {
            tax = 0.10 * 500000 + 0.20 * (taxableIncome - 500000); 
        } else {
            tax = 0.10 * 500000 + 0.20 * 500000 + 0.30 * (taxableIncome - 1000000);
        }
        return tax;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter monthly gross salary (in Rs): ");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Enter monthly HRA (in Rs): ");
        double hra = scanner.nextDouble();
        System.out.print("Enter monthly PF (in Rs): ");
        double pf = scanner.nextDouble();

        
        double annualSalary = monthlySalary * 12;
        double annualHRA = hra * 12;
        double annualPF = pf * 12;
        double totalDeductions = annualHRA + annualPF;

        
        double taxableIncome = annualSalary - totalDeductions;


        double tax = calculateTax(taxableIncome);

       
        System.out.println("\n--- Tax Calculation Summary ---");
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Annual HRA: Rs " + annualHRA);
        System.out.println("Annual PF: Rs " + annualPF);
        System.out.println("Total Deductions (HRA + PF): Rs " + totalDeductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Annual Tax: Rs " + tax);

       
        scanner.close();
    }
}
