import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Integer angka;
        int i=0;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        Scanner pilih = new Scanner(System.in);

        System.out.println("Pilihan Operasi Queue");
        do{
            System.out.println("1. Masukkan Antrian ");
            System.out.println("2. Keluaran Antrian ");
            System.out.println("3. Ambil Antrian Teratas ");
            System.out.println("4. Cek Antrian ");
            System.out.println("5. Tampilkan Queue");
            System.out.println("6. Selesai");
            System.out.print("Masukkan Pilihan [1-6]: ");
            int input=pilih.nextInt();
            switch(input){
                case 1:
                    System.out.print("Banyak data yang ditambah : ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan angka : ");
                        angka=pilih.nextInt();
                        antrian.add(angka);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Keluaran : "+antrian);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Ambil Antrian : "+antrian.poll());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Elemen paling awal/depan : "+antrian.peek());
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Cek Antrian : "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Tampilan Queue : "+antrian);
                    System.out.println("");
                    break;

                case 6:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan tidak tersedia!");
                System.out.println("");
            }
        }
        while(bool);
    }
}