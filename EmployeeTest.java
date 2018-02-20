import java.time.*;
import java.util.Scanner;

/**
 * This program tests the Employee class.
 * @version 1.12 2015-05-08
 * @author Cay Horstmann
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15, "CEO");
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1, "CFO");
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15, "engineer");
        staff[2].setName("ycy");
        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }


        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay() + ",position=" + e.getPosition());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private String position;

    public Employee(String n, double s, int year, int month, int day, String p) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        position = p;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getPosition() {
        return position;
    }


    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
