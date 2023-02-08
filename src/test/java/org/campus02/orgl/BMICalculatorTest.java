package org.campus02.orgl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180, 1.8);

    }

    @Test
    @DisplayName("Test Constructor")
    void testConstructor(){
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8,bmiCalculator.getHeightInMeters());

    }

    @Test
     void result() {
    }
}