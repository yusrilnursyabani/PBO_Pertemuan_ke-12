import java.util.HashMap;
import java.util.Map;

public class MahasiswaMapLambda {
    public static void main(String[] args) {
        Map<String, String> dataMahasiswa = new HashMap<>();

        dataMahasiswa.put("24060123140191", "Moh Yusril Nur Syabani"); 

        dataMahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
