package com.hipotetical.noreliablyapi.service.impl;

import com.hipotetical.noreliablyapi.controller.DiscountRequest;
import com.hipotetical.noreliablyapi.controller.DiscountResponse;
import com.hipotetical.noreliablyapi.service.DiscountCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

@ExtendWith(MockitoExtension.class)
public class DiscountCalculatorImplTest {

    private DiscountCalculator discountCalculator;

    @Mock
    private BugInserter bugInserter;

    @BeforeEach
    public void setup() {
        discountCalculator = new DiscountCalculatorImpl(bugInserter);
    }

    @Test
    @DisplayName("Deve retornar os valores certos sem nenhum Bug")
    public void shouldReturnWithoutBugs() {
        final var request = DiscountRequest
                .builder()
                .course("History")
                .monthlyPayment(new BigDecimal(200.00))
                .build();
        final var responseReference = DiscountResponse
                .builder()
                .course("History")
                .monthlyPayment(new BigDecimal(200.00))
                .percentageDiscount(new BigDecimal(5.00))
                .discountedPayment(new BigDecimal(190.00))
                .build();
        Mockito.when(bugInserter.insertBug(Mockito.any())).thenReturn(responseReference);
        final var response = discountCalculator.execute(request);
        Assertions.assertEquals(response.getCourse(),responseReference.getCourse());;
        Assertions.assertEquals(response.getPercentageDiscount(),responseReference.getPercentageDiscount());
        Assertions.assertEquals(response.getDiscountedPayment(),responseReference.getDiscountedPayment());
        Assertions.assertEquals(response.getMonthlyPayment(),responseReference.getMonthlyPayment());
    }



}
