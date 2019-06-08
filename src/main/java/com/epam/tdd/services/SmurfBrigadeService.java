package com.epam.tdd.services;

import com.epam.tdd.enums.SmurfBrigade;
import com.epam.tdd.model.Smurf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmurfBrigadeService implements SmurfBrigadeServiceI {

    @Override
    public Map<SmurfBrigade, List<Smurf>> calculateBrigades(List<Smurf> smurfs) {
        Map<SmurfBrigade, List<Smurf>> result = new HashMap<>();
        result.put(SmurfBrigade.LOW, new ArrayList<>());
        result.put(SmurfBrigade.MEDIUM, new ArrayList<>());
        result.put(SmurfBrigade.HIGH, new ArrayList<>());
        smurfs.forEach(Smurf::defineSmurfInBrigade);

        for (Smurf smurf : smurfs) {
            result.get(smurf.getSmurfBrigade())
                    .add(smurf);
        }
        return result;
    }
}
