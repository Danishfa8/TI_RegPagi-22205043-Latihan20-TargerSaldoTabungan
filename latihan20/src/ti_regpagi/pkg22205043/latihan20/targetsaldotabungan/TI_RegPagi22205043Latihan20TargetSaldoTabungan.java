/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan20.targetsaldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : Program yang berisi menghitung lama tabungan mencapai saldo yang ditargetkan.
 */

public class TI_RegPagi22205043Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoAwal, bungaPerBulan, saldoTarget, bulan;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saldo awal: ");
        saldoAwal = scanner.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = scanner.nextInt();
        System.out.print("Saldo target: "); 
        saldoTarget = scanner.nextInt();
        
        NumberFormat formatter = new DecimalFormat("###,###");

        // Menghitung lama tabungan
        bulan = (saldoTarget - saldoAwal) / (saldoAwal * bungaPerBulan / 100);

        // Mencetak output
        System.out.println("Lama tabungan untuk mencapai saldo target adalah " + bulan + " bulan.");

        // Mencetak saldo tabungan setiap bulan
        for (int i = 1; i <= bulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            String formatSaldo = formatter.format(saldoAwal).replace(",", ".");
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + formatSaldo);
        }
    }
    
}
