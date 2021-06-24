package com.hipotetical.noreliablyapi.controller;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DiscountRequest {
    private String course;
    private BigDecimal monthlyPayment;
}
