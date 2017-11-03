package com.company;

import java.util.Scanner;

public class DarkElf {
    Scanner sc = new Scanner(System.in);
    String name;
    int health = 100;
    int magic = 80;
    int firstDamage = 3;
    int secondDamage = 3;

    public void setName() {
        System.out.println("А кто ты, Данмер?");
        String name = sc.nextLine();
        this.name = name;
    }
    public void getHealth(){
        if(health < 0){
            health = 0;
            if(health ==0){
                System.out.println(name+" Мёртв");
            }
        }
        else if(health ==0){
            System.out.println(name+" Мёртв");
        }
        else if(health>0){
            System.out.println("Здоровье "+name+": "+health);
        }
    }
    public void getCharact(){
        System.out.println("Имя: "+name);
        System.out.println("Здоровье: "+health);
        System.out.println("Магия: "+magic);
        System.out.println("Правый Урон: "+firstDamage);
        System.out.println("Левый Урон: "+secondDamage);
    }
    public void talante(DarkElf a){
        a.health = a.health - 30;
        System.out.println(name+" использует 'Гнев Предков'");
        System.out.println(name+" нанёс "+a.name+" "+firstDamage+" очков урона");
        a.getHealth();
    }
    public void getFirstWeapon(){
        this.firstDamage =firstDamage + 20;
        System.out.println(name+" взял в руки 'Призрачный меч' правый урон: "+this.firstDamage);
    }
    public void getSecondWeapon(){
        this.secondDamage = secondDamage + 15;
        this.secondDamage = secondDamage;
        System.out.println(name+" взял в руки 'Огненная стрела' левый урон: "+this.secondDamage);
    }
    public void removeFirstWeapon(){
        this.firstDamage=firstDamage-20;
        System.out.println(name+" взял в руки 'Призрачный меч' правый урон: "+this.firstDamage);
    }
    public void removeSecondWeapon(){
        this.secondDamage=secondDamage-15;
        System.out.println(name+" убрал 'Огненная стрела' левый урон: "+this.secondDamage);
    }

    public void firstAttack(DarkElf a){
        a.health = a.health - firstDamage  ;
        System.out.println(name+" нанёс "+a.name+" "+firstDamage+" очков урона");
        a.getHealth();
    }
    public void secondtAttack(DarkElf a){
        a.health = a.health - secondDamage  ;
        magic = magic - 10;
        System.out.println(name+", нанёс "+a.name+" "+firstDamage+" очков урона");
        a.getHealth();
    }
}
