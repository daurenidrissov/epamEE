package kz.idrissov.customex.io;

import kz.idrissov.customex.validator.MemoryValid;
import kz.idrissov.customex.exception.OutOfMemoryException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Input {
    private static final int MAX_SIZE = 1000;
    public String readFile(String fileName) throws OutOfMemoryException {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            int size = data.length();
            MemoryValid.validator(size, MAX_SIZE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
