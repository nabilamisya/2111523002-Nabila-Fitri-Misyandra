import java.util.ArrayList;
// Soal 5
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :
//5. remove(0), remove(3), remove(2)
public class Soal5 
{
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        
        nama.add("m");
        nama.add("i");
        nama.add("s");
        nama.add("y");
        System.out.println("ArrayList sebelum remove:");
        for(String var : nama)
        {
             System.out.println(var);
        }

        nama.remove(0);
        //nama.remove(3);
        nama.remove(2);
        System.out.println("ArrayList sesudah remove:");
           for(String var1 : nama)
           {
                 System.out.println(var1);
           }
    }
}
