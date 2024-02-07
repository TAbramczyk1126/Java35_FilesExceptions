package org.futureCollars.lesson6.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void shouldDisplaySquareRootFromNumber() {
        //given
        double expected = 3;
        //when
        double result = SquareRoot.getSquareRoot(9);
        //then
        assertEquals(expected, result);
    }
}
