package com.hipotetical.noreliablyapi.controller;


import com.hipotetical.noreliablyapi.service.DiscountCalculator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class NoReliablyController {

    private final DiscountCalculator discountCalculator;

    @GetMapping
    DiscountResponse calculate(@ModelAttribute DiscountRequest request) {
        return discountCalculator.execute(request);
    }
}
