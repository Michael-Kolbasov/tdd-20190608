package com.epam.tdd.services;

import com.epam.tdd.dao.SmurfDao;
import com.epam.tdd.enums.SmurfBrigade;
import com.epam.tdd.model.Smurf;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SmurfBrigadeServiceTest {

    private SmurfBrigadeServiceI smurfBrigadeServiceI = new SmurfBrigadeService();

    @InjectMocks
    private SmurfService smurfService = SmurfService.getInstance();

    @Mock
    private SmurfDao smurfDao;

    private List<Smurf> smurfs;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        smurfs = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            smurfs.add(new Smurf());
        }

        Mockito.when(smurfDao.findAll()).thenReturn(smurfs);
    }

    @Test
    public void testcalculateBrigades() {
        List<Smurf> smurfs = smurfService.findAll();

        Map<SmurfBrigade, List<Smurf>> smurfBrigadeListMap = smurfBrigadeServiceI.calculateBrigades(smurfs);

        for (Map.Entry<SmurfBrigade, List<Smurf>> brigades : smurfBrigadeListMap.entrySet()) {
            List<Smurf> calculatedSmurfs = brigades.getValue();
            assertNotNull(calculatedSmurfs);

            for (Smurf smurf : calculatedSmurfs) {
                SmurfBrigade brigade = brigades.getKey();
                assertThat(smurf.getTiredness(),
                        is(both(greaterThanOrEqualTo(brigade.getLowBorder()))
                                .and(lessThanOrEqualTo(brigade.getHighBOrder()))));
            }
        }
    }
}
