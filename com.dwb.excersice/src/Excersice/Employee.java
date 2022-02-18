package Excersice;

 class Employee {
    private String Name;
    private int Age;
    private int EmpId;

     public Employee(String name, int age, int empId) {
         Name = name;
         Age = age;
         EmpId = empId;
     }

     public String getName() {
         return Name;
     }

     public void setName(String name) {
         Name = name;
     }

     public int getAge() {
         return Age;
     }

     public void setAge(int age) {
         Age = age;
     }

     public int getEmpId() {
         return EmpId;
     }

     public void setEmpId(int empId) {
         EmpId = empId;
     }
 }
