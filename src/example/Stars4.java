package example;

public class Stars4 {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         */

        for (int i = 1; i <5 ; i++) {
            for (int j = 3; j >=i ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = 1; a <5 ; a++) {
            for (int b = 1; b <=a ; b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <5-a ; c++) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }
}
