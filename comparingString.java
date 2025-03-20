public class camparingString {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "moni";


        //1 S1 > S2 : +ve value 
        //2 S1 == S2 : Return 0
        //3 S1 < S2 : -ve value

        // example  hello ANB Fello {Fello is greater than hello because "F" is firstly come together and
        // secondly " H "}

       if (name1.compareTo(name2) == 0) {
            System.out.println("String Are Equal");

        } else {
            System.out.println("String Are Unequal");
        }
    }
    
    }
