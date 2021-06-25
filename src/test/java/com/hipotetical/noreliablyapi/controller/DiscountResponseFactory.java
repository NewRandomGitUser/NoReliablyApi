package com.hipotetical.noreliablyapi.controller;

import java.math.BigDecimal;

public class DiscountResponseFactory {

    public static DiscountResponse getRightData() {
        return DiscountResponse
                .builder()
                .course("History")
                .monthlyPayment(new BigDecimal(200.00))
                .percentageDiscount(new BigDecimal(5.00))
                .discountedPayment(new BigDecimal(190.00))
                .build();
    }

}
