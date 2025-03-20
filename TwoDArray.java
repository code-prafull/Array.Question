import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to Matrix printer");
        System.out.println("Please enter your Row");
        int Row = input.nextInt();
        System.out.println("Please  enter your Coloum");
        int Cols = input.nextInt();
        int [][] numbers = new int[Row][Cols];

        // input 
        //ROW
        for (int i=0; i<Row; i++){
            // COLOUM
            for(int j =0; j<Cols; j++) {
                numbers[i][j] =  input.nextInt();

            } 
            
        }
        //Output
        for(int i=0; i<Row; i++){
            for(int j=0; j<Cols; j++){
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }



        
    }
    
}
