package com.company.model;

public class Hero {

    private int HP;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;

    public Hero() {
    }

    public Hero(int HP, int defence, int strength, int weapon, int shield) {
        this.HP = HP;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "Hero [ " +
                "HP: " + HP +
                " defence: " + defence +
                " strength: " + strength +
                " weapon: " + weapon +
                " shield: " + shield +
                " ]";
    }
}
