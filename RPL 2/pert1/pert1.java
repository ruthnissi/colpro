import java.util.Scanner;


public class NewClass {

  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan nama Anda: ");
    String nama = input.nextLine();

    System.out.print("Masukkan umur Anda: ");
    int umur = input.next.Int();

    System.out.print("Masukkan NPM Anda: ");
    int npm = input.nextInt();

    System.out.println("Nama Anda adalah: " + nama);
    System.out.println("Umur Anda adalah: " + umur + " tahun");
    System.out.println("NPM Anda adalah: " + npm);
  }
}
