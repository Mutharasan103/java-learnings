import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private char grade;
    private String employerName;
       private BigDecimal salary;

Employee()
{
    String title = "Software Engineer";
    char grade = 'A';
    String empName = "Siva";
    BigDecimal salary = BigDecimal.valueOf(15000);
    System.out.println(title + "" + grade + " " + empName+ " " +salary);

}

   /* public String getGrade() {
        return grade;
    }

    public String getTitle(String s) {
        return title;
    }

    public void setTitle(String s) {
        this.title = title;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmployerName(String s) {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmpGrade(char a) {
        return empGrade;
    }

    public void setEmpGrade(char empGrade) {
        this.empGrade = empGrade;
    }

    public BigDecimal getSalary(int i) {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    */


}
