package com.epam.tdd;

import com.epam.tdd.model.Smurf;
import com.epam.tdd.services.SmurfService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Smurf> all = SmurfService.getInstance().findAll();
        System.out.println(all);
    }
}
