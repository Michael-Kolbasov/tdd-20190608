package com.epam.tdd.services.com.epam.tdd.model;

import com.epam.tdd.model.Smurf;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmurfTest {

    @Test
    public void testInit() {
        for (int i = 0; i < 100; i++) {
            Smurf smurf = new Smurf();
            assertTrue(smurf.getTiredness() >= 0);
            assertTrue(smurf.getTiredness() <= 100);
        }
    }
}
