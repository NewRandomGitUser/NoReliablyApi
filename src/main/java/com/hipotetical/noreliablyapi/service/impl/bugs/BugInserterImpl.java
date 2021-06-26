package com.hipotetical.noreliablyapi.service.impl.bugs;

import com.hipotetical.noreliablyapi.controller.DiscountResponse;
import com.hipotetical.noreliablyapi.service.impl.BugInserter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Slf4j
@Service
public class BugInserterImpl implements BugInserter {
    public DiscountResponse execute(DiscountResponse response) {
        final var currentSeconds = LocalTime.now().getSecond();
        if (currentSeconds % 5 == 4) {
            return Bug.builder().build().insertBug(response);
        }
        return response;
    }
}