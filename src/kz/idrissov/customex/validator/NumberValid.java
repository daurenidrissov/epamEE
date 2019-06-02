package kz.idrissov.customex.validator;

import kz.idrissov.customex.exception.NotNumberException;

public class NumberValid {
    public static boolean validator(String num) throws NotNumberException {
        for(int i = 0; i < num.length(); i++) {
            if(!(num.charAt(i) == '.' || num.charAt(i) == ',' || Character.isDigit(num.charAt(i)))) {
                throw new NotNumberException("that is not a number");
            }
        }
        return true;
    }
}
