public class problem1 {

    public static void main(String[] args) {

        System.out.println("Miles\tKilometers");

        for(int i = 1; i <= 10; i++) {
            double kilometers = i * 1.609;
            System.out.println(i + "\t" + kilometers);
        }
    }
}