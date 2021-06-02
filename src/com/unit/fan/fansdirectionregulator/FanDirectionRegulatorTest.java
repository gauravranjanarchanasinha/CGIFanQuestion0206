package com.unit.fan.fansdirectionregulator;

import com.fan.fansdirectionregulator.AntiClockWiseDirectionRegulator;
import com.fan.fansdirectionregulator.FansDirection;
import com.fan.statustype.DirectionType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FanDirectionRegulatorTest {

    @Parameterized.Parameter(0)
    public String scenario;

    @Parameterized.Parameter(1)
    public FansDirection fansDirection;


    @Parameterized.Parameter(2)
    public DirectionType expectedDirectionType;

    @Parameterized.Parameters
    public static Iterable<Object[]> getScenarios() {
        return Arrays.asList(
                new Object[][]{
                        {"Fan State is clockwise And Pull is performed",
                                new FansDirection(),
                                DirectionType.ANTICLOCKWISE},
                        {"Fan State is Anticlockwise And Pull is performed",
                                new FansDirection(new AntiClockWiseDirectionRegulator()),
                                DirectionType.CLOCKWISE}});
    }

    @Test
    public void pull() {
        fansDirection.getFanDirectionRegulator().pull(fansDirection);
        assertEquals(expectedDirectionType.getDescription(), fansDirection.getFanDirectionRegulator().getPresentState());
    }


}