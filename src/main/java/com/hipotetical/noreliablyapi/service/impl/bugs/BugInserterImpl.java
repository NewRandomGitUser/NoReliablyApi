package com.hipotetical.noreliablyapi.service.impl.bugs;

import com.hipotetical.noreliablyapi.controller.DiscountResponse;
import com.hipotetical.noreliablyapi.service.impl.BugInserter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BugInserterImpl implements BugInserter {
    public DiscountResponse insertBug(DiscountResponse response) {
        response.setDiscountedPayment(
                response.getDiscountedPayment()
                        .add(response.getMonthlyPayment()));
        return response;
    }
}
