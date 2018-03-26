package sample;

import java.io.FileWriter;

public class Character {

    public int hp=this.hp;
    public int defense = this.defense;
    public int armour = this.armour;
    public int attack = this.attack;
    public int stamina= this.stamina;


    public Character(int hp, int def, int armour, int attack, int stamina) {

    }

    public void Attack(Character enemy){
        if(this.attack > enemy.defense) {
            enemy.hp = enemy.hp - (this.attack - enemy.defense);
            //FileWriter write = new FileWriter();
            //todo file io to the char info file
        }
        else{//todo add output to UI for dmg dealt
             }
        return;



    }
    public void moves(Character enemy) {
        if (this.attack > enemy.defense) {
            enemy.hp = enemy.hp - (this.attack - enemy.defense);
            //FileWriter write = new FileWriter();
            //todo file io to the char info file
        }
        else {//todo add output to UI for dmg dealt
        }
        return;
    }

}
