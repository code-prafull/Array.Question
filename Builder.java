public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("tony"); 
        System.out.println(sb);
        // char At index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
         sb.setCharAt(0, 'P');
        System.out.println(sb);
        



        // Stony (0 position 'S')

        sb.insert(0, 's' );
        System.out.println(sb);
      



        // tonny (2 position ' n ')
        sb.insert(2 , 'n');
        System.out.println(sb);




        // to delet Extra World (2)

      sb.delete(2,3);
      System.out.println(sb);


      // Add last Letter

      sb.append("e");
      sb.append("l");
      sb.append("l");
      System.out.println(sb);








    }

      



    
}
