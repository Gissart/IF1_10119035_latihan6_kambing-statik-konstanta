//latihan 6 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-1
// Deskripsi  : mengakses variabel static string dan variabel static int
//	            yang berada di class Mamalia lalu menampilkan ke layar
package com.tugasPBO;

public class kambingStatic {
    public static final String Nama_Kambing = "MIDUN";
    public static void main(String[] args){
        mamalia.jumlahkambing = 485000;
        System.out.println(Nama_Kambing + " Memiliki kambing sebanyak " + mamalia.jumlahkambing);
    }
}
