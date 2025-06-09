/*  Nama File   : LambdaList.java
    Nama        : Moh Yusril Nur Syabani / 24060123140181
    Deskripsi   : Implementasi lambda pada List, digunakan sebagai parameter pada method
    Tanggal     : 23 Mei 2025
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}

