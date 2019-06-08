package com.epam.tdd.model;

import com.epam.tdd.exceptions.DontMessWithSmurfException;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Smurf {

    private int skill;

    private int anxiety;

    public Smurf(int skill) {
        if (skill < 0 || skill > 10) {
            throw new DontMessWithSmurfException("Skill can't be less than 0 or more than 10");
        }
        this.skill = skill;
        this.anxiety = (int) (Math.random() * 100);
    }

    public void service() {

    }
}
