public class StringPermutation {
    public static void main(String[] args) {
        permutation("123");
    }
    private static void permutation(String str)
    {
        System.out.println("The Given String is: 123");
        System.out.println("The output String is: ");
        showPermutation(str, "");

    }

    private static void showPermutation(String str, String NewStringToPrint) {
        if (NewStringToPrint.length()==str.length())
        {
            System.out.println(NewStringToPrint);
            return;
        }
        for (int i=0;i<str.length();i++)
        {
            showPermutation(str,NewStringToPrint+str.charAt(i));
        }


    }
}
