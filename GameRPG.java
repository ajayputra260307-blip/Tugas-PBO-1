/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg2.pkg3;

/**
//Nama : Fadhil Azhar Putra
//kelas : 2A informatika 
// npm : 2510631170058
 */
public class GameRPG {
    public static void main(String[] args) {

        Entity player = new Entity("Fadhil", 10000, 5000, 21);

        player.infoStatus();

        System.out.println();

        Knight knight = new Knight("Ogre", 2000, 500, 13, 300);

        knight.infoStatus();

    }

}
