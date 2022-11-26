import java.util.stream.IntStream;

public class Employee {
   private String fio;
   private int departament;
   private int salary;
    private int id;
   private static int counter = 0;

    public Employee(String fio, int departament, int salary) {
        this.fio = fio;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    @Override
    public String toString() {
        return "ФИО=" + fio + ", отдел =" + departament + ", зарплата  =" + salary + ", id=" + id;
    }
    public static void displayEmployees(Employee[] a){
        for (Employee employee : a) {
            System.out.println(employee.toString());
        }
    }

    public static int sumSalary(Employee[] a){
        int sumSalary = 0;
        for (Employee employee : a) {
            sumSalary += employee.salary;
        }
        return sumSalary;
    }
    public static int minSalary(Employee[] a){
        int minSalary=1000000000;
        for (Employee employee : a) {
            if (employee.salary < minSalary) {
                minSalary = employee.salary;
            }
        }
        return minSalary;
    }
    public static int maxSalary(Employee[] a){
        int maxSalary=-1;
        for (Employee employee : a) {
            if (employee.salary > maxSalary) {
                maxSalary = employee.salary;
            }
        }
        return maxSalary;
    }
    public static double sredSalary(Employee[] a){
        return sumSalary(a)/a.length;
    }
    public static void displayFIO(Employee[] a){
        for (Employee employee : a) {
            System.out.println(employee.fio);
        }
    }
}
