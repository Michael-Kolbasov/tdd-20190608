package com.epam.tdd.services;

import com.epam.tdd.enums.SmurfBrigade;
import com.epam.tdd.model.Smurf;

import java.util.List;
import java.util.Map;

public interface SmurfBrigadeServiceI {
    Map<SmurfBrigade, List<Smurf>> calculateBrigades(List<Smurf> smurfs);
}
