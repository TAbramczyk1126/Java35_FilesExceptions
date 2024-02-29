package org.futureCollars.lesson6.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    void validateCorrectPesel() {
        try {
            PeselValidator.validate("12345678901");
            System.out.println("Pesel is correct");
        } catch (WrongTypeOfDataException | IllegalLengthException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    void validateNullPesel() {
        assertThrows(IllegalArgumentException.class, () -> {
            PeselValidator.validate(null);
        });
    }

    @Test
    void validateInvalidLengthPesel() {
        assertThrows(IllegalLengthException.class, () -> {
            PeselValidator.validate("1234567890");
        });
    }

    @Test
    void validateNonNumericPesel() {
        assertThrows(WrongTypeOfDataException.class, () -> {
            PeselValidator.validate("12345678w01");
        });
    }
}
