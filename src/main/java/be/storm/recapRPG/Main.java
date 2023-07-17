package be.storm.recapRPG;

public class Main {
    public static void main(String[] args) {


        Hero hero = new Hero();
        hero.setHpMax(100);
        hero.setCurrentHp(100);
        hero.setStrenght(10);
        hero.setName("Nobody");


        Monster monster = new Monster();
        monster.setHpMax(50);
        monster.setCurrentHp(50);
        monster.setStrenght(10);
        monster.setSize(1.80);

        while (hero.getCurrentHp() > 0 && monster.getCurrentHp() >0){
            hero.attack(monster);
            if (monster.getCurrentHp() > 0) {
                monster.attack(hero);
            }
        }

        hero.loot(monster);


    }
}
