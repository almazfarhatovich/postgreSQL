package com.company.dragon;

import com.company.hero.HeroDao;
import com.company.model.Dragon;
import com.company.model.Hero;

public interface DragonImpl {

    void HP(Hero heroD, Dragon dragonD);

    void defence(Hero heroD, Dragon dragonD);

    void strength(Hero heroD, Dragon dragonD);

    void weapon(Hero heroD, Dragon dragonD);
}
