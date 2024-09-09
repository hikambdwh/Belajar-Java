
package tutorial;
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
        double paid = sc.nextFloat();
        double hasil = (double) hours * paid;
        String salary = String.format("%.2f", hasil);
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + salary);
        System.out.println("yeyy kamu benarr");
        System.out.println("ayooo coba lagi");
    }
    
}
