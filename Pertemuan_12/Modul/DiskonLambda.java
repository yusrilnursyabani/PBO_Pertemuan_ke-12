/*  Nama File   : DiskonLamda.java
    Nama        : Moh Yusril Nur Syabani / 24060123140181
    Deskripsi   : Ekspresi lambda dasar, digunkanan untuk menghitung diskon
    Tanggal     : 23 Mei 2025 
*/

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda
        IDiskon diskonMerdekaLambda = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " +diskonMerdekaLambda.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " +diskonBiasa.hitungDiskon(45000));
    }
}

//Pertanyaan: Dapatkah anda membedakan antara bagaimana diskonLebaran dan diskonBiasa diimplementasikan?
/*Jawaban:
diskonBiasa diimplementasikan menggunakan anonymous class, yaitu cara tradisional
sebelum hadirnya ekspresi lambda. Dalam pendekatan ini, kita membuat objek dari interface Diskon dengan menuliskan seluruh struktur class anonim beserta implementasi
method-nya secara eksplisit. Cara ini cenderung lebih panjang dan tidak efisien untuk interface yang hanya memiliki satu method.

Sementara itu, diskonLebaran diimplementasikan menggunakan ekspresi lambda, yaitu cara yang lebih ringkas dan modern yang diperkenalkan sejak Java 8.
Dengan lambda, kita hanya perlu menuliskan parameter dan ekspresi perhitungannya, tanpa harus menuliskan seluruh struktur class anonim.
mendefinisikan ulang struktur class. Pendekatan ini hanya dapat digunakan jika interface yang digunakan merupakan functional interface—yaitu interface yang memiliki tepat satu method abstrak.

Dengan demikian, perbedaan utamanya terletak pada gaya penulisan dan efisiensi kode: diskonBiasa lebih verbose, sedangkan diskonLebaran lebih ringkas dan mudah dibaca.
*/