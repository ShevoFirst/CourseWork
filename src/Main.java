public class Main {
    public static void main(String[] args) {///
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("человек ",(int) (Math.random()*5+1),(int)(Math.random()*100000+20000));
        }
        EmployeesService.displayEmployees(employees);
        System.out.println(EmployeesService.sumSalary(employees));
        System.out.println(EmployeesService.minSalary(employees));
        System.out.println(EmployeesService.maxSalary(employees));
        System.out.println(EmployeesService.sredSalary(employees));
        EmployeesService.displayFIO(employees);
    }
}