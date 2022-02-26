import java.util.ArrayList;
//Soal 3
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//3. get(0),get(2),get(6),get(-3)
public class Soal3 {
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("m");
        nama.add("i");
        nama.add("s");
        nama.add("y");

        System.out.println("Elemen ke 0 = " + nama.get(0));
        System.out.println("Elemen ke 2 = " + nama.get(2));
        System.out.println("Elemen ke 6 = " + nama.get(6));
        System.out.println("Elemen ke -3) = " + nama.get(-3));
    }
}