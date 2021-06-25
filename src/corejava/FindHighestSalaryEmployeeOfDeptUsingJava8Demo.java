package corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindHighestSalaryEmployeeOfDeptUsingJava8Demo {
    public static void main(String[] args) {

        // prepare data
        List<Employee> employeeList = new ArrayList<>();

        List<Department> departmentList = new ArrayList<>();

        // Dept 1
        Department hr_dept = new Department(1,"Hr",new ArrayList<>());
        hr_dept.getEmployees().add(new Employee(1, "a", 10000,hr_dept));
        hr_dept.getEmployees().add(new Employee(2, "b", 30000,hr_dept));
        hr_dept.getEmployees().add(new Employee(3, "c", 50000,hr_dept));
        hr_dept.getEmployees().add(new Employee(4, "d",20000,hr_dept));


        // dept 2
        Department finance_dept = new Department(2,"fn",new ArrayList<>());
        finance_dept.getEmployees().add(new Employee(11, "aa", 110000,finance_dept));
        finance_dept.getEmployees().add(new Employee(22, "bb", 330000,finance_dept));
        finance_dept.getEmployees().add(new Employee(33, "cc", 550000,finance_dept));
        finance_dept.getEmployees().add(new Employee(44, "dd",220000,finance_dept));

        departmentList.add(hr_dept);
        departmentList.add(finance_dept);

        employeeList.addAll(hr_dept.getEmployees());
        employeeList.addAll(finance_dept.getEmployees());

        //find Highest salary employee in each Dept
       // employeeList.stream().flatMap(Collection::).forEach(System.out::println);
    }

    public static Optional<Employee> findHighestSalaryEmployeeByDeptId(List<Department> departmentList, int deptId){

        return null;
    }

}






class Employee {
    private int id;
    private double sal;
    private String name;
    private Department department;

    Employee(int id, String name, double sal,Department department) {
        this.id = id;
        this.sal = sal;
        this.name = name;
        this.department = department;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}

class Department {
    private int id;
    private String name;
    private List<Employee> employees;
    Department(int id, String name, List<Employee> employees){
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
