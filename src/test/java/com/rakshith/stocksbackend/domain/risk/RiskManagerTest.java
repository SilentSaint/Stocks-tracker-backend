package com.rakshith.stocksbackend.domain.risk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiskManagerTest {
    
    @Test
    @DisplayName("Calculate risk for a given captial")
    void testTotalRiskForCapital() {
        RiskManager riskManager = new RiskManager();
        int totalRisk = riskManager.calculateRiskAmountForCapital(100000);
        assertEquals(1000, totalRisk);
    }

}
