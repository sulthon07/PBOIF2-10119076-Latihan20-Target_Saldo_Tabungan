/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan20.target.saldo.tabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akml
 * Kelas : IF2
 * NIM : 10119076
 */
public class PBOIF210119076Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1;
        String hasil;
        float bunga;
        double saldoAwal, saldoTarget,saldo;
        
        System.out.print("Saldo Awal    : Rp. ");
        saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%)    : ");
        bunga=input.nextFloat();
        System.out.print("Saldo Target    : Rp. ");
        saldoTarget = input.nextDouble();
        
        bunga = (float) (bunga/100);
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        
        while (i < saldoTarget){
            
        
        
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldo));
            saldoAwal = saldo;
            if (saldoAwal >= saldoTarget ){
                break;
               }i++;
            }
        System.out.println("=================================");
        System.out.println("Developed by Sulthon Naufal Akmal");
    }
}
           

