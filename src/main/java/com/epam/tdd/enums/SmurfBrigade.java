package com.epam.tdd.enums;

import com.epam.tdd.exceptions.DontMessWithSmurfException;
import com.epam.tdd.model.Smurf;
import lombok.Getter;

@Getter
public enum SmurfBrigade {
    LOW(0, 33),
    MEDIUM(34, 66),
    HIGH(67, 100);

    int lowBorder;
    int highBOrder;

    SmurfBrigade(int lowBorder, int highBOrder) {
        this.lowBorder = lowBorder;
        this.highBOrder = highBOrder;
    }
}
