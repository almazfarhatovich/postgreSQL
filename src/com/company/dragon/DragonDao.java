package com.company.dragon;
import com.company.model.Dragon;
import com.company.model.Hero;

import java.util.Random;
import java.util.Scanner;

public class DragonDao implements DragonImpl {
    Dragon dragon;

    public DragonDao(Dragon dragon) {
        this.dragon = dragon;
    }

    @Override
    public void HP(Hero heroD, Dragon dragonD) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("АТАКА ГЕРОЯ");
        System.out.println("Выбор{ 1- атака. 2- защита. 3- нечего не делать");
        int a = scanner.nextInt();
        int b = random.nextInt(0,2);
        if (a == 1) {
            System.out.println("Атака:");
            if (b == 1) {
                int power = (dragonD.getHP() - (heroD.getStrength() + heroD.getWeapon())) + dragonD.getDefence();
                int ataka = heroD.getStrength() + heroD.getWeapon();
                System.out.println("Жизненная энергия: " + dragonD.getHP());
                System.out.println("Урон: " + ataka);
                System.out.println("Остаток энергия: " + power);
                if (power <= 0) {
                    System.out.println("Дракон умер! и Герой победил!");
                } else {
                    System.out.println(" 1 - раунд бутту!");
                }
            } else if (b == 0) {
                System.out.println("Не попал");
                System.out.println("1 - Раунд окончен");
            }

        }
        else if (a == 2){
            System.out.println("Защита:");
            heroD.setShield(0);
            System.out.println(heroD.getShield());
        }
        else if (a==3){
            System.out.println("Ничего не делать");
        }
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
}
