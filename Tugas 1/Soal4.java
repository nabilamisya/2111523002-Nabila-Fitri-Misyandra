import java.util.ArrayList;
//Soal4
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//4. indexOf(a),indexOf(c),indexOf(q)
public class Soal4
{
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("m");
        nama.add("i");
        nama.add("s");
        nama.add("y");

        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
    }
}
