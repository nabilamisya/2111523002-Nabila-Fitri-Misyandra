import java.util.LinkedList;

public class linkedlist1
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        no_bp.add("2111523002");
        no_bp.add("2111523014");
        no_bp.add("2111522014");

        nama_mahasiswa.add("Nabila Fitri Misyandra");
        nama_mahasiswa.add("Adhisti Clara");
        nama_mahasiswa.add("Hanna Farida");

        alamat.add("Jln. Moh. Hatta No.27");
        alamat.add("Jln. Anggrek No.20");
        alamat.add("Jln. Anggrek No.1");

        System.out.println("Output Data Mahasiswa : ");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output add Data Mahasiswa : ");
        //menambahkan data mahasiswa
        no_bp.addFirst("2111522003");
        no_bp.addLast("2111521011");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.addFirst("Aurellia Vany");
        nama_mahasiswa.addLast("Karina Savita");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.addFirst("Jln. Ir. Soekarno No.1");
        alamat.addLast("Jln. Mawar No.15");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output remove Data Mahasiswa : ");
        //menghapus data mahasiswa
        no_bp.removeFirst();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        nama_mahasiswa.removeFirst();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        alamat.removeFirst();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output set Data Mahasiswa : ");
        //menyisipkan data mahasiswa
        no_bp.set(0,"2111522011");
        nama_mahasiswa.set(0,"Safira Zemira");
        alamat.set(0,"Jln. Hang Nadim No.14");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output get Data Mahasiswa : ");
        //mengambil data mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");

        System.out.println("Output pop Data Mahasiswa : ");
        //mengeluarkan daftar pertama data mahasiswa
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output push Data Mahasiswa : ");
        //menambahkan daftar pertama data mahasiswa
        nama_mahasiswa.push("Sarah Puspita");
        no_bp.push("2111521009");
        alamat.push("Jln. Melati No.6");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Output indeksOf Data Mahasiswa : ");
        //mencari indeks suatu data mahasiswa
        System.out.println(no_bp.indexOf("211523002"));
        System.out.println(nama_mahasiswa.indexOf("Hanna Farida"));
        System.out.println(alamat.indexOf("Jln. Melati No.6"));
    }
}