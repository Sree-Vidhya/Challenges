import java.util.Scanner;
public class IncomeTaxCalculator {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Income tax Calculator : ");
        System.out.println("Do you want to Enter your personal Information?");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("Y")) {
            System.out.println("Please enter your name");
            String name = input.nextLine();
            System.out.println("Please enter your annual salary");
            int salary = Integer.parseInt(input.nextLine());
            int gross_income = salary / 12;
            double base_tax = 0.00;
            double extra_cents = 0.00;
            double base_salary = 0.00;
            if (salary > 18201 && salary < 37000) {
                extra_cents = 0.19;
                base_salary = 18200;
            } else if (salary > 37001 && salary < 87000) {
                base_tax = 3572;
                extra_cents = 0.325;
                base_salary = 37000;
            } else if (salary > 87001 && salary < 180000) {
                base_tax = 19822;
                extra_cents = 0.37;
                base_salary = 87000;
            } else if (salary > 180001) {
                base_tax = 54232;
                extra_cents = 0.45;
                base_salary = 180000;
            }
            double income_tax = (base_tax + (salary - base_salary) * extra_cents) / 12;
            income_tax = Math.ceil(income_tax);
            System.out.println("Hi " + name + ",your tax based on your income is" + income_tax);
        }

}}
