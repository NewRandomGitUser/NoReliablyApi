package com.hipotetical.noreliablyapi.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class DiscountRequest {
    private String course;
    private BigDecimal monthlyPayment;
}
