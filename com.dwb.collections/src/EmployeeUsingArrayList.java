import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeUsingArrayList {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Muthu",25,101));
        list.add(new Employee("Arasan",22,102));
        list.add(new Employee("Mutharasan",23,103));
        list.add(new Employee("Pearl",27,104));
        list.add(new Employee("King",28,104));
        list.add(new Employee("Pearlking",19,105));
        list.add(new Employee("Kumar",17,106));


    }
    private static class Employee {
        String Empname;
        int EmpAge;
        int EmpId;

        public Employee(String empname, int empAge, int empId) {
            Empname = empname;
            EmpAge = empAge;
            EmpId = empId;
        }


        public String getEmpname() {
            return Empname;
        }

        public void setEmpname(String empname) {
            Empname = empname;
        }

        public int getEmpAge() {
            return EmpAge;
        }

        public void setEmpAge(int empAge) {
            EmpAge = empAge;
        }

        public int getEmpId() {
            return EmpId;
        }

        public void setEmpId(int empId) {
            EmpId = empId;
        }
    }
}
