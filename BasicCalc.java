/*
 * Author: Ndeye Aicha Thiandoum
 * Date: 9/8/2019
 * Assignment1: Test Application / app3
 */

package assignment1;

import java.util.Scanner;

public class BasicCalc
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num1, num2, sumNums, prodNums, diffNums, quotNums;

        System.out.println("Enter one integer:");
        num1 = in.nextInt();
        System.out.println("Enter another integer:");
        num2 = in.nextInt();

        sumNums = num1 + num2;
        prodNums = num1 * num2;
        diffNums= num1 - num2;
        quotNums= num1 / num2;

        System.out.print("The sum of the two integers entered is: ");
        System.out.println(sumNums);
        System.out.print("The difference of the two integers entered is: ");
        System.out.println(prodNums);
        System.out.print("The product of the two integers entered is: ");
        System.out.println(diffNums);
        System.out.print("The quotient of the two integers entered is: ");
        System.out.print(quotNums);
    }
}
