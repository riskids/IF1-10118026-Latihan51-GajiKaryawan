/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Riski Dwi Sabariyanto   
 * KELAS : IF 1
 * NIM   : 10118026
 * Deskripsi Program : Program ini untuk membuat perhitungan Gaji Karyawan.
 */
public class IF110118026Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
        
        Manager manager = new Manager();
        
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scn5.nextInt());
        
        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("NIK\t : "+manager.getNik());
        System.out.println("NAMA\t : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN\t : "+manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t : "+manager.gajiTotal());
    }
    
}
