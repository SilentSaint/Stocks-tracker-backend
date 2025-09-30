package com.rakshith.stocksbackend.domain.risk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RiskManager {
    private static final Logger log = LoggerFactory.getLogger(RiskManager.class);

    int calculateRiskAmountForCapital(int capital) {
        if(capital <= 0) {
            log.info("Cannot calculate risk for no capital");
            return 0;
        }
        log.info("Considering risk as 1% of the total capital");
        return (int) (capital * 0.01);
    }
}
