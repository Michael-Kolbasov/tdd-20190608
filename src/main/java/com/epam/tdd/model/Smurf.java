package com.epam.tdd.model;

import com.epam.tdd.enums.SmurfSkill;
import com.epam.tdd.exceptions.DontMessWithSmurfException;
import lombok.Data;

import java.util.Random;

@Data
public class Smurf {

    private SmurfSkill skill;

    private int anxiety;

    public Smurf() {
        Random random = new Random(37);
        int num = random.nextInt(3);
        this.skill = SmurfSkill.values()[num];
        this.anxiety = (int) (Math.random() * 100);
    }

    public Smurf(SmurfSkill skill) {
        if (skill == null) {
            throw new DontMessWithSmurfException("Smurf must have a skill");
        }
        this.skill = skill;
        this.anxiety = (int) (Math.random() * 100);
    }

    public void collectBerry() {

    }
}
