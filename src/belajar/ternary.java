/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar;
import java.util.Scanner;

/**
 *
 * @author hikap
 */
public class ternary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nilai;
        int y;
        String x;

        System.out.print("Masukan nilai: ");
        nilai = sc.nextInt();
        if (nilai <= 10) {
            while (nilai <= 15) {
                
                // Variabel x = (ekspresi) ? (true) : (false)
                y = (nilai > 10) ? (nilai * 100) : (nilai - 10);
                x = (nilai > 10) ? ("kamu benar") : ("Kamu salah");

                System.out.println(y);
                System.out.println(x);
                nilai++;

            }
        } else {
            System.out.println("NILAI SALAH");

        }

    }
}
