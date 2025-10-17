package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Salespeople you wish to enter: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max_sale_amount = sales[0];
        int min_sale_amount = sales[0];
        int max_sale_id = 1;
        int min_sale_id = 1;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i] > max_sale_amount) {
                max_sale_amount = sales[i];
                max_sale_id = i + 1;
            }
            if (sales[i] < min_sale_amount) {
                min_sale_amount = sales[i];
                min_sale_id = i + 1;
            }

            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        double average = (double) sum / sales.length;
        System.out.println("\nTotal sales: " + sum);


        System.out.println("\nAverage Sale: " + average);


        System.out.println("Salesperson " + max_sale_id + " had the highest sale with $" + max_sale_amount);


        System.out.println("Salesperson " + min_sale_id + " had the lowest sale with $" + min_sale_amount);

        System.out.println("Enter an amount of money: ");
        int value = scan.nextInt();
        int num = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > value) {
                System.out.println("Salesperson " + (i + 1) + " had $" + sales[i]);
                num++;
            }
        }
        System.out.println("Number of people with sales exceeding " + value + " is " + num);
    }
}