/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial;

import java.util.*;

class Karyawan {

    String nama;
    String divisi;
    int umur;
    double gaji;

}

public class objectClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Karyawan karyawan1 = new Karyawan();

        for (int i = 0; i < 3; i++) {
            karyawan1.nama = sc.nextLine();
            karyawan1.divisi = sc.nextLine();
            karyawan1.umur = sc.nextInt();
            karyawan1.gaji = sc.nextDouble();

            System.out.println(karyawan1.nama);
            System.out.println(karyawan1.umur);
            System.out.println(karyawan1.divisi);
            System.out.println(karyawan1.gaji);

        }

    }

}
