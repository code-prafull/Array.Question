import java.util.Scanner;
public class FindArrayInputNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Calculation");
        System.out.println("Please Enetr your Size");
        int size = input.nextInt();
        int number[] = new int[size];
        System.out.println("Please enetr your found number");

        // input 
        for (int i=0; i<size; i++) {
            number[i] = input.nextInt();
        } 
        int x = input.nextInt();


        // output 
        for(int i=0; i<number.length; i++ ){
            if(number[i] == x){

           
            System.out.println("x found at index" + i);
            }
        }

        
    }
    
}
