/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan35.oo.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Program Tunjangan
 */
public class Gaji {
    
    private double pokok,tunjangan,total;
    private String status;
    
    public void inputAwal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        pokok = sc.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) : ");
        status = sc.next();
        
    }
    
    public void outputAkhir() {
        hitungTotal();
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok : Rp. " + pokok);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + total);
        System.out.println("(Developed by : Lingga Purnama Al Hamdi) ");
    }
    
    private void hitungTunjangan() {
        tunjangan = (status.equalsIgnoreCase("Menikah") ? 0.35*pokok :0);
    }
    
    private void hitungTotal() {
        hitungTunjangan();
        total = tunjangan + pokok;
   }
}
