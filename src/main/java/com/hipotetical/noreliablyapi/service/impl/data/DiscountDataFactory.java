package com.hipotetical.noreliablyapi.service.impl.data;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Builder
public class DiscountDataFactory {
    public static Map<String,BigDecimal> create() {
        Map<String, BigDecimal> discountMapping = new HashMap<String, BigDecimal>();
        discountMapping.put("History",new BigDecimal(5.00));
        discountMapping.put("Epistemology",new BigDecimal(4.50));
        discountMapping.put("Economics",new BigDecimal(20.00));
        discountMapping.put("Engineering",new BigDecimal(10.00));
        discountMapping.put("Mathematics",new BigDecimal(15.50));
        return discountMapping;
    }
}
