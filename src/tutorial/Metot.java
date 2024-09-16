/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial;

/**
 *
 * @author hikap
 */
class Mahasiswa {

    String nama;
    int umur;
    String jurusan;

    Mahasiswa(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;

    }

    // Method tanpa parameter
    void show() {

        System.out.println("nama : " + this.nama + "\njurusan : " + this.jurusan);

    }

    // Method dengan parameter
    int getUmur(int umur) {

        this.umur = umur;
        return this.umur;

    }
}

public class Metot {

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Hikam", "MKB");
        System.out.println(mahasiswa1.nama);

        mahasiswa1.show();

        int umur = mahasiswa1.getUmur(14);
        System.out.println("umur : " + umur);
        System.out.println("umur : " + mahasiswa1.getUmur(30));
    }
}
