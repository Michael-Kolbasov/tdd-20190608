package com.epam.tdd.enums;

import lombok.Getter;

@Getter
public enum SmurfSkill {
    VETERAN(50),
    EXPERIENCED(40),
    TEAPOT(30);

    private int restSeed;

    SmurfSkill(int restSeed) {
        this.restSeed = restSeed;
    }
}
