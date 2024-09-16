/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial;

import java.util.*;

/**
 *
 * @author hikap
 */
class Mahasiswa {

    String nama;
    int umur;
    String jurusan;

    Mahasiswa(String inputNama, int inputUmur, String inputJurusan) {

        nama = inputNama;
        umur = inputUmur;
        jurusan = inputJurusan;

        System.out.println("Nama saya " + nama + " saya berumur " + umur + " saya dari jurusan " + jurusan);
    }
}

public class Constructorr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {

            String inputNama = sc.nextLine();
            int inputUmur = sc.nextInt();
            sc.nextLine();
            String inputJurusan = sc.nextLine();

            Mahasiswa mahasiswa1 = new Mahasiswa(inputNama, inputUmur, inputJurusan);
            

        }

    }
}
