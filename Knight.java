/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg2.pkg3;

/**
 *
 * @author Fadhil Azhar Putra
 */
public class Knight extends Entity {

    private double defense;

    public Knight(String nama, double hp, double attack,int level, double defense) {

        super(nama, hp, attack, level);

        this.defense = defense;

    }

    public void infoStatus() {

        super.infoStatus();

        System.out.println("Defense: " + defense);

    }
}

