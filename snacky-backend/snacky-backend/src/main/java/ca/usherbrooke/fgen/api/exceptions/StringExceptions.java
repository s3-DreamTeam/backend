package ca.usherbrooke.fgen.api.exceptions;

public class StringExceptions {

    public static Boolean isStringTooLong(String string, Integer maxLength) {
        return string.length() > maxLength;
    }

    public static Boolean stringContains(String string, char character) {
        return string.indexOf(character) != -1;
    }

    public static Boolean isStringGood(String string) {
        return !isStringTooLong(string, 50) && !stringContains(string, ';');
    }
}
