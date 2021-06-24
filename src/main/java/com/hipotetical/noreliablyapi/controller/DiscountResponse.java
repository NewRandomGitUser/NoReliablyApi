package com.hipotetical.noreliablyapi.controller;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class DiscountResponse {
    private String course;
    private BigDecimal monthlyPayment;
    private BigDecimal percentageDiscount;
    private BigDecimal discountedPayment;
}
