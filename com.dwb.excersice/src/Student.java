import java.math.BigDecimal;

public class Student {
       private String Name;
       private int[] marks;
        public Student(String Name,int[] marks){
            this.Name=Name;
            this.marks=marks;
        }
        public int getNumberOfMarks()
        {
            return marks.length;
        }
        public int getMaximumMarks()
        {
            int maximum=0;
            for (int mark:marks)
            {
                if (mark>maximum)
                {
                    maximum=mark;
                }
            }return maximum;
        }

    public int getMinimumMarks()
    {
     int minimum=Integer.MAX_VALUE;
     for (int mark:marks)
     {
         if (mark<minimum)
         {
             minimum=mark;
         }
     }return minimum;
    }

    public int getSumMarks()
    {
        int sum=0;
        for (int mark :marks)
        {
            sum+=mark;
        }
        return sum;
    }

    public BigDecimal getAverageOf()
    {
        int sum = getSumMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum/number);


    }
}
