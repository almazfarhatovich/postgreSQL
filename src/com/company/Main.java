package com.company;

import com.company.dragon.DragonDao;
import com.company.hero.HeroDao;
import com.company.model.Dragon;
import com.company.model.Hero;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dragon dragon = new Dragon(2000,120,150,0);
        Hero hero = new Hero(1000,100,120,150,250);
        DragonDao dragonDao = new DragonDao(dragon);
        HeroDao heroDao = new HeroDao(hero);
        dragonDao.HP(hero,dragon);
        System.out.println("+--------------------------------------------------------------------------------+");
        heroDao.HP(hero,dragon);
        System.out.println("+--------------------------------------------------------------------------------+");
    }
}
