package com.company.model;

public class Dragon {

    private int HP;
    private int defence;
    private int strength;
    private int weapon;

    public Dragon() {
    }

    public Dragon(int HP, int defence, int strength, int weapon) {
        this.HP = HP;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
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

    @Override
    public String toString() {
        return "Dragon[ " +
                "HP: " + HP +
                " defence: " + defence +
                " strength: " + strength +
                " weapon: " + weapon +
                " ]";
    }
}
