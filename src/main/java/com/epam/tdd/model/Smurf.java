package com.epam.tdd.model;

import com.epam.tdd.enums.SmurfSkill;
import com.epam.tdd.exceptions.DontMessWithSmurfException;
import lombok.Data;

@Data
public class Smurf {

    private SmurfSkill skill;

    private int tiredness;

    public Smurf() {
        int random = (int) (Math.random() * 3);
        this.skill = SmurfSkill.values()[random];
        this.tiredness = (int) (Math.random() * 100);
    }

    public Smurf(SmurfSkill skill) {
        if (skill == null) {
            throw new DontMessWithSmurfException("Smurf must have a skill");
        }
        this.skill = skill;
        this.tiredness = (int) (Math.random() * 100);
    }

    public void collectBerry() {

    }
}
