package com.hipotetical.noreliablyapi.service;

import com.hipotetical.noreliablyapi.controller.DiscountRequest;
import com.hipotetical.noreliablyapi.controller.DiscountResponse;

public interface DiscountCalculator {
    DiscountResponse execute(DiscountRequest request);
}
