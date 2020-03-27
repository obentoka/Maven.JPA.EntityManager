package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pokemon_trainer")
public class PokemonTrainer {

    @Id
    private int trainerid;
    private int pokelevel;
    private int hp;
    private int maxhp;
    private int attack;
    private int defense;
    private int spatk;
    private int spdef;
    private int speed;
    private int pokemon_id;

    public PokemonTrainer() {
    }

    public PokemonTrainer(int trainerid, int pokelevel, int hp, int maxhp, int attack,
                          int defense, int spatk, int spdef, int speed, int pokemon_id) {
        this.trainerid = trainerid;
        this.pokelevel = pokelevel;
        this.hp = hp;
        this.maxhp = maxhp;
        this.attack = attack;
        this.defense = defense;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.pokemon_id = pokemon_id;
    }

    @Column(name = "trainerid")
    public int getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(int trainerid) {
        this.trainerid = trainerid;
    }

    @Column(name = "pokelevel")
    public int getPokelevel() {
        return pokelevel;
    }

    public void setPokelevel(int pokelevel) {
        this.pokelevel = pokelevel;
    }

    @Column(name = "hp")
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Column(name = "maxhp")
    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    @Column(name = "attack")
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Column(name = "defense")
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Column(name = "spatk")
    public int getSpatk() {
        return spatk;
    }

    public void setSpatk(int spatk) {
        this.spatk = spatk;
    }

    @Column(name = "spdef")
    public int getSpdef() {
        return spdef;
    }

    public void setSpdef(int spdef) {
        this.spdef = spdef;
    }

    @Column(name = "speed")
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Column(name = "pokemon_id")
    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    @Override
    public String toString() {
        return "PokemonTrainer{" +
                "trainerid=" + trainerid +
                ", pokelevel=" + pokelevel +
                ", hp=" + hp +
                ", maxhp=" + maxhp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spatk=" + spatk +
                ", spdef=" + spdef +
                ", speed=" + speed +
                ", pokemon_id=" + pokemon_id +
                '}';
    }
}
