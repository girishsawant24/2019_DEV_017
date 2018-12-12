import java.util.Scanner;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {

        int year;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter any year: ");
        year = sc.nextInt();
        if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
            System.out.format("\n %d is a Leap Year. \n", year);
        }
        else {
            System.out.format("\n %d is NOT a Leap Year. \n", year);
        }
    }
}
