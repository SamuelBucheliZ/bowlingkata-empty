package com.zuehlke.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    @Test
    void createNewGame() {
        assertDoesNotThrow(Game::new);
    }

}
