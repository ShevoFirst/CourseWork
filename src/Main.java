import java.util.Random;

public class Main {
    public static void main(String[] args) {///
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("человек ",(int) (Math.random()*5+1),(int)(Math.random()*100000+20000));
        }
        Employee.displayEmployees(employees);
        System.out.println(Employee.sumSalary(employees));
        System.out.println(Employee.minSalary(employees));
        System.out.println(Employee.maxSalary(employees));
        System.out.println(Employee.sredSalary(employees));
        Employee.displayFIO(employees);
    }
}