package org.futureCollars.lesson6.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public static void validate(String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if (pesel == null) {
            throw new IllegalArgumentException("PESEL cannot be null");
        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("PESEL must be exactly 11 characters long");
        }

        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);

        if (!matcher.matches()) {
            throw new WrongTypeOfDataException("PESEL must be of type String");
        }
    }
}
