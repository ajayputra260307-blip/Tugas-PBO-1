/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg2.pkg3;

/**
 *
 * @author Fadhil Azhar Putra
 */
public class Entity implements InterfaceEntity {

    private String nama;

    private double hp;

    private double attack;
    private int level;

    public Entity(String nama, double hp, double attack, int level) {

        this.nama = nama;

        this.hp = hp + BASE_HP;

        this.attack = attack + BASE_ATTACK;
        this.level = level;

    }

    public void infoStatus() {

        System.out.println("Nama   : " + nama);
        System.out.println("Level  :  " + level);
        System.out.println("HP     : " + hp);

        System.out.println("Attack : " + attack);
        

    }

}