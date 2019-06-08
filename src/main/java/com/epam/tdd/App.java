package com.epam.tdd;

import com.epam.tdd.model.Berry;
import com.epam.tdd.model.Smurf;
import com.epam.tdd.services.SmurfService;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Smurf> smurfs = SmurfService.getInstance().findAll();
    private List<Berry> berries;

    {
        berries = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            Berry berry = new Berry();
            berries.add(berry);
        }
    }

    public static void main(String[] args) {
        App app = new App();


    }
}
