import java.util.Scanner;

class employeeApp extends employee {

    public static void main(String[] args) {
        employee mEmployee = new employee();
        System.out.println(mEmployee.salary);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How much is this employee's bonus");
        Double bonus = myScanner.nextDouble();
        mEmployee.bonus = bonus;
        System.out.println(mEmployee.bonus);
        System.out.println(mEmployee.salary);
        Double totalIncome = mEmployee.bonus+mEmployee.salary;
        System.out.println("This employee's total income is: "+totalIncome);
    
    }

}