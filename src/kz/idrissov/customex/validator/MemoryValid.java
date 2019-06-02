package kz.idrissov.customex.validator;

import kz.idrissov.customex.exception.OutOfMemoryException;

public class MemoryValid {
    public static boolean validator(int size, int max) throws OutOfMemoryException {
        if(size > max) {
            throw new OutOfMemoryException();
        }
        return true;
    }
}
