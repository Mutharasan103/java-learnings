package Excersice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeUsingList {
    List<Employee> list = new ArrayList<>();

    private void addEmployee(Employee employee)
    {
        list.add(employee);
    }
    private void showEmployeeDetails()
    {
        for (Employee employee:list)
        {
            System.out.println(employee.getName()+ " " +employee.getAge()+ " " + employee.getEmpId());
        }
    }


    public static void main(String[] args) {
        EmployeeUsingList emplist = new EmployeeUsingList();
        Employee employee1 = new Employee("Muthu",25,101);
        Employee employee2 = new Employee("Arasan",23,102);
        Employee employee3 = new Employee("Pearl",24,103);
        Employee employee4 = new Employee("King",20,104);
        Employee employee5 = new Employee("Pearlking",27,105);
        Employee employee6 = new Employee("Mutharasan",28,106);
        emplist.addEmployee(employee1);
        emplist.addEmployee(employee2);
        emplist.addEmployee(employee3);
        emplist.addEmployee(employee4);
        emplist.addEmployee(employee5);
        emplist.addEmployee(employee6);

        emplist.showEmployeeDetails();

    }
}
