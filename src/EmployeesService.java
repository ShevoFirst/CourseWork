public class EmployeesService {
    public static void displayEmployees(Employee[] a){
        if (a ==null)
            throw new IllegalArgumentException("Сотрудники отсутствуют");
        for (Employee employee : a) {
            System.out.println(employee.toString());
        }
    }

    public static int sumSalary(Employee[] a){
        if (a ==null)
            throw new IllegalArgumentException("Сотрудники отсутствуют");
        int sumSalary = 0;
        for (Employee employee : a) {
            if (employee.getSalary()<0)
                throw new IllegalArgumentException("У сотрудника под номером"+employee.getId()+"отрицательная зарплата");
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }
    public static int minSalary(Employee[] a){
        if (a ==null)
            throw new IllegalArgumentException("Сотрудники отсутствуют");
        int minSalary=1000000000;
        for (Employee employee : a) {
            if (employee.getSalary()<0)
                throw new IllegalArgumentException("У сотрудника под номером"+employee.getId()+"отрицательная зарплата");
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }
    public static int maxSalary(Employee[] a){
        int maxSalary=-1;
        if (a ==null)
            throw new IllegalArgumentException("Сотрудники отсутствуют");
        for (Employee employee : a) {
            if (employee.getSalary()==0)
                throw new IllegalArgumentException("У сотрудника под номером"+employee.getId()+"отрицательная зарплата");
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    public static double sredSalary(Employee[] a){
        return sumSalary(a)/a.length;
    }
    public static void displayFIO(Employee[] a){
        if (a ==null)
            throw new IllegalArgumentException("Сотрудники отсутствуют");
        for (Employee employee : a) {
            System.out.println(employee.getFio());
        }
    }
}
