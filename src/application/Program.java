package application;

import entities.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            List<Employee> employees = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.printf("Emplyoee #%d:%n", i + 1);
                System.out.print("Id: ");
                int id = sc.nextInt();
                for (Employee listId : employees) {
                    while (listId.getId() == id) {
                        System.out.print("Existing ID, please enter another one: ");
                        id = sc.nextInt();
                    }
                }
                System.out.print("Name: ");
                sc.nextLine();//Limpeza de buffer
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                employees.add(new Employee(id, name, salary));
                System.out.println();
            }
            System.out.print("Enter the employee id that will have salary increase : ");
            int employeeId = sc.nextInt();
            // Filtrar o Id
            boolean idFound = false; // Flag para verificar se o ID foi encontrado
            for (Employee x : employees) {
                if (x.getId().equals(employeeId)) {
                    System.out.print("Enter the percentage: ");
                    double percentage = sc.nextDouble();
                    x.increaseSalary(percentage);
                    idFound = true; // ID encontrado
                    break; // Sai do loop, pois o ID foi encontrado
                }
            }
            if (!idFound) {
                System.out.println("This id does not exist!");
            }

            System.out.println();
            System.out.println("List of employees:");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
