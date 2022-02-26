import java.util.ArrayList;
//Soal 2
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini : 2. Size
public class Soal2 {
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("m");
        nama.add("i");
        nama.add("s");
        nama.add("y");

        System.out.println("Panjang array adalah : ");
        System.out.println(nama.size());
    }
}
