package com.company.hero;

import com.company.model.Dragon;
import com.company.model.Hero;

import java.util.Random;
import java.util.Scanner;

public class HeroDao implements HeroImpl {
    Hero hero;


    public HeroDao(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void HP(Hero heroD, Dragon dragonD) {
        System.out.println("АТАКА ДРАКОНА");

        Random random = new Random();


        int a = random.nextInt(0, 2);

        int b = random.nextInt(0, 2);

            if (b == 1) {
                if (a == 1) {
                    modifyHealth(hero);
                    int power = (heroD.getHP() - (dragonD.getStrength() + dragonD.getWeapon())) + heroD.getDefence();
                    int atak = dragonD.getStrength() + dragonD.getWeapon();
                    System.out.println("Жизненная энергия: " + heroD.getHP());
                    System.out.println("Урон: " + atak);
                    System.out.println("Остаток энергия: " + power);

                    if (power <= 0) {
                        System.out.println("Герой умер! и Игра окончена!");
                    } else {
                        System.out.println(" 2 - раунд бутту!");
                    }
                } else if (a == 0) {
                    System.out.println("Спал!");
                }
            } else if (b == 0) {
                System.out.println("Огненный шар!!!!!");
                int power = (heroD.getHP() - ((dragonD.getStrength() + dragonD.getWeapon()) * 2)) + heroD.getDefence();
                int atak = (dragonD.getStrength() + dragonD.getWeapon());
                System.out.println("Жизненная энергия: " + heroD.getHP());
                System.out.println("Урон: " + atak);
                System.out.println("Остаток энергия: " + power);

                if (power <= 0) {
                    System.out.println("Герой умер! и Игра окончена!");
                } else {
                    System.out.println(" 2 - раунд бутту!");
                }
            }

    }

    public static void modifyHealth(Hero hero1) {
        hero1.setHP(hero1.getHP() + 500);
    }

    @Override
    public void defence(Hero heroD, Dragon dragonD) {

    }

    @Override
    public void strength(Hero heroD, Dragon dragonD) {

    }

    @Override
    public void weapon(Hero heroD, Dragon dragonD) {

    }

    @Override
    public void shield(Hero heroD, Dragon dragonD) {

    }
}
