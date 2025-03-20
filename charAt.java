import java.util.Scanner;
public class charAt {
    private static int i;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = "Tony";
        String second = "Stark";
        String fullName = first + " @ " + second ;
        System.out.println(fullName.length());

        // CharAt
         for(int i=0;  i<fullName.length(); i++); {
            System.out.println(fullName.charAt(i));

        }

    }
    
}
