package com.epam.tdd.enums;

import lombok.Getter;

@Getter
public enum BerryColor {
    RED(30),
    YELLOW(20),
    GREEN(10);

    private int collectCost;

    BerryColor(int collectCost) {
        this.collectCost = collectCost;
    }
}
