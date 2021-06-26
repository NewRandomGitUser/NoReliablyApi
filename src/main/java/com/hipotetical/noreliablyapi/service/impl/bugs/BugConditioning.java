package com.hipotetical.noreliablyapi.service.impl.bugs;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;

@Slf4j
public class BugConditioning {
    public static boolean verify() {
        final var currentSeconds = LocalTime.now().getSecond();
        if (currentSeconds % 5 == 4) {
            log.info("Bug será inserido");
            return true;
        }
        return false;
    }
}
