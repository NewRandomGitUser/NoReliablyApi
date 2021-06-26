package com.hipotetical.noreliablyapi.service.impl.bugs;

import com.hipotetical.noreliablyapi.controller.DiscountResponse;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;

@Slf4j
@Builder
public class Bug {
    public DiscountResponse insertBug(DiscountResponse response) {
        response.setDiscountedPayment(
                response.getDiscountedPayment()
                        .add(response.getMonthlyPayment()));
        return response;
    }
}