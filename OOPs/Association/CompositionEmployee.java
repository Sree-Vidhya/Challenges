package OOPs.Association;

    class Pay
    {
        int salary;
        int bonus;

        Pay(int s, int b)
        {
            this.salary = s;
            this.bonus = b;
        }
    }

    class Employee
    {
        int EmpNum;
        String name;
        String Address;
        int phNum;
        Pay salary;
        Pay bonus;

        public Employee(int empNum, String name, String address, int phNum, Pay salary, Pay bonus) {
            EmpNum = empNum;
            this.name = name;
            Address = address;
            this.phNum = phNum;
            this.salary = salary;
            this.bonus = bonus;
        }
    }

public class CompositionEmployee
{
        public static void main(String[] args) {
            Pay pay = new Pay(5000,1500);
            Employee emp1 = new Employee(0001,"Andy","SouthYarra",987654,pay,pay);
            System.out.println("Name:             "+emp1.name);
            System.out.println("Employee Number:  "+emp1.EmpNum);
            System.out.println("Address:          "+emp1.Address);
            System.out.println("Ph:               "+emp1.phNum);
            System.out.println("Salary:           "+emp1.salary.salary);
            System.out.println("Bonus:            "+emp1.salary.bonus);

        }
    }
