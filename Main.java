import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Welcome to Employee Bonus Calculator");
        boolean continueOn = true;
        while(continueOn) {
            System.out.print("\n\nSelect from options below: \n\n");
            System.out.print("1. Add Employee\n2. Display Employee Information\n3. Exit\n");
            System.out.print("Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();

                    System.out.println("Role: ");
                    System.out.println("1. Manager");
                    System.out.println("2. Developer");
                    System.out.println("3. Intern");
                    System.out.print("Your choice: ");
                    int roleChoice = sc.nextInt();

                    Role role;

                    switch (roleChoice) {
                        case 1 -> role = Role.MANAGER;
                        case 2 -> role = Role.DEVELOPER;
                        default -> role = Role.INTERN;
                    }

                    Employee e = new Employee(name, salary, role);
                    employees.add(e);
                    break;

                case 2:
                    displayEmployeeBonusesByEmployee(employees);
                    break;

                case 3:
                    System.out.println("Bye!");
                    continueOn = false;


            }
        }

    }

    // helper method to print all
    private static void displayEmployeeBonusesByEmployee(List<Employee> employees) {

        for (Employee employee : employees) {
            System.out.println(
                    "Name: " + employee.name +
                            "\nRole: " + employee.role +
                            "\nSalary: " + employee.salary +
                            "\nBonus: " + calculateBonus(employee) +
                            "\nYearly Total: " + (employee.salary + calculateBonus(employee) + "\n\n")
            );
        }
    }

    private static double calculateBonus(Employee e) {

        final double MANAGER_BONUS = 0.20;
        final double DEVELOPER_BONUS = 0.12;
        final double INTERN_BONUS = 0.05;

        if (e.role == Role.MANAGER) {
            return e.salary * MANAGER_BONUS;
        }

        if (e.role == Role.DEVELOPER) {
            return e.salary * DEVELOPER_BONUS;
        }

        if (e.role == Role.INTERN) {
            return e.salary * INTERN_BONUS;
        }

        return 0;
    }

}
