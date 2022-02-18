public class ArrayString {
    public static void main(String[] args) {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String dayWithMostCharacter="";
        for (String day:days)
        {
            if (day.length()>dayWithMostCharacter.length())
            {
                dayWithMostCharacter=day;
            }
        }
        System.out.println("The Most Character of the days is: "+dayWithMostCharacter);
        for (int i=days.length-1;i>=0;i--) {
            System.out.println(days[i]);
        }
    }
}
