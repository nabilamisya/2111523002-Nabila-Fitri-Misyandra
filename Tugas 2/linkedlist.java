import java.util.LinkedList;
//Tugas 2 Struktur Data dan Algoritma
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("N");
        saya.add("a");
        saya.add("b");
        saya.add("i");
        saya.add("l");
        saya.add("a");
        saya.add("");
        saya.add("F");
        saya.add("i");
        saya.add("t");
        saya.add("r");
        saya.add("i");
        saya.add("");
        saya.add("M");
        saya.add("i");
        saya.add("s");
        saya.add("y");
        saya.add("a");
        saya.add("n");
        saya.add("d");
        saya.add("r");
        saya.add("a");
        
        System.out.println("Diketahui nama lengkap :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");

        //1. Add karakter lain yang anda inginkan
        saya.addFirst("D");
        saya.add(10,"H");
        saya.addLast("V");
        System.out.println("1. Output add karakter :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");

        //2. Sisipkan karakter lain yang anda inginkan
        saya.set(14,"J");
        saya.set(11,"x");
        System.out.println("2. Output sisip karakter :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");

        //3. Hapus beberapa karaker yang ingin anda hapus
        saya.removeFirst();
        saya.remove(22);
        saya.removeLast();
        System.out.println("3. Output hapus karakter :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");

        //4. Buat fungsi POP dan PUSH pada project anda
        saya.pop();
        System.out.println("4. Output POP : ");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");

        saya.push("N");
        System.out.println("4. Output PUSH :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");
    }
}