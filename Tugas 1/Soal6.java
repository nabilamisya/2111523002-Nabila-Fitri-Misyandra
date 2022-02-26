import java.util.ArrayList;
//Soal 6
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
//6. add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
public class Soal6 {
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("m");
        nama.add("i");
        nama.add("s");
        nama.add("y");
        
        nama.add(0,"e");
        System.out.println("Setelah ditambahkan string e ");
        System.out.println(nama);
        nama.add(2,"f");
        System.out.println("Setelah ditambahkan string f ");
        System.out.println(nama);
        nama.add(3,"g");
        System.out.println("Setelah ditambahkan string g ");
        System.out.println(nama);
        nama.add(4,"h");  
        System.out.println("Setelah ditambahkan string h ");
        System.out.println(nama);
        nama.add(6,"h");
        System.out.println("Setelah ditambahkan string h ");
        System.out.println(nama);
        nama.add(-3,"j");
        System.out.println("Setelah ditambahkan string j ");
        System.out.println(nama);
    }
}
