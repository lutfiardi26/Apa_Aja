import java.util.Scanner;
   
class BiodataMember {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Biodata Member ##");
    System.out.println("========================================");
    System.out.println();
     
    String Nama_Depan, Nama_Belakang, ID_Member, Alamat, Nomor_Telepon, Tahun_Bergabung;
  
    System.out.print("Nama Depan: ");
    Nama_Depan = input.nextLine();

    System.out.print("Nama Belakang: ");
    Nama_Belakang = input.nextLine();
     
    System.out.print("ID Member: ");
    ID_Member = input.nextLine();
     
    System.out.print("Alamat: ");
    Alamat = input.nextLine();
     
    System.out.print("Nomor Telepon: ");
    Nomor_Telepon = input.nextLine();
     
    System.out.print("Tahun Bergabung: ");
    Tahun_Bergabung = input.nextLine();
     
    System.out.println();
     
    System.out.println("# Data Member #");
    System.out.println("==================");
    System.out.println("Nama Depan: "       + Nama_Depan);
    System.out.println("Nama Belakang: "    + Nama_Belakang);
    System.out.println("ID Member: "        + ID_Member);
    System.out.println("Alamat: "           + Alamat);
    System.out.println("Nomor Telepon: "    + Nomor_Telepon);
    System.out.println("Tahun Bergabung: "  + Tahun_Bergabung);
    System.out.println(Nama_Depan + " " + Nama_Belakang + ", " + ID_Member + " \b dengan alamat di \b " + Alamat + " \b dan nomor telepon \b " + Nomor_Telepon + " \b dan menjadi member di prodase Rent Car sejak tahun \b " + Tahun_Bergabung);
  }
}