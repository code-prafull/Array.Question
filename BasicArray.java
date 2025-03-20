import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array ");
        System.out.println("Please enter your number");
        int size = input.nextInt();
        int number[] = new int[size];
        // input
        for(int i =0; i<size; i++){
            number[i] = input.nextInt();
        }
        // output
    for (int i=0; i<size; i++) {
        System.out.println(number[i]);
    }
        
    }
    
}
