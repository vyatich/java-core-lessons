package ru.top.pattern.singletone;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.writeLog("Hello java");

        Logger logger1 = Logger.getInstance();
        logger1.writeLog("Write once Run anywhere");
    }
}
