import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        char Letter;
        Scanner st = new Scanner(System.in);
        System.out.println("Enter a Letter");
        Letter = st.next().charAt(0);
        switch (Letter){
            default:
                System.out.println("This letter is constant");
                break;
            case 'a':
                System.out.println(" A is an vowel");
                break;
            case 'e':
                System.out.println(" E is an vowel");
                break;
            case 'i':
                System.out.println(" I is an vowel");
                break;
            case 'o':
                System.out.println("O is an vowel");


        }
    }
}
