package com.epam.tdd.model;

import com.epam.tdd.enums.SmurfBrigade;
import com.epam.tdd.enums.SmurfSkill;
import com.epam.tdd.exceptions.DontMessWithSmurfException;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "smurfs")
public class Smurf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column(name = "qualification")
    @Enumerated(EnumType.STRING)
    private SmurfSkill skill;

    @Column
    private int tiredness;

    private SmurfBrigade smurfBrigade;

    public Smurf() {
        int random = (int) (Math.random() * 3);
        this.skill = SmurfSkill.values()[random];
        this.tiredness = (int) (Math.random() * 100);
    }

    public Smurf(String name, SmurfSkill skill) {
        if (skill == null) {
            throw new DontMessWithSmurfException("Smurf must have a skill");
        }
        this.name = name;
        this.skill = skill;
        this.tiredness = (int) (Math.random() * 100);
    }

    public Smurf(SmurfSkill skill) {
        if (skill == null) {
            throw new DontMessWithSmurfException("Smurf must have a skill");
        }
        this.skill = skill;
        this.tiredness = (int) (Math.random() * 100);
    }

    public void collectBerry(Berry berry) {
        int collectCost = berry.getColor().getCollectCost();
        this.tiredness -= collectCost;
    }

    public static void defineSmurfInBrigade(Smurf smurf) {
        int tiredness = smurf.getTiredness();
        if (tiredness >= SmurfBrigade.LOW.getLowBorder() && tiredness <= SmurfBrigade.LOW.getHighBOrder()) {
            smurf.setSmurfBrigade(SmurfBrigade.LOW);
        } else if (tiredness >= SmurfBrigade.MEDIUM.getLowBorder() && tiredness <= SmurfBrigade.MEDIUM.getHighBOrder()) {
            smurf.setSmurfBrigade(SmurfBrigade.MEDIUM);
        } else if (tiredness >= SmurfBrigade.HIGH.getLowBorder() && tiredness <= SmurfBrigade.HIGH.getHighBOrder()) {
            smurf.setSmurfBrigade(SmurfBrigade.HIGH);
        } else {
            throw new DontMessWithSmurfException("Don't mess with smurfs!");
        }
    }
}
