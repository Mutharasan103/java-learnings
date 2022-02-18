import java.math.BigDecimal;

public class StudentDetail {
    public static void main(String[] args) {
        int[] marks = { 98, 95, 97, 50,100, 25};
        Student student = new Student("Muthu", marks);
        int number = student.getNumberOfMarks();
        System.out.println("The Number of Marks is: " +number);
        int maximum = student.getMaximumMarks();
        System.out.println("The maximum mark is: " +maximum);
        int minimum = student.getMinimumMarks();
        System.out.println("The Minimum mark is: "+minimum);
        int sum = student.getSumMarks();
        System.out.println("THe sum of the marks is: " +sum);
        BigDecimal average = student.getAverageOf();
        System.out.println("The Average is: "+average);
    }
}


