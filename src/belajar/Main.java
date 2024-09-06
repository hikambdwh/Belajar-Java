
package belajar;
import java.util.Scanner;
/**
 *
 * @author hikam
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        float paid = sc.nextFloat();
        float hasil = (float) hours * paid;
        String salary = String.format("%.2f", hasil);
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + salary);
        System.out.println("yeyy kamu benarr");
    }
    
}
