package ZadaciPetak;

import java.util.Scanner;

public class PrestupneGodine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numberOfLeapYears = 0;

        System.out.println("Enter the first year: ");

        int firstYear = sc.nextInt();

        System.out.println("Enter the second year: ");

        int secondYear = sc.nextInt();

        boolean leapYear = firstYear % 4 == 0 && (firstYear % 100 != 0 || firstYear % 400 ==0);

        if (firstYear < 0 || secondYear < 0) {
            System.exit(1);


        }
        while (firstYear <= secondYear) {
            if (firstYear % 4 == 0 && firstYear % 100 != 0 || firstYear % 400 == 0){
                numberOfLeapYears+=1;

            }
            firstYear++;

        }
        System.out.println(numberOfLeapYears);
    }
}
