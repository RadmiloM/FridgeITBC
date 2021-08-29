package ZadaciPetak;

import java.util.Scanner;

public class ProsecnaVrednost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfPositiveNumbers = 0;
        System.out.println("Enter the product prices: ");

        int lengthOfValidNumbers = 0;



        double productPrices = sc.nextDouble();
        if (productPrices > 0) {
            sumOfPositiveNumbers += productPrices;
            lengthOfValidNumbers += 1;
        }else if(productPrices == 0){
            System.exit(1);
        }

        while (productPrices != 0) {
            productPrices = sc.nextDouble();
            if (productPrices > 0) {
                sumOfPositiveNumbers += productPrices;
                lengthOfValidNumbers += 1;

            }
        }
        System.out.println(sumOfPositiveNumbers);
        System.out.println(lengthOfValidNumbers);
        System.out.println("Average rating is " + (Math.floor(sumOfPositiveNumbers)) / lengthOfValidNumbers);
    }
}
