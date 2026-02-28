/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Fadhil Azhar Putra
 */
public class DemoNilai {
    public static void main(String[] args) {

        Nilai n = new Nilai();

        n.nim = "2510631170058";
        n.nama = "Fadhil Azhar Putra";
        n.nilaiAbsen = 100;
        n.nilaiTugas = 97;
        n.nilaiUTS = 95;
        n.nilaiUAS = 90;

        // menghitung nilai akhir
        n.Nilai();

        //dari blueprint di class nilai
        n.CetakNilai();
    }
}
