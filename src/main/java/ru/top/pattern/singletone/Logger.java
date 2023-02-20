package ru.top.pattern.singletone;

public class Logger {

    private static volatile Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger != null) {
            return logger;
        }
        synchronized (Logger.class) {
            logger = new Logger();
        }
        return logger;
    }

    public void writeLog(String text) {
        System.out.println(text);
    }
}
