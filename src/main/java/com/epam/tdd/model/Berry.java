package com.epam.tdd.model;

import com.epam.tdd.enums.BerryColor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Berry {

    private BerryColor color;

    public Berry() {
        int random = (int) (Math.random() * 3);
        this.color = BerryColor.values()[random];
    }

}
