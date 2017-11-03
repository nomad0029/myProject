package com.company;

public class Main {

    public static void main(String[] args) {
	DarkElf hero = new DarkElf();
	DarkElf enemy = new DarkElf();
	enemy.name = "Разбойник";
	hero.setName();
	hero.getSecondWeapon();
	hero.talante(enemy);
	hero.getFirstWeapon();
	hero.getCharact();
	hero.removeSecondWeapon();
	hero.getCharact();
	hero.getSecondWeapon();
	hero.firstAttack(enemy);
	hero.secondtAttack(enemy);
	enemy.getFirstWeapon();
	hero.firstAttack(enemy);
	enemy.firstAttack(hero);
	hero.firstAttack(enemy);
	enemy.firstAttack(hero);
	hero.secondtAttack(enemy);
	hero.firstAttack(enemy);
	hero.secondtAttack(enemy);
	hero.getCharact();
    }
}
