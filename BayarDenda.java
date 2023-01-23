import java.util.Scanner;

public class BayarDenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, idMember;
        int tanggalPinjam, bulanPinjam, tahunPinjam, tanggalKembali, bulanKembali, tahunKembali, lamaPeminjaman, telat, denda;
        final int MAKSIMAL_HARI = 10, DENDA_PER_HARI = 250000;
        
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("ID Member: ");
        idMember = input.nextLine();
        System.out.print("Tanggal Pinjam (hh-bb-tttt): ");
        tanggalPinjam = input.nextInt();
        bulanPinjam = input.nextInt();
        tahunPinjam = input.nextInt();
        System.out.print("Tanggal Kembali (hh-bb-tttt): ");
        tanggalKembali = input.nextInt();
        bulanKembali = input.nextInt();
        tahunKembali = input.nextInt();
        
        lamaPeminjaman = (tahunKembali - tahunPinjam) * 365 + (bulanKembali - bulanPinjam) * 30 + (tanggalKembali - tanggalPinjam);
        if (lamaPeminjaman > MAKSIMAL_HARI) {
            telat = lamaPeminjaman - MAKSIMAL_HARI;
            denda = telat * DENDA_PER_HARI;
            System.out.println("Nama = " + nama);
            System.out.println("ID Member = " + idMember);
            System.out.println("Tanggal Pinjam = " + tanggalPinjam + "-" + bulanPinjam + "-" + tahunPinjam);
            System.out.println("Tanggal Kembali = " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);
            System.out.println("Lama Peminjaman = " + lamaPeminjaman + " hari");
            System.out.println("Telat = " + telat + " hari");
            System.out.println("Denda = Rp" + denda);
        } else {
            System.out.println("Nama = " + nama);
            System.out.println("ID Member = " + idMember);
            System.out.println("Tanggal Pinjam = " + tanggalPinjam + "-" + bulanPinjam + "-" + tahunPinjam);
            System.out.println("Tanggal Kembali = " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);
            System.out.println("Lama Peminjaman = " + lamaPeminjaman + " hari");
            System.out.println("Tidak ada denda");
        }
    }
}