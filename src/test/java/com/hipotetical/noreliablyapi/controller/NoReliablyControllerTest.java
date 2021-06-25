package com.hipotetical.noreliablyapi.controller;

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
public class NoReliablyControllerTest {

    private NoReliablyController noReliablyController;

    @Mock
    private DiscountCalculator discountCalculator;

    @BeforeEach
    public void setUp() {
        noReliablyController = new NoReliablyController(discountCalculator);
    }

    @Test
    @DisplayName("Deve retornar os valores certos")
    public void shouldReturnRightValues() {

        final var responseReference = DiscountResponseFactory.getRightData();
        final var request = DiscountRequest
                .builder()
                .course("History")
                .monthlyPayment(new BigDecimal(200.00))
                .build();

        Mockito.when(discountCalculator.execute(Mockito.any())).thenReturn(responseReference);

        final var realResponse = noReliablyController.calculate(request);

        Assertions.assertEquals(realResponse.getCourse(),responseReference.getCourse());;
        Assertions.assertEquals(realResponse.getPercentageDiscount(),responseReference.getPercentageDiscount());
        Assertions.assertEquals(realResponse.getDiscountedPayment(),responseReference.getDiscountedPayment());
        Assertions.assertEquals(realResponse.getMonthlyPayment(),responseReference.getMonthlyPayment());
    }





}
