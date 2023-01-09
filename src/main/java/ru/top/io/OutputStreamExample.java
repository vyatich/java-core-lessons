package ru.top.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {
        try(OutputStream outputStream = new ByteArrayOutputStream();) {
            outputStream.write(new byte[10]);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
