
package tutorial;


class Mhs {

    String nama;
    int umur;
    String jurusan;

    Mhs(String nama, String jurusan) {
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

        Mhs mahasiswa1 = new Mhs("Hikam", "MKB");
        System.out.println(mahasiswa1.nama);

        mahasiswa1.show();

        int umur = mahasiswa1.getUmur(14);
        System.out.println("umur : " + umur);
        System.out.println("umur : " + mahasiswa1.getUmur(30));
    }
}
