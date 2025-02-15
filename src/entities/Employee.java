
package entities;

public class Employee {
    private final Integer id;
    private final String name;
    private Double salary;


    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary += salary;
    } */

    public void increaseSalary(Double percentage) {
        salary += salary * percentage / 100;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
