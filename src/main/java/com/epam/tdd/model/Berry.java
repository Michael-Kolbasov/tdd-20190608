package com.epam.tdd.model;

import com.epam.tdd.enums.BerryColor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Berry {

    private BerryColor color;

}
