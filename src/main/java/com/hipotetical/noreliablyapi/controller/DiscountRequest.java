package com.hipotetical.noreliablyapi.controller;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class DiscountRequest {
    private String course;
    private BigDecimal monthlyPayment;
}
