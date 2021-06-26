package com.hipotetical.noreliablyapi.service.impl;

import com.hipotetical.noreliablyapi.controller.DiscountRequest;
import com.hipotetical.noreliablyapi.controller.DiscountResponse;
import com.hipotetical.noreliablyapi.service.DiscountCalculator;
import com.hipotetical.noreliablyapi.service.impl.bugs.BugConditioning;
import com.hipotetical.noreliablyapi.service.impl.data.DiscountDataFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
public class DiscountCalculatorImpl implements DiscountCalculator {

    private final BugInserter bugInserter;

    public DiscountResponse execute(DiscountRequest request) {
        final var discountData = DiscountDataFactory.create();

        final var discountPercentage = discountData.get(request.getCourse());

        final var discount =  request
                .getMonthlyPayment()
                .multiply(discountPercentage)
                .divide(new BigDecimal(100));

        final var discountPayment = request
                .getMonthlyPayment()
                .subtract(discount);

        final var response = DiscountResponse
                .builder()
                .course(request.getCourse())
                .monthlyPayment(request.getMonthlyPayment())
                .percentageDiscount(discountPercentage)
                .discountedPayment(discountPayment)
                .build();

        if(BugConditioning.verify())
            return bugInserter.insertBug(response);

        return response;
    }
}
