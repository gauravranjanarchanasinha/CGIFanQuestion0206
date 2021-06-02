package com.test.fan.fanspeedregulator;

import com.fan.fanspeedregulator.FanSpeed;
import com.fan.fanspeedregulator.HighSpeed;
import com.fan.fanspeedregulator.MediumSpeed;
import com.fan.fanspeedregulator.SlowSpeed;
import com.fan.statustype.SpeedType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FSpeedTest {

    @Parameterized.Parameter(0)
    public String scenario;

    @Parameterized.Parameter(1)
    public FanSpeed fanSpeed;

    @Parameterized.Parameter(2)
    public SpeedType expectedSpeedType;

    @Parameterized.Parameters
    public static Iterable<Object[]> getScenarios() {
        return Arrays.asList(
                new Object[][]{
                        {"Fan State is off And Pull is performed",
                                new FanSpeed(),
                                SpeedType.LOW},
                        {"Fan State is Low And Pull is performed",
                                new FanSpeed(new SlowSpeed()),
                                SpeedType.MEDIUM},
                        {"Fan State is medium And Pull is performed",
                                new FanSpeed(new MediumSpeed()),
                                SpeedType.HIGH},
                        {"Fan State is high And Pull is performed",
                                new FanSpeed(new HighSpeed()),
                                SpeedType.OFF}});
    }

    @Test
    public void pull() {
        fanSpeed.getfSpeed().pull(fanSpeed);
        assertEquals(expectedSpeedType.getFanStateDescription(), fanSpeed.getfSpeed().getPresentState());
    }

    @Override
    public String toString() {
        return "FSpeedTest{" +
                "scenario='" + scenario + '\'' +
                ", fanSpeed=" + fanSpeed +
                ", expectedSpeedType=" + expectedSpeedType +
                '}';
    }
}