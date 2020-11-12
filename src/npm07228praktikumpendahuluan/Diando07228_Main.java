/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm07228praktikumpendahuluan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author CLIENT
 */
public class Diando07228_Main {
    static ArrayList <Diando07228_EntityMahasiswa> Diando07228_dataMahasiswa = new ArrayList();
    static Scanner Diando07228_input = new Scanner(System.in);
    static int Diando07228_pil, Diando07228_jurusan;
    static String Diando07228_npm, Diando07228_nama, Diando07228_notelp, Diando07228_pass;
    static Date Diando07228_tglLahir;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Selamat Datang di Aplikasi Pendataan Mahasiswa !!");
        do{
            System.out.println("1. Pendaftaran Mahasiswa");
            System.out.println("2. Lihat data Mahasiswa");
            System.out.println("3. Edit data Mahasiswa");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Exit \nMasukkan pilihan= ");
            Diando07228_pil = Diando07228_input.nextInt();
            switch(Diando07228_pil) {
                case 1:
                    Pendaftaran();
                    break;
                case 2:
                    System.out.println("\n");    
                    viewDataMahasiswa();
                    break;
                case 3:
                    EditDataMahasiswa();
                    break;
                case 4:
                    HapusDataMahasiswa();
                    break;
            }
        } while( Diando07228_pil != 5 );
    }
    
    static void Pendaftaran() {
        System.out.println("Input NPM = ");
        Diando07228_npm = Diando07228_input.next();
        System.out.println("Input Nama Mahasiswa = ");
        Diando07228_nama = Diando07228_input.next();
        System.out.println("Input Tanggal Lahir = (tanggal/bulan/tahun)" );
        Diando07228_tglLahir = new Date(Diando07228_input.next());
        System.out.println("Input No. Telp Mahasiswa = ");
        Diando07228_notelp = Diando07228_input.next();
        System.out.println("Input Password = ");
        Diando07228_pass = Diando07228_input.next();
        for( int i = 0; i < Diando07228_EntityJurusan.Diando07228_jurusan.length; i++ ) {
            System.out.println(i+". "+Diando07228_EntityJurusan.Diando07228_jurusan[i]);
        }
        System.out.println("Pilih Jurusan = ");
        Diando07228_jurusan = Diando07228_input.nextInt();
        Diando07228_dataMahasiswa.add(new Diando07228_EntityMahasiswa(Diando07228_nama, Diando07228_tglLahir, 
                                    Diando07228_npm, Diando07228_pass, Diando07228_jurusan, Diando07228_notelp));
        System.out.println("Data Berhasil DiTambahkan");
    }
    
    static void viewDataMahasiswa() {
        for( int i = 0; i < Diando07228_dataMahasiswa.size(); i++ ) {
            System.out.println(i+".\n"+Diando07228_dataMahasiswa.get(i).getNpm()+"\n"+
                                    Diando07228_dataMahasiswa.get(i).getNama()+"\n"+
                               Diando07228_EntityJurusan.Diando07228_jurusan[Diando07228_dataMahasiswa.get(i).getJurusan()]);
        }
    }
    
    static void EditDataMahasiswa() {
        for( int i = 0; i < Diando07228_dataMahasiswa.size(); i++ ) {
            System.out.println(i+". "+Diando07228_dataMahasiswa.get(i).getNpm()+" "+
                                    Diando07228_dataMahasiswa.get(i).getNama()+" "+
                                Diando07228_EntityJurusan.Diando07228_jurusan[Diando07228_dataMahasiswa.get(i).getJurusan()]);
        }
        System.out.println("Pilih Angka untuk Edit Data : ");
        Diando07228_pil = Diando07228_input.nextInt();
        for( int i = 0; i < Diando07228_dataMahasiswa.size(); i++ ){
            System.out.println("1. NPM : "+Diando07228_dataMahasiswa.get(i).getNpm());
            System.out.println("2. Nama Mahasiswa: "+Diando07228_dataMahasiswa.get(i).getNama());
            System.out.println("3. Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyy").format(Diando07228_dataMahasiswa.get(i).getTanggalLahir()));
            System.out.println("4. No. Telp Mahasiswa: "+Diando07228_dataMahasiswa.get(i).getNoTelp());
            System.out.println("5. Password : "+Diando07228_dataMahasiswa.get(i).getPassword());
            System.out.println("6. Jurusan : "+Diando07228_EntityJurusan.Diando07228_jurusan[Diando07228_dataMahasiswa.get(i).getJurusan()]);
            System.out.println("Pilih Angka untuk Data yang ingin diubah : ");
           Diando07228_pil = Diando07228_input.nextInt();
            switch(Diando07228_pil) {
                case 1:
                    System.out.println("NPM Sekarang : "+Diando07228_dataMahasiswa.get(i).getNpm());
                    System.out.println("Masukkan NPM Baru : ");
                    Diando07228_npm = Diando07228_input.next();
                    Diando07228_dataMahasiswa.get(i).Diando07228_npm = Diando07228_npm;
                    break;
                case 2:
                    System.out.println("Nama Sekarang : "+Diando07228_dataMahasiswa.get(i).getNama());
                    System.out.println("Masukkan Nama Baru : ");
                    Diando07228_nama = Diando07228_input.next();
                    Diando07228_dataMahasiswa.get(i).Diando07228_nama = Diando07228_nama;
                    break;
                case 3:
                    System.out.println("Tanggal lahir Sekarang : "+Diando07228_dataMahasiswa.get(i).getTanggalLahir());
                    System.out.println("Masukkan Tanggal Lahir Baru : ");
                    Diando07228_tglLahir = new Date(Diando07228_input.next());
                    Diando07228_dataMahasiswa.get(i).Diando07228_tanggal_lahir = Diando07228_tglLahir;
                    break;
                case 4:
                    System.out.println("No Telpon  Sekarang : "+Diando07228_dataMahasiswa.get(i).getNoTelp());
                    System.out.println("Masukkan No telpon baru : ");
                    Diando07228_notelp = Diando07228_input.next();
                    Diando07228_dataMahasiswa.get(i).Diando07228_notelp = Diando07228_notelp;
                    break;
                case 5:
                    System.out.println("Password Sekarang : "+Diando07228_dataMahasiswa.get(i).getPassword());
                    System.out.println("Masukkan Password Baru : ");
                    Diando07228_pass = Diando07228_input.next();
                    Diando07228_dataMahasiswa.get(i).Diando07228_pass = Diando07228_pass;
                    break;
                case 6:
                    for( int j = 0; j < Diando07228_EntityJurusan.Diando07228_jurusan.length; j++ ) {
                        System.out.println(j+". "+Diando07228_EntityJurusan.Diando07228_jurusan[j]);
                    }
                    System.out.println("Jurusan Sekarang : "+Diando07228_EntityJurusan.Diando07228_jurusan[Diando07228_dataMahasiswa.get(i).getJurusan()]);
                    System.out.println("Pilih Jurusan = ");
                    Diando07228_jurusan = Diando07228_input.nextInt();
                    Diando07228_dataMahasiswa.get(i).Diando07228_jurusan = Diando07228_jurusan;
                    break;
            }
            System.out.println("Data Berhasil DiEdit");
        }
    }
    
    static void HapusDataMahasiswa() {
        for( int i = 0; i < Diando07228_dataMahasiswa.size(); i++ ) {
            System.out.println(i+". "+Diando07228_dataMahasiswa.get(i).getNpm()+" "+Diando07228_dataMahasiswa.get(i).getNama()+" "+
                               Diando07228_EntityJurusan.Diando07228_jurusan[Diando07228_dataMahasiswa.get(i).getJurusan()]);
        }
        System.out.println("Pilih Angka untuk Hapus Data : ");
        Diando07228_pil = Diando07228_input.nextInt();
       Diando07228_dataMahasiswa.remove(Diando07228_dataMahasiswa.get(Diando07228_pil));
        System.out.println("Data Berhasil Dihapus");
    }
}
