import java.util.Objects;
import java.util.stream.IntStream;

public class Employee {///
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && id == employee.id && fio.equals(employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, departament, salary, id);
    }
}
