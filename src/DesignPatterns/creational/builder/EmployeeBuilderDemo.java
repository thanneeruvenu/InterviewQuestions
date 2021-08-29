package DesignPatterns.creational.builder;

public class EmployeeBuilderDemo {
    public static void main(String[] args) {

      Employee employee =  EmployeeBuilder
                .getInstance()
                .id(101)
                .name("Hello")
                .sal(1000)
                .build();
      System.out.println(employee);
    }
}

class EmployeeBuilder {
    private String name;
    private double sal;
    private int id;

    public EmployeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder sal(double sal) {
        this.sal = sal;
        return this;
    }

    public EmployeeBuilder id(int id) {
        this.id = id;
        return this;
    }

    public Employee build() {
        return new Employee(id, name, sal);
    }

    static EmployeeBuilder getInstance() {
        return new EmployeeBuilder();
    }

}

class Employee {
    private int id;
    private String name;
    private double sal;

    public Employee(int id, String name, double sal) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
