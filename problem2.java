public class problem2 {

    public static void main(String[] args) {

        // setting the table title
        System.out.println("\t\t\t\tMultiplication Table");

        // setting up header colums
        for(int i = 1; i <=9; i++) {
                System.out.print("\t " + i);
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------");

        for(int j = 1; j <= 9; j++) {
            // setting up header rows
            System.out.print(j + "  |" + "\t");

            // display the elements
            for(int k = 1; k <= 9; k++) {
                if(j * k < 10){
                    System.out.print(" " +(k * j) + "\t");
                } else {
                    System.out.print((k * j) + "\t");
                }
            }

            System.out.println("");
        }
    }
}