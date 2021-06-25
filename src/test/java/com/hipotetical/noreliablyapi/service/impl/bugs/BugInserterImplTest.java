package com.hipotetical.noreliablyapi.service.impl.bugs;

import com.hipotetical.noreliablyapi.service.impl.BugInserter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BugInserterImplTest {

    private BugInserter bugInserter;

    @BeforeEach
    public void setup() {
        bugInserter = new BugInserterImpl();
    }

    @Test
    @DisplayName("Deve retornar sem bugs")
    public void shouldReturnWithoutBugs() {

    }




}
